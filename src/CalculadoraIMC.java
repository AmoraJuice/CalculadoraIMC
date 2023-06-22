import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o peso (em kg): ");
            float peso = scanner.nextFloat();

                System.out.println("Insira a altura (em metros): ");
                    float altura = scanner.nextFloat();

                    float imc = calculadoraIMC(peso, altura);

                        System.out.println("Seu IMC é: " + imc);

                if (imc < 18.5) {
                    System.out.println("abaixo do peso.");
                } else if (imc >= 18.5 && imc < 25) {
                        System.out.println("Peso ideal.");
                } else {
                        System.out.println("Acima do peso.");
                }
    }

    //segunda etapa criar um Method que recebe os parámetros pesos

    public static float calculadoraIMC(float peso, float altura) {
        return peso / (altura * altura);

    }
}