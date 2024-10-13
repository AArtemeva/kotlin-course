package org.artemyeva

class Lesson12 {
    //Задача 1. Не принимает аргументов и не возвращает значения
    fun nothingGetReturn(){

    }

    //Задача 2. Принимает два целых числа и возвращает их сумму
    fun twoInt(a:Int, b: Int): Int {
        return a + b
    }

    //Задача 3. Принимает строку и ничего не возвращает
    fun returnNothing(string: String){
    }

    //Задача 4. Принимает список целых чисел и возвращает целое значение типа дабл
    fun getDouble(listNumber: List<Int>): Double {
        var result: Double= 1.5
        for (elem in listNumber){
            result += elem.toDouble()
        }
        return result
    }

    //Задача 5. Принимает nullable строку и возвращает ее длину в виде nullable целого числа
    fun nullableStringToInt(string: String?) = string?.length

    //Задача 6. Не принимает аргументов и возвращает nullable число
    fun returnNullable(): Float? {
        return null
    }

    //Задача 7. Принимает nullable целых чисел и не возвращает значения
    fun getNullableList (listNumber: List<Int>?){
    }

    //Задача 8. Принимает целое число и возвращает nullable строку
    fun getInt (number: Int): String?{
        return null
    }

    //Задача 9. Не принимает аргументов и возвращает список nullable строк
    fun getNullable (): List<String>?{
        return null
    }

    //Задача 10.Принимает nullable string и nullable Int возвращает nullable булево
    fun getNullableStringAndInt (string: String?, number: Int?): Boolean?{
        return null
    }

    //Код 1.
    fun multiplyByTwo(number: Int) = number * 2

    //Код 2.
    fun isEven(number: Int): Boolean{
        return number % 2 == 0
    }

    //Код 3.
    fun printNumbersUntil(n: Int){
        if (n < 1) {
            return
        }
        for (nn in 1..n) {
            println(nn)
        }
    }

    //Код 4.
    fun findFirstNegative(listNumber: List<Int>): Int?{
        for (elem in listNumber){
            if (elem < 0) {
                return elem
            }
        }
         return  null
    }

    //Код 5.
    fun processList(listString: List<String>) {
        for (elem in listString){
            if (elem == null)
                return
        }
    }
    
}