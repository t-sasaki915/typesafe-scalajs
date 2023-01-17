FROM sbtscala/scala-sbt:eclipse-temurin-17.0.4_1.8.0_3.2.1 as builder

WORKDIR /work/build

COPY core core
COPY dom dom
COPY examples examples
COPY renderer renderer
COPY project project
COPY build.sbt .

RUN sbt fastLinkJS

WORKDIR /work/build/out

RUN cp /work/build/examples/target/scala-3.2.1/typesafe-scalajs-examples-fastopt/main.js* .
RUN cp /work/build/examples/src/main/resources/index.html .

FROM nginx:1.23-alpine

COPY --from=builder /work/build/out /usr/share/nginx/html
