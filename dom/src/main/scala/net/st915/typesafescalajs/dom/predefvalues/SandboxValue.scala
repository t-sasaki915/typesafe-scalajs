package net.st915.typesafescalajs.dom.predefvalues

object SandboxValue {

  case object AllowForms extends SandboxValue("allow-forms")
  case object AllowModals extends SandboxValue("allow-modals")
  case object AllowOrientationLock extends SandboxValue("allow-orientation-lock")
  case object AllowPointerLock extends SandboxValue("allow-pointer-lock")
  case object AllowPopups extends SandboxValue("allow-popups")
  case object AllowPopupsToEscapeSandbox extends SandboxValue("allow-popups-to-escape-sandbox")
  case object AllowPresentation extends SandboxValue("allow-presentation")
  case object AllowSameOrigin extends SandboxValue("allow-same-origin")
  case object AllowScripts extends SandboxValue("allow-scripts")
  case object AllowTopNavigation extends SandboxValue("allow-top-navigation")
  case object AllowTopNavigationByUserActivation
      extends SandboxValue("allow-top-navigation-by-user-activation")

}

sealed class SandboxValue(val raw: String) extends PredefValue
