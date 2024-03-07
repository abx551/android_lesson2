//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(canGoForAWalk(25, 15))
    println(canGoForAWalk(18, 25))
    println(canGoForAWalk(50, 5))
    println(canGoForAWalk(30, 35))
    println(canGoForAWalk(22, -15))

}

fun canGoForAWalk(age: Int, temperature: Int): String = when {

    (age in 20..45 && temperature in -20..30) -> "Можно идти гулять"

    (age < 20 && temperature in 0..28) -> "Можно идти гулять"

    (age > 45 && temperature in -10..25) -> "Можно идти гулять"

    else -> " Оставайтесь дома"
}















