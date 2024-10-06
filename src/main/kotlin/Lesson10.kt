package org.artemyeva

class Lesson10 {

    //Массивы Array
    //Задача 1. Создание и иницилизация
    fun arrayTask1() {
        val array = arrayOf(1, 2, 3, 4, 5) //Создаем массив
        println(array.joinToString(", "))//Для того чтобы отобразить массив,необходимо добавить jts
    }

    //Задача 2. Создание пустого массива
    fun arrayTask2() {
        val arrayOfNulls = arrayOfNulls<String>(10)//Создаем массив на 10 пустых значений с типом string
        println(arrayOfNulls.joinToString(", "))
    }

    // Задача 3. Заполнение массива в цикле
    fun arrayTask3() {
        val array = Array(5) { i -> (i * 2).toDouble() }
        println(array.joinToString(", "))
    }

    //Задача 4. Изменение элементов в массиве
    fun arrayTask4() {
        val arrayInt = arrayOfNulls<Int>(5)//Создаем массив со значением int на 5 элементов
        println(arrayInt.joinToString(", "))
        for ((index, elem) in arrayInt.withIndex()) {
            arrayInt.set(
                index,
                index * 3
            )//Создаем переменную, где устанавливаем значение = индексу каждого значения умноженное на 3 по очереди
        }
        println(arrayInt.joinToString(", "))
    }

    //Задача 5. Nullable элементы
    fun arrayTask5() {
        val array = Array<String?>(3) { i ->
            if (i == 0) {//Если это первый элемент массива, то 0
                null
            } else {
                "aaa"//Если последующие, то строка
            }}
        println(array.joinToString (", "))
    }

    //Задача 6. Копирование массива
    fun arrayTask6(){
        val arrayNumbers1 = arrayOf(1,2,3,4,5)
        val arrayNumbers2 = arrayOfNulls<Int>(5)
        println("Array 1 before: " + arrayNumbers1.joinToString(", "))
        println("Array 2 before: " + arrayNumbers2.joinToString(", "))
        for ((index, elem) in arrayNumbers1.withIndex()){
            val value = arrayNumbers1.get(index)
            arrayNumbers2.set(index, value)
        }
        println("Array 1 after: " + arrayNumbers1.joinToString(", "))
        println("Array 2 after: " + arrayNumbers2.joinToString(", "))
    }
    //Задача7. Разница двух массивов
    fun arrayTask7(){
        val arrayNumber1 = arrayOf(2,4,6)
        val arrayNumber2 = arrayOf(1,2,3)
        val arrayNumber3 = arrayOfNulls<Int>(3)
        for ((index, elem) in arrayNumber1.withIndex()){
            val a = arrayNumber1.get(index)
            val b = arrayNumber2.get(index)
            arrayNumber3.set(index, a - b)

        }
        println(arrayNumber3.joinToString(", "))
    }

    //Задача 8. Поиск индекса элемента
    fun arrayTask8(array: Array<Int>, elem: Int): Int {
        var i = 0
        // Пройти по всему массиву через while
        while (i < array.size) {
            // Сравниваем искомое значение со значением по индексу
            val value = array.get(i)
            if (elem == value) {
                // Если нашли значение, то возвращаем индекс значения
                return i
            }
            i++
        }
        // Если прошли весь массив и значения нет такого, возвращаем -1
        return -1
    }

    // Задача 9. Перебор массива
    fun arrayTask9() {
        val arrayNumb = arrayOf(1, 2, 3, 4, 5)
        //Создать цикл
        for (element in arrayNumb) {
            //Вывести каждый элемент
            println("$element -> ${if(element % 2 == 0) "четное" else "нечетное"}")
            //Написать напротив каждого элемента четное или нечетное
        }
    }

    //Задача 10. Поиск значения в массиве
    fun arrayTask10(array: Array<String>, elem: String){

    }

}

fun main() {
    val lesson10 = Lesson10()
    // lesson10.arrayTask1()
    //lesson10.arrayTask2()
    //lesson10.arrayTask3()
    //lesson10.arrayTask4()
    //lesson10.arrayTask5()
    //lesson10.arrayTask6()
    //lesson10.arrayTask7()
    //println(lesson10.arrayTask8(arrayOf(1,2,3,4,5,6,7,8,9), 88))
    //lesson10.arrayTask9()

}