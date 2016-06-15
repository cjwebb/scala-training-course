object Exercise1 {

  case class Product(name: String, price: BigDecimal)

  val blackShoes          = Product("Black Shoes", 300.00)
  val expensiveWhiteShoes = Product("White Shoes", 125.00)
  val cheapWhiteShoes     = Product("White Shoes", 5.00)

  def main(args: Array[String]) {
    println("Hello, World")
  }

}

class ProductChooser {
  def chooseProduct(p: Product) {
    println("I will go barefoot, rather than wear these")
  }
}

