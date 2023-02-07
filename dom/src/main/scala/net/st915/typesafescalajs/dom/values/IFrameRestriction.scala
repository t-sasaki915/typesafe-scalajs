package net.st915.typesafescalajs.dom.values

enum IFrameRestriction(val raw: String) {

  case AllowForms extends IFrameRestriction("allow-forms")
  case AllowModals extends IFrameRestriction("allow-modals")
  case AllowOrientationLock extends IFrameRestriction("allow-orientation-lock")
  case AllowPointerLock extends IFrameRestriction("allow-pointer-lock")
  case AllowPopups extends IFrameRestriction("allow-popups")
  case AllowPopupsToEscapeSandbox extends IFrameRestriction("allow-popups-to-escape-sandbox")
  case AllowPresentation extends IFrameRestriction("allow-presentation")
  case AllowSameOrigin extends IFrameRestriction("allow-same-origin")
  case AllowScripts extends IFrameRestriction("allow-scripts")
  case AllowTopNavigation extends IFrameRestriction("allow-top-navigation")
  case AllowTopNavigationByUserActivation
      extends IFrameRestriction("allow-top-navigation-by-user-activation")

}
