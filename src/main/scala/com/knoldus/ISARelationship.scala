package com.knoldus

/**
 * Contains private members length and width
 * Contains setter method and getter method of length and width
 * Contains method to calculate area of shape provided length and breadth
 */
class Rectangle {
  private var length: Double = 0.0
  private var width: Double = 0.0

  /**
   * Setter method for length
   *
   * @param getLength Takes dimension and set it to length of Rectangle
   */
  def setLength(getLength: Double): Unit = {
    length = getLength
  }

  /**
   * Setter method for width
   *
   * @param getWidth Takes dimension and set it to width of Rectangle
   */
  def setWidth(getWidth: Double): Unit = {
    width = getWidth
  }

  /**
   * Getter method for length
   *
   * @return Returns length of Rectangle
   */
  def getLength: Double = length

  /**
   * Getter method for width
   *
   * @return Returns width of Rectangle
   */
  def getWidth: Double = width

  /**
   * @return Returns area of Rectangle
   */
  def area: Double = length * width
}

/**
 * Contains setter methods of length and width
 */
class Square extends Rectangle {

  /**
   * Overriden to set length and width of Rectangle to side of Square
   *
   * @param getLength Takes dimension and set it to length of Rectangle
   */
  override def setLength(getLength: Double): Unit = {
    super.setLength(getLength)
    super.setWidth(getLength)
  }

  /**
   * Overriden to set length and width of Rectangle to side of Square
   *
   * @param getWidth Takes dimension and set it to width of Rectangle
   */
  override def setWidth(getWidth: Double): Unit = {
    super.setWidth(getWidth)
    super.setLength(getWidth)
  }
}

object ISARelationship extends App {
  val rectangle = new Rectangle
  val length = 10
  val width = 20
  rectangle.setLength(length)
  rectangle.setWidth(width)
  println(s"${rectangle.getLength} * ${rectangle.getWidth} = ${rectangle.area}")

  val square = new Square
  val side = 30
  square.setLength(side)
  println(s"${square.getLength} * ${square.getWidth} = ${square.area}")
}
