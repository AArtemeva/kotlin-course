package org.artemyeva


class Lesson9 {

    // Функция для поздравления с днем рождения
    fun greetBirthday(name: String, age: Int) {
        val border = "•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•*•"
        val emptyLine = "•                                               •"

        println(border)
        println(emptyLine)
        println("•   С Днем Рождения, $name!                     •")
        println("•   Тебе исполнилось $age ${getYearWord(age)}!               •")
        println(emptyLine)
        println("•   Пусть этот день будет полон радости,       •")
        println("•   улыбок и прекрасных воспоминаний!          •")
        println(emptyLine)
        println("•   Желаю тебе счастья, здоровья и успехов     •")
        println("•   во всех твоих начинаниях!                  •")
        println(emptyLine)
        println(border)
    }

    // Вспомогательная функция для правильного склонения слова "год"
    private fun getYearWord(age: Int): String {
        return when {
            age % 100 in 11..14 -> "лет"
            age % 10 == 1 -> "год"
            age % 10 in 2..4 -> "года"
            else -> "лет"
        }
    }

}

fun main() {
    val greeter = Lesson9()

    println("Поздравление с днем рождения:")
    greeter.greetBirthday("Александр", 42)
}