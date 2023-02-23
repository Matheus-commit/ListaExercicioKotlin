import java.text.DecimalFormat
import java.util.Scanner

fun main() {
//Faça um programa que calcule a média de consumo de combustível de um
//veículo. O usuário deve informar o KM inicial (ex. 12500 km), o KM
//final (ex. 12700 km) e quantos litros foram gastos no percurso.

    val scan = Scanner(System. `in`)
    var total = 0.0
    var dec = DecimalFormat("#.00")

    println("Digite o km inicial: ")
    var kmInicial = scan.nextDouble()

    println("Digite a quilometragem final: ")
    var kmFinal = scan.nextDouble()

    println("Quantos litros foram gastos/abastecidos no percurso?")
    var litros = scan.nextDouble()

    total = kmFinal - kmInicial

    total /= litros

    println("O carro realizou ${dec.format(total)}" + "km/L")
}

