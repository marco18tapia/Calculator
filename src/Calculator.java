import java.util.Scanner;

public class Calculator {


    double resultado = 0;

    public void Adicion(int numero1, int numero2)
    {
        resultado = numero1 + numero2;
        System.out.printf("La suma de: \n %d + %d = %.0f\n\n",numero1,numero2,resultado);
    }

    public void Sustraccion(int numero1, int numero2)
    {
        resultado = numero1 - numero2;
        System.out.printf("La resta de: \n %d - %d = %.0f\n\n",numero1,numero2,resultado);
    }

    public void Producto(int numero1, int numero2)
    {
        resultado = numero1 * numero2;
        System.out.printf("La multiplicacion de: \n %d * %d = %.0f\n\n",numero1,numero2,resultado);
    }

    public void Cociente(int numero1, int numero2)
    {
        resultado = numero1 / numero2;
        System.out.printf("La division de: \n %d / %d = %.5f\n\n",numero1,numero2,resultado);
    }

    public void Modulo(int numero1, int numero2)
    {
            resultado = numero1 % numero2;
            //residuo
            System.out.printf("El Cociente de la division de: \n %d entre %d es: %.0f\n\n", numero1, numero2, resultado);
    }

    public boolean IntentarNuevamente(){
        Scanner Tecla = new Scanner(System.in);


        System.out.println("Quieres continuar con la calculadora??\n 1)SI \n 2)NO");
        int continuar = Tecla.nextInt();
        if (continuar == 1) {
            System.out.println("Genial, Continuemos");
            return true;
        } else {
            System.out.println("Fin de la Calculadora.. De nada.");
            return false;
        }
    }

}




//    double total = cantidad +(cantidad * porcentaje /100);
//        System.out.printf("El total %.2f", total);