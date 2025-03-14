import java.util.Scanner;

public class Tarefa {
    public static void main(String[] args) {
 
            Scanner input = new Scanner(System.in);
        double peso = input.nextInt();
    double altura = input.nextDouble();
        
System.out.print("Digite o Peso : ");
       
System.out.print("Digite sua Altura : ");
        

// calcula o IMC
        double imc = peso / (altura * altura);

// exibe o IMC com 2 numeros
        System.out.printf("Seu IMC é: %.2f\f", imc);

// Classifica o tipo de IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        }
         else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Você está com o peso normal.");
         }
         else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
         }
         else {
            System.out.println("Você está com obesidade.");
        }

// Fecha o scanner
        input.close();
    }
}
