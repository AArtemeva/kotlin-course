package org.artemyeva

class Homework7 {

    fun main() {
        val month = 1
        println(seasonOfTheYear(month)) //Задание 1
        val dogAge = 2
        println(humanAge(dogAge)) //Задание 2
        val distance = 30.0
        println(transport(distance)) //Задание 3
        println(calculationOfBonus(sumCheck)) //Задание 4
        val fileExtension = ".txt"
        println(fileType(fileExtension))//Задание 5
        val temperature = 1.0
        val scale = "FG"
        println(temperatureConversion(temperature, scale)) //Задание 6
        println(selectionOfClothing(1)) //Задание 7
        println(categories(19)) //Задание 8
    }

    //    Задание 1: "Определение Сезона"
    //    Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.
    fun seasonOfTheYear(month: Int): String {
        return if (month in 3..5) {
            "Весна"
        } else if (month in 6..8) {
            "Лето"
        } else if (month in 9..11) {
            "Осень"
        } else "Зима"
    }

    //    Задание 2: "Расчет Возраста Питомца"
    //    Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
    //    До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
    fun humanAge(dogAge: Int): Double {
        return if (dogAge in 0..2) {
            dogAge * 10.5
        } else
            (2 * 10.5) + ((dogAge - 2) * 4)
    }

    //    Задание 3: "Определение Вида Транспорта"
    //    Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
    //    Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
    fun transport(distance: Double): String {
        return if (distance < 1.0) {
            "пешком"
        } else if (distance in 1.0..5.0) {
            "велосипед"
        } else "автотранспорт"
    }

    //    Задание 4: "Расчет Бонусных Баллов"
    //    Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
    //    Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов:
    //    2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
    val sumCheck: Int = 2000

    fun calculationOfBonus(sumCheck: Int): Int {
        return when {
            sumCheck < 1000 -> sumCheck / 100 * 2
            sumCheck >= 1000 -> sumCheck / 100 * 5
            else -> 0
        }
    }

    //    Задание 5: "Определение Типа Документа"
    //    Контекст: В системе хранения документов каждый файл имеет расширение.
    //    Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
    fun fileType(fileExtension: String): String {
        return when (fileExtension) {
            ".txt" -> "Текстовый документ"
            ".png" -> "Изображение"
            ".xlsx" -> "Таблица"
            else -> "Неизвестный тип"
        }
    }

    //    Задание 6: "Конвертация Температуры"
    //    Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F).
    //    Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
    //    Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия
    fun temperatureConversion(temperature: Double, scale: String): String {
        return when (scale) {
            "C" -> "${temperature * 9 / 5 + 32} F"
            "F" -> "${(temperature - 32) * 5 / 9} C"
            else -> "Неверное значение"
        }
    }

    //    Задание 7: "Подбор Одежды по Погоде"
    //    Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
    //    "куртка и шапка" при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
    //    При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
    fun selectionOfClothing(temperature: Int): String {
        return when (temperature) {
            in -30 until 0 -> "куртка и шапка"
            in 0 until 15 -> "ветровка"
            in 15 until 35 -> "футболка и шорты"
            else -> "не выходить из дома"
        }
    }

    //    Задание 8: "Выбор Фильма по Возрасту"
    //    Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
    //    Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".
    fun categories(age: Int): String {
        return when (age) {
            in 0..12 -> "детские"
            in 13 until 18 -> "подростковые"
            else -> "18+"
        }

    }
}