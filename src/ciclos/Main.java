package ciclos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int numero;
        do{
            System.out.println("Ingresa numero: ");
            numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;
        }while(contador < numeros.length);

     /*   contador = 0;
        do{
            System.out.println(numeros[contador]);
            contador++;
        }while(contador < numeros.length);
*/
        for (contador= 0; contador < numeros.length; contador++){
            System.out.println(numeros[contador]);
        }
    }
}
