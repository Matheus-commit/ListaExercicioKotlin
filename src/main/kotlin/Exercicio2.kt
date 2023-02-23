import java.util.Scanner

fun main (){

    //Faça um programa que calcule o valor a ser pago por uma dívida em
    //atraso. O usuário deve informar o valor original da dívida (ex. R$ 50,00),
    //a quantidade de dias em atraso (ex. 35 dias) e o valor da multa por dia
    //de atraso (ex. R$ 0,25).

    val scan = Scanner(System.`in`)
    var valorTotal: Double
    var valorTotalJuros: Double


    print("Digite o valor original da divida\nR$")
    var valorDivida: Double = scan.nextDouble()

    print("Quantidade de dias em atraso: ")
    var dias: Int = scan.nextInt()

    print("Quanto de juros por dia foi cobrado?\nR$")
    var juros: Double = scan.nextDouble()

    valorTotalJuros = juros * dias
    valorTotal = valorDivida + valorTotalJuros

    println("Valor do juros total R%$valorTotalJuros\nValor total da dívida R$$valorTotal")

}