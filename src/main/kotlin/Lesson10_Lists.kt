package org.artemyeva

class Lesson10_Lists {

    //Задача 1. Создание пустого списка
    fun listTask1() {
        val listTask1 = listOf<Int>()
        println("listTask1 $listTask1")
    }

    //Задача 2. Создание списка со значениями
    fun listTask2() {
        val listTask2 = listOf("Hello", "World", "Kotlin")
        println("listTask2 $listTask2")
    }

    //Задача 3. Создание изменяемого списка
    fun listTask3() {
        val listTask3 = mutableListOf(1, 2, 3, 4, 5)
        println("listTask3 $listTask3")
    }

    //Задача 4. Добавление элементов в список
    fun listTask4() {
        val listTask4 = mutableListOf(1, 2, 3, 4, 5)
        listTask4.add(6)
        listTask4.add(7)
        listTask4.add(8)
        println("listTask4 $listTask4")
    }

    //Задача 5. Удаление элемента из списка
    fun listTask5() {
        val listTask5 = mutableListOf("Hello", "World", "Kotlin")
        listTask5.remove("World")
        println("listTask5 $listTask5")
    }

    //Задача 6. Перебор элементов списка
    fun listTask6() {
        val listTask6 = mutableListOf(1, 2, 3, 4, 5)
        println("listTask6 $listTask6")
        for (elem in listTask6) {
            println(elem)
        }
    }

    //Задача 7. Доступ к элементу по индексу
    fun listTask7() {
        val listTask7 = mutableListOf("Hello", "World", "Kotlin")
        println("listTask7 $listTask7")
        println("elem 2 ${listTask7[1]}")
    }

    //Задача 8. Изменение элемента по индексу
    fun listTask8() {
        val listTask8 = mutableListOf(1, 2, 3, 4, 5)
        println("listTask8 $listTask8")
        listTask8[2] = 100
        println("new listTask8 $listTask8")
    }

    //Задача 9. Объединение двух списков
    fun listTask9() {
        val listTask9First = mutableListOf("Hello", "World", "Kotlin")
        val listTask9Second = mutableListOf("dfgdf", "dgf", "dgf")
        val listTask9Result = mutableListOf<String>()
        for (elem in listTask9First) {
            listTask9Result.add(elem)
        }
        for (elem in listTask9Second) {
            listTask9Result.add(elem)
        }
        println("listTask9First $listTask9First listTask9Second $listTask9Second listTask9Result $listTask9Result")
    }

    //Задача 10. Поиск минимального и максимального элемента
    fun listTask10() {
        val listTask10 = mutableListOf(2, 1, 2, 3, 4, 5, 3)
        var min = listTask10[0]
        var max = listTask10[0]
        for (elem in listTask10) {
            if (min > elem) min = elem
            if (max < elem) max = elem
        }
        println("listTask10 $listTask10  -- min $min  max $max")
    }

    //Задача 11. Фильтрация списка
    fun listTask11() {
        val listTask11 = mutableListOf(2, 1, 2, 3, 4, 5, 3)
        val listTask11result = mutableListOf<Int>()
        for (elem in listTask11) {
            if (elem % 2 == 0) listTask11result.add(elem)
        }
        println("listTask11 $listTask11 -> listTask11result $listTask11result")
    }
}

fun main() {
    val lesson11 = Lesson10_Lists()
    lesson11.listTask1()
    lesson11.listTask2()
    lesson11.listTask3()
    lesson11.listTask4()
    lesson11.listTask5()
    lesson11.listTask6()
    lesson11.listTask7()
    lesson11.listTask8()
    lesson11.listTask9()
    lesson11.listTask10()
    lesson11.listTask11()
}