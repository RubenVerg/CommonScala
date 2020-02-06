package bz.x10.rubenverg.common

object ImplicitClasses {
  implicit class BetterString(val s: String) {
    def @(e: xml.Elem) {e \\ s}
    def <>(e: xml.Elem) {e \ s}
  }
}

object TestsClasses {
  case class Person(val name = "", val surname = "", val age: Short = 0, val weight = 0.0)
  val pizza = <pizza>
    <meta type="crust">thin</meta>
    <meta type="height" unit="cm">2</meta>
    <content>
      <meta type="pizzaType">Sausage</meta>
      <item>Cheese</item>
      <item>Tomato</item>
      <item>Sausage</item>
    </content>
    <price value="7.50" unit="_EUR" />
  </pizza>
}
