import java.text.DecimalFormat
import java.util.Scanner

//Faça um programa que calcula o tempo (em anos) que uma pessoa irá
//demorar para poupar R$1.000.000,00 (Um Milhão de Reais). O usuário
//informa o salário mensal e o total de despesas mensais.

fun main() {

    val scan = Scanner(System.`in`)
    var tempo: Double = 0.0
    var saldoAnual: Double = 0.0
    var con = DecimalFormat("#")

    print("Digite o valor do seu salário \nR$")
    var salario = scan.nextDouble()

    print("Digite o valor das suas despesas totais \nR$")
    var despesas = scan.nextDouble()

    saldoAnual = (salario - despesas) * 12

    tempo = 1000000/ saldoAnual

    println("Para polpar R$1.000.000,00, você irá precisar em média de ${con.format(tempo)} anos")
}