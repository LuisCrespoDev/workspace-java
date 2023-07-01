package edu.crespo.primeiraparte;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + conta.saldo + " já está disponível para saque.");

    }
}
