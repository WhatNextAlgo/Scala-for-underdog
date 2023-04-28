package basics

object VariableAndTypes extends App{

  // Step 1: Immutable Variables
  // syntax : val <Name of our variable>:<Scala Type> = <Some literal>

  val donutsToBuy:Int = 5
  println(donutsToBuy)

  // donutsToBuy = 10 // we can not modified the variable

  // Step 2: Mutable Variables
  // syntax : var <Name of our variable>:<Scala Type> = <Some literal>

  var favoriteDonut: String = "Glazed Donut"
  favoriteDonut = "Vanilla Donut"
  println(favoriteDonut)


  // Step 3: Lazy initialization
  // syntax : lazy val  <Name of our variable>:<Scala Type> = <Some literal>

  lazy val donutService:String  = "initialize some donut service"
  println(donutService)

  // Step 4. Scala Supported Types
  val donutsBought:Int = 5
  val bigNumberOfDonuts:Long = 1999949499494994L
  val smallNumberOfDonuts: Short= 123
  val priceOfDonut:Double = 12.5
  val donutPrice:Float = 2.50f
  val donutStoreName:String = "WhatNextAlgo Donut Store"
  val donutByte:Byte = 0xa
  val donutFirstLetter:Char = 'D'
  val nothing:Unit = ()

  // Step 5: Declare a variable without initialization
  var leastFavoriteDonut:String = _
  leastFavoriteDonut = "Plain Donut"


}
