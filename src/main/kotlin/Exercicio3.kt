import java.util.*

fun main(){
    //Faça um programa que calcula o novo valor do salário de um funcionário.
    //O usuário informa o salário atual (ex. 750,00) e o percentual do reajuste
    //(ex. 13,5 %).

    val scan = Scanner(System.`in`)
    var valorReajuste: Double
    var total: Double

    print("Informe seu salário \nR$")
    var salario: Double = scan.nextDouble()

    println("Informe o percentual de reajuste salarial: ")
    var reajuste: Double = scan.nextDouble()

    valorReajuste = salario * (reajuste/100)

    total = salario + valorReajuste

    println("Valor do reajuste R$$valorReajuste")
    println("Valor do novo salário R$$total")

}