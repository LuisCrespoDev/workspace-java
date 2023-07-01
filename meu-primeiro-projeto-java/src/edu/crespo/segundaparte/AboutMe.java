package edu.crespo.segundaparte;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        //criando o objeto scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = sc.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        sc.close();   
        } 
        catch (InputMismatchException e){
            System.out.println("O campos idade e altura precisam ser númericos");
        }
        

    }
}