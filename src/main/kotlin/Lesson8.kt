package org.artemyeva

class Lesson8 {
    fun analyze(originalString: String): String {
        return if (originalString.contains("невозможно", true)) {
            originalString.replace(
                oldValue = "невозможно",
                newValue = "совершенно точно возможно, просто требует времени"
            )
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
    fun dateFromString() {
        val stringLog = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
        val splitted = stringLog.split("-> ")[1]
        println(splitted)
        val splitted2 = splitted.split(" ")
        println(splitted2[0])
        println(splitted2[1])
    }

    //Задача 2
    fun cardMasking() {
        val cardNumber = "4539 1488 0343 6467"
        val last4digits = cardNumber.split(" ")[3]
        println(last4digits)
        val cardMasked = "**** **** **** $last4digits"
        println(cardMasked)
    }

    //Задача 3
    fun mail() {
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
    fun method() {
        val words = "СтроКа из неСКольких сЛов"
        val string1 = words.split(" ") //Разделить на слова по пробелу
        println(string1)
        var all = ""
        for (a in string1) { //Создать цикл
            val word = a.lowercase()
                .capitalize() //Сначала сделать все слова с маленькой буквы, затем 1 букву каждого слова с заглавной
            if (all == "") { //Сложить последовательно каждую букву из итераций, если есть пробел
                all = all + word //то складывать без него (чтобы убрать пробел в начале строки)
            } else {
                all = all + " " + word //В остальных случаях складывать с пробелом между словами
            }
        }
        println(all)
    }

    fun encrypt(input: String): String { //Шифратор
        val chunked = input.chunked(2) //Делим слово по парам букв
        println(chunked)
        var result = ""
        for (b in chunked) {  //Цикл по всем парам
            println(b)
            if (b.length == 2) { //Если длина пары букв = 2
                val c1 = b[0]
                val c2 = b[1] //Берем первую и вторую букву
                result = result + c2 + c1 //Складываем буквы и меняем их местами 2 + 1
            } else {
                result = result + b //В остальных случаях (если не 2 буквы) просто возвращаем то же значение
            }
        }
        return result
    }

    fun decrypt(input: String): String { //Дешифратор
        val chunked = input.chunked(2) //Делим слово по парам букв
        println(chunked)
        var result = ""
        for (c in chunked) {  //Цикл по всем парам
            println(c)
            if (c.length == 2) { //Если длина пары букв = 2
                val d1 = c[0]
                val d2 = c[1] //Берем первую и вторую букву
                result = result + d2 + d1 //Складываем буквы и меняем их местами 2 + 1
            } else {
                result = result + c //В остальных случаях (если не 2 буквы) просто возвращаем то же значение
            }
        }
        return result
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
        // lesson8.method()
        //println(lesson8.encrypt("Kotlin"))
        println(lesson8.decrypt("oKltni"))
    }