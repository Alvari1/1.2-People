fun main() {
    print("Введите количество людей: ")
    val likes = readLine()?.toULong() ?: return

    val humans = if ((likes % 10U).toInt() == 1) "человеку" else "человекам"
    println("Понравилось $likes $humans")
}