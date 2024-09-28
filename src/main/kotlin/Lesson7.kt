package org.artemyeva

class Lesson7 {
    //Цикл for
    //Прямой диапазон
    fun main () {
        for (a in 1..5) {
            println(a)
        }
    }

    fun main1 () {
        for (b in (2..10) step 2) {
            println(b)
        }
    }
    //Обратный диапазон
    fun main2 () {
        for (c in 5 downTo 1) {
            println(c)
        }
    }

    fun main3 () {
        for (d in (10 downTo 1) step 2) {
            println(d)
        }
    }
    //С шагом(step)
    fun main4 () {
        for (e in (1..9) step 2) {
            println(e)
        }
    }

    fun main5 () {
        for (f in (1..20) step 3) {
            println(f)
        }
    }
    //Использование До(until)
    fun main6 () {
        for (g in 1 until 9) {
            println(g)
        }
    }

    fun main7 () {
        for (h in 3 until 15) {
            println(h)
        }
    }
//While
    fun main8 () {
        var i =1
        while (i ++ <=5) {
            println(i*i)
        }
    }

    fun main9 () {
        var j = 10
        while (j-- > 5) {
            println(j)
        }
    }
//do...while
    fun main10 () {
    var k = 5
    do {
            println(k--)
        } while (k > 0)
}

    fun main11 () {
        var l = 5
        do {
            println(l++)
        } while (l < 10)
    }
    //Использование break
    fun main12 () {
        for (m in 1..10) {
            if (m == 6) break
            println(m)
        }
    }

    fun main13 () {
        var n = 1
        while (true) {
            if (n == 10) break
            println(n++)
        }
    }

    //Использование continue
        fun main14 () {
            for (o in 1..10) {
                if (o % 2 ==0) continue
                println(o)
            }
        }

        fun main15 () {
            var p = 1
            while (p<= 1) {
                if (p % 3 ==0) continue
                println(p++)

                }
        }
    //Задача
    fun main16 () {
        for (r in 1..10) {
            for (s in 1..10) {
            print(r * s)
            print("")
        }
            println()
        }
    }
    }
