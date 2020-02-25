package com.knoldus

/**
 * Contains abstract methods of length and width
 * Contains method to calculate area of SpecialParallelogram
 */
trait SpecialParallelogram {
  def length: Double

  def width: Double

  def area: Double = length * width
}

/**
 * Provide implementations for length and width methods
 *
 * @param getLength Class parameter for length
 * @param getWidth  Class parameter for width
 */
class RectangleParallelogram(getLength: Double, getWidth: Double) extends SpecialParallelogram {
  def length: Double = getLength

  def width: Double = getWidth
}

/**
 * Provide implementations for length and width methods
 *
 * @param side Class parameter for both length and width
 */
class SquareParallelogram(side: Double) extends SpecialParallelogram {
  def length: Double = side

  def width: Double = side
}

object SpecialParallelogramDriver extends App {
  val length = 10
  val width = 20
  val rectangle = new RectangleParallelogram(length, width)
  println(s"${rectangle.length} * ${rectangle.width} = ${rectangle.area}")

  val side = 30
  val square = new SquareParallelogram(side)
  println(s"${square.length} * ${square.width} = ${square.area}")
}
