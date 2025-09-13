//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Task 1
    var fav_game = "ARK: Survival Evolved";
    var fav_d = 7;
    val PI = 3.14159;
    var fav_l = 'Z';

    println("$fav_game , $fav_d , $PI, $fav_l");

    // Task 2
    // val test1 = "hello
    // println(test1

    val test1 = "hello";
    println(test1);
    val test2 = 5;
    println(test2);

    //Task 3
    val pi = 3.14
    val radius = 5
    println("Площадь круга: ${pi * radius * radius.toDouble()}") // Результат некорректный из-за несовпадения типов

    //Task 4
    print("Введите ваше имя: ")
    val name = readln()
    print("Введите ваш год рождения: ")
    val birthYear = readln().toInt()
    val age = 2025 - birthYear
    println("$name, вам $age лет")

    //Task 5
    print("Введите первое число: ")
    val num1 = readln().toDouble()
    print("Введите второе число: ")
    val num2 = readln().toDouble()

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 * $num2 = ${num1 * num2}");

}
    