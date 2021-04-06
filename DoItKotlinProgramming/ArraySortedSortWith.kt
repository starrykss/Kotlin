data class Product2(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
            Product2("Snow Ball", 870.00),
            Product2("Smart Phone A", 999.00),
            Product2("Drone", 240.00),
            Product2("Mouse", 633.55),
            Product2("Keyboard", 125.99),
            Product2("Smart Phone B", 1500.99),
            Product2("Mouse", 515.99))

    products.sortWith (    // Comparator를 이용해 두 객체를 비교하여 p1이 크면 1, 같으면 0, 작으면 -1
        Comparator<Product2> { p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    products.forEach { println(it) }

    products.sortWith(compareBy({ it.name }, { it.price }))
    products.forEach { println(it) }
}