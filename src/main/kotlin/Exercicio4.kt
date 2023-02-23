import java.text.DecimalFormat
import java.util.Scanner

fun main (){

//Faça um programa que calcule a área total (m2) de uma casa com 4
//cômodos. O usuário deve inserir a largura e comprimento de cada um
//dos cômodos, calcular a área individual de cada um e por fim exibir a
//área total da casa.
// M² = COMPRIMENTO x LARGURA

    val scan = Scanner(System.`in`)
    var total: Double = 0.0
    val c = DecimalFormat("#,00")



    print("Digite o nome do comodo: ")
    var comodo1 = readlnOrNull()

    println("Digite a Comprimento do $comodo1: ")
    var lComodo1 = scan.nextDouble()

    println("Digite o Largura do $comodo1: ")
    var cComodo1 = scan.nextDouble()

    total += (lComodo1 * cComodo1)

    //2
    print("Digite o nome do segundo comodo: ")
    var comodo2 = readlnOrNull()

    println("Digite a Comprimento do $comodo2: ")
    var lComodo2 = scan.nextDouble()

    println("Digite o Largura do $comodo2: ")
    var cComodo2 = scan.nextDouble()

    total += (lComodo2 * cComodo2)

    //3

    print("Digite o nome do tereiro comodo: ")
    var comodo3 = readlnOrNull()

    println("Digite a Comprimento do $comodo3: ")
    var lComodo3 = scan.nextDouble()

    println("Digite o Largura do $comodo3: ")
    var cComodo3 = scan.nextDouble()

    total += (lComodo3 * cComodo3)

    //4

    print("Digite o nome do quarto comodo: ")
    var comodo4 = readlnOrNull()

    println("Digite a Comprimento do $comodo4: ")
    var lComodo4 = scan.nextDouble()

    println("Digite o Largura do $comodo4: ")
    var cComodo4 = scan.nextDouble()

    total += (lComodo4 * cComodo4)

    println("A casa possui o tamanho útil de: ${c.format(total)}" + "M2")

}