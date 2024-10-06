package org.artemyeva

class Lesson10_Sets {

    //Задача 1. Создание пустого множества
    fun setTask1() {
        val setTask1 = setOf<Int>()
        println("setTask1 $setTask1")
    }

    //Задача 2. Создание множества со значениями
    fun setTask2() {
        val setTask2 = setOf(1, 2, 3)
        println("setTask2 $setTask2")
    }

    //Задача 3. Создание изменяемого множества
    fun setTask3() {
        val setTask3 = mutableSetOf("Kotlin", "Java", "Scala")
        println("setTask3 $setTask3")
    }

    //Задача 4. Добавление элементов в множество
    fun setTask4() {
        val setTask4 = mutableSetOf("Kotlin", "Java", "Scala")
        setTask4.add("Swift")
        setTask4.add("Go")
        println("setTask4 $setTask4")
    }

    //Задача 5. Удаление элемента из множества
    fun setTask5() {
        val setTask5 = mutableSetOf(1, 2, 3)
        setTask5.remove(2)
        println("setTask5 $setTask5")
    }

    //Задача 6. Перебор элементов множества
    fun setTask6() {
        val setTask6 = mutableSetOf(1, 2, 3)
        for (elem in setTask6) {
            println(elem)
        }
    }

    //Задача 7. Проверка наличия элемента в множестве
    fun setTask7() {
        val setTask7 = mutableSetOf("Kotlin", "Java", "Scala")
        println("setTask7 $setTask7 -> Scala -> ${checkSet(setTask7, "Scala")}")
        println("setTask7 $setTask7 -> dsfsd -> ${checkSet(setTask7, "dsfsd")}")
    }

    //Задача 8. Объединение двух множеств
    fun setTask8() {
        val setTask8First = mutableSetOf("Kotlin", "Java", "Scala")
        val setTask8Second = mutableSetOf("fghf", "Java", "Syut")
        val setTask8Result = mutableSetOf<String>()
        for (elem in setTask8First) {
            setTask8Result.add(elem)
        }
        for (elem in setTask8Second) {
            setTask8Result.add(elem)
        }
        println("setTask8First $setTask8First setTask8Second $setTask8Second setTask8Result $setTask8Result")
    }

    //Задача 9. Пересечение двух множеств
    fun setTask9() {
        val setTask9First = mutableSetOf(1, 2, 3, 4)
        val setTask9Second = mutableSetOf(3, 4, 5, 6)
        val setTask9Result = mutableSetOf<Int>()
        for (elem1 in setTask9First) {
            for (elem2 in setTask9Second) {
                if (elem1 == elem2) {
                    setTask9Result.add(elem2)
                }
            }
        }
        println("setTask9First $setTask9First setTask9Second $setTask9Second setTask9Result $setTask9Result")
    }

    //Задача 10. Разность двух множеств
    fun setTask10() {
        val setTask10First = mutableSetOf("Kotlin", "Java", "Scala")
        val setTask10Second = mutableSetOf("fghf", "Java", "Syut")
        val setTask10Result = mutableSetOf<String>()
        for (elem in setTask10First) {
            var flag = false
            for (elem2 in setTask10Second) {
                if (elem == elem2) {
                    flag = true
                    break
                }
            }
            if (!flag) setTask10Result.add(elem)
        }
        println("setTask10First $setTask10First setTask10Second $setTask10Second setTask10Result $setTask10Result")
    }

    //Задача 11. Преобразование множества в список
    fun setTask11() {
        val setTask11 = mutableSetOf("Kotlin", "Java", "Scala")
        val setTask11List = mutableListOf<String>()
        for (elem in setTask11) {
            setTask11List.add(elem)
        }
        println("setTask11 $setTask11 setTask11List $setTask11List")
    }

    //Вспомогательная функция для проверки наличия элемента в множестве
    private fun checkSet(set: Set<String>, str: String): Boolean {
        for (elem in set) {
            if (elem == str) return true
        }
        return false
    }
}

fun main() {
    val lesson12 = Lesson10_Sets()
    lesson12.setTask1()
    lesson12.setTask2()
    lesson12.setTask3()
    lesson12.setTask4()
    lesson12.setTask5()
    lesson12.setTask6()
    lesson12.setTask7()
    lesson12.setTask8()
    lesson12.setTask9()
    lesson12.setTask10()
    lesson12.setTask11()
}