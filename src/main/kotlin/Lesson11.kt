package org.artemyeva

class Lesson11 {


    fun main(){
        //Задача 1. Пустой словарь
        val task1 = mapOf<Int, Int>()
        println("task1 $task1")
        println()

        //Задача 2. Словарь+инициализация
        val task2 = mapOf(0.001F to 1.1, 0.002F to 2.2, 0.03F to 3.3)
        println("task2 $task2")
        println()

        //Задача 3. Изменяемый словарь
        val task3 = mutableMapOf<Int, String>()
        println("task3 $task3")
        println()

        //Задача 4. Добавление элементов
        val task4 = mutableMapOf(1 to "flower", 2 to "tree")
        task4[3] = "bird"
        println("task4 $task4")
        println()

        //Задача 5. Удаление элементов
        val task5 = mutableMapOf(1 to "flower", 2 to "tree")
        println("task5 2 = ${task5[2]} 5 = ${task5[5]}")
        println()

        //Задача 6. Перебор словаря в цикле
        val task6 = mutableMapOf(1 to "flower", 2 to "tree")
        task6.remove(1)
        println("task6 $task6")
        println()

        //Задача 7. Перезапись элементов словаря
        val task7 = mutableMapOf(0.1 to 1, 0.2 to 2, 0.3 to 3)
        for ((key, vol) in task7) {
            if (vol == 0) {
                println("бесконечность")
            } else{
                println(key / vol)
        }
        }
    println()

        //Задача 8. Сложение словарей
        val task8 = mutableMapOf(1 to "flower", 2 to "tree")
        task8[2] = "bee"
        println("task8 $task8")
        println()

        //Задача 9. Словарь со сложными типами
        val task9First = mutableMapOf(1 to "flower", 2 to "tree")
        val task9Second = mutableMapOf(3 to "bee", 4 to "bird")
        val task9Third = mutableMapOf<Int, String>()
        for (elem in task9First){
            task9Third[elem.key] = elem.value
        }
        for (elem in task9Second){
            task9Third[elem.key] = elem.value
        }
        println("task9First $task9First task9Second $task9Second task9Third $task9Third" )
        println()

        //Задача 10. Множество как значение
        val task10 = mutableMapOf<String, List<Int>>()
        task10["первый"] = listOf(1,2,3)
        task10["второй"] = listOf(4,5,6)
        println("task10 $task10")
        println()

        //Задача 11. Поиск элемента по значению
        val task11 = mutableMapOf(1 to mutableSetOf("раз", "два", "три"), 2 to mutableSetOf("one", "two", "three"))
        task11[1]?.add("пять")
        println("task11 $task11")
        println()
    }

}