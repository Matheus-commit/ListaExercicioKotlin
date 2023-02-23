import java.text.DecimalFormat
import java.util.Scanner

//Faça um programa que calcule a conversão monetária de Real para
//Dólar. O usuário informa o valor da cotação do dólar (ex.: 2,12) e quanto
//em real deseja converter (ex. 150,00). O programa exibe quantos dólares
//valem os reais informados.

// Quanto 50 dolares vale em reais: R$5,44 x 50 = R$272

fun main(){

    var total: Double = 0.0
    val dec = DecimalFormat("#,00")

    val scan = Scanner(System.`in`)

    print("Digite o valor da cotação do dólar \nUS$ ")
    var valor1 = scan.nextDouble()

    print("Digite o valor em reais que deseja converter \nR$ ")
    var valor2 = scan.nextDouble()

    total = valor2 / valor1

    print("Conversão total é de US$${dec.format(total)}")

}