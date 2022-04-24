fun main() {
    print("Введите количество людей: ")
    val likes = readLine()?.toULong() ?: return

    val humans = if (likes == 1.toULong()) "человеку" else "человекам"
    println("Понравилось $likes $humans")
}