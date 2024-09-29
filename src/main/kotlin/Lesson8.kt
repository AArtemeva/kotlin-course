package org.artemyeva

class Lesson8 {
    fun analyze(originalString: String): String {
        return if (originalString.contains("невозможно", true)) {
            originalString.replace(oldValue = "невозможно", newValue = "совершенно точно возможно, просто требует времени")
        } else if (originalString.startsWith("Я не уверен")) {
            "$originalString, но моя интуиция говорит об обратном"
        } else if (originalString.contains("катастрофа", true)) {
            originalString.replace(oldValue = "катастрофа", "интересное событие")
        } else if (originalString.endsWith("без проблем")) {
            originalString.replace(oldValue = "без проблем", "с парой интересных вызовов на пути")
        } else if (!originalString.contains(" ")) {
            "Иногда,$originalString, но не всегда"
        } else {
            ""
        }
    }

    //Задача 1
    fun dateFromString () {
        val stringLog = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
        val splitted = stringLog.split("-> ")[1]
        println(splitted)
        val splitted2 = splitted.split(" ")
        println(splitted2[0])
        println(splitted2[1])
    }
    //Задача 2
    fun cardMasking () {
        val cardNumber = "4539 1488 0343 6467"
        val last4digits = cardNumber.split(" ")[3]
        println(last4digits)
        val cardMasked = "**** **** **** $last4digits"
        println(cardMasked)
    }
    //Задача 3
    fun mail () {
        val email = "username@example.com"
        val result = email.replace(oldValue = "@", newValue = " [at] ")
        val result2 = result.replace(oldValue = ".", newValue = " [dot] ")
        println(result)
        println(result2)
    }
    //Задача 4
    fun extractFileName() {
        val way = "C:/Пользователи/Документы/report.txt"
        val fileName = way.split("/")[3]
        println(fileName)
    }
    //Задача 5
    fun phrase() {
        val abbreviation = "Объектно-ориентированное программирование"
        val abr1 = abbreviation.split("-", " ")
        println(abr1)
        var result = ""
        for (s in abr1) {
            result = result + s.first().uppercase()
            println("result = $result")
        }
        println(result)
    }
    //Дополнительные задания
    //Задание 1
    fun method () {
        val words = "СтроКа из неСКольких сЛов"
        val string1 = words.split(" ")
        println(string1)
        var all = ""
        for (a in string1) {
            val word = a.lowercase().capitalize()
            if (all == "") {
                all = all + word
            } else {
                all = all + " " + word
            }
        }
        println(all)
    }
}

fun main() {
    val lesson8 = Lesson8()
//    println(lesson8.analyze("Это невозможно выполнить за один день"))
//    println(lesson8.analyze("Я не уверен в успехе этого проекта"))
//    println(lesson8.analyze("Произошла катастрофа на сервере"))
//    println(lesson8.analyze("Этот код работает без проблем"))
//    println(lesson8.analyze("Удача"))
//    lesson8.dateFromString()
//    lesson8.cardMasking()
//    lesson8.mail()
//    lesson8.extractFileName()
//    lesson8.phrase()
    //Дополнительные задания
    lesson8.method()
}