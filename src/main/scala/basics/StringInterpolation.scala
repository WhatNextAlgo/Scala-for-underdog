package basics

object StringInterpolation extends App{

  // Step 1: Using String interpolation to print a variable
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

  // Step 2: Using String interpolation on object properties
  case class Donut(name:String,tasteLevel:String)
  val favoriteDonut2: Donut = Donut("Glazed Donut","Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  // Step 3: Using String interpolation to evaluate expressions
  val qtyDonutsToBuy:Int = 10
  println(s"Are you buying 10 donuts = ${qtyDonutsToBuy == 10}")

  // Step 4. Using String interpolation for formatting text
  val donutName:String = "Vanilla Donut"
  val donutTasteLevel:String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  // Step 5. Using f interpolation to format numbers
  val donutPrice:Double = 2.50
  println(f"Donut Price = $donutPrice%.2f")

  // Step 6. Using Raw interpolation
  println(raw"Favorite donut\t$donutName")

  // Step 7. Using backslash to escape quotes

  val donutJson: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson = $donutJson")

  // Step 8. Using triple quotes """ to escape characters
  val donutJson2:String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson2 = $donutJson2")

  // Step 9. Creating multi-line text using stripMargin
  val donutJson3:String =
    """
      |{
      |"donut_name":"Glazed Donut"
      |"taste_level":"Very Tasty"
      |"price":2.50
      |}
      |""".stripMargin

  println(s"donutJson3 = $donutJson3")

  val donutJson4: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
  """.stripMargin('#')
  println(s"donutJson4 = $donutJson4")


}
