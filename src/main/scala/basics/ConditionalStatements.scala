package basics

object ConditionalStatements extends App{

  // Step 1: Using If clause as a statement

  val numberOfPeople:Int = 20
  val donutsPerPerson:Int = 2
  if (numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

  // Step 2. Using if and else clause as a statement
  val defaultDonutsToBuy:Int = 8

  if (numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")


  // Step 3. Using if, else if, and else clause as a statement

  if (numberOfPeople < 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  // Step 4. Using if and else clause as expression
  val numberOfDonutsToBuy = if (numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")



}
