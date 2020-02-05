package bz.x10.rubenverg.common

object EasySearchXML {
  implicit class BetterString(val s: String) {
    def @(e: xml.Elem) {e \\ s}
    def <>(e: xml.Elem) {e \ s}
  }
}
