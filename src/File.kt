fun main() {
    val game = "ARK: Survival Evolved"
    val year = 2023
    val m = "$game - игра, разработанная в $year году"
    println(m)

    println("Здарова")

    val name = "Roman"
    val age = 18
    println("Hello")
    println("My name is $name")
    println("My age is $age")

    val a = 10
    val b = 15
    val c = a + b + 8
    val str = c.toString()
    println(str)

    val numList = arrayOf(1, 2, 3)
    var x = 0
    while (x < 3) {
        println("Item $x is ${numList[x]}")
        x = x + 1
    }

    val number: Double = 12.7
    val integerNumber: Int = number.toInt()
    println(integerNumber)

    val a2: Int = 7
    var b2: Double = 3.5
    println(a2 + b2.toInt())
    println(a2 / b2.toInt())

    var x2: Double = 65.2
    var isPunk = true
    var message = "Hello"
    var y: Int = 15
    y = y + x2.toInt()
    println(y)
    println(isPunk)

    // Шаг 11
    print("Введите имя: ")
    val inputName = readln()
    print("Введите возраст: ")
    val inputAge = readln()
    println("Ваше имя $inputName")
    println("Ваш возраст $inputAge")

    // Шаг 12
    print("Первое число: ")
    var numA = readln().toInt()
    print("Второе число: ")
    var numB = readln().toInt()
    println("Сумма: ${numA + numB}")
    println("Разность: ${numA - numB}")
    println("Произведение: ${numA * numB}")
    println("Частное: ${numA / numB}")
    println("Остаток: ${numA % numB}")

    var count: Int = 10
    println(count + 1)
    println(count++)
    println(count--)

    val a3 = 5
    val b3 = 2
    println(a3 / b3)
    println(a3 % b3)

    print("Введите количество секунд: ")
    val totalSeconds = readln().toInt()
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60
    println("$hours ч $minutes м $seconds с")

    print("Введите температуру в Фаренгейтах: ")
    val fahrenheit = readln().toDouble()
    val celsius = (fahrenheit - 32) * 5 / 9.0
    println("$fahrenheit°F = $celsius°C")
}
