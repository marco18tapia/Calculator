import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Tecla = new Scanner(System.in);
        Calculator obj = new Calculator();

        int Numero1 = 0;
        int Numero2 = 0;
        int Operador = 0;
        boolean calcular = true;

        System.out.println("BIENVENIDO..");

        while (calcular) {
            System.out.println("Ingresa el primer Numero: ");
            Numero1 = Tecla.nextInt();

            System.out.println("Ingresa el segundo Numero: ");
            Numero2 = Tecla.nextInt();

            System.out.println("Suma:1 - Resta:2 - Multiplicacion:3 - Division:4 - Residuo:5");
            System.out.println("Ingresa el Operador: ");
            Operador = Tecla.nextInt();

            if (Operador == 1) {
                obj.Adicion(Numero1, Numero2);

                //System.out.println("El resultado de la suma es: "+Resultado);
            } else if (Operador == 2) {
                obj.Sustraccion(Numero1, Numero2);
                //System.out.println("El resultado de la resta es: "+Resultado);
            } else if (Operador == 3) {
                obj.Producto(Numero1, Numero2);
                //System.out.println("El resultado de la multiplicaicon es: "+Resultado);
            } else if (Operador == 4) {

//            if(Numero2 == 0)
//            {
//                System.out.println("No se puede DIVIDIR entre CERO. XD..");
//            }
//            Resultado=Numero1/Numero2;
//            System.out.println("El resultado de la multiplicacion es: "+Resultado);
                obj.Cociente(Numero1, Numero2);
            } else if (Operador == 5) {
                obj.Modulo(Numero1, Numero2);

            } else {
                System.out.println("La opcion ingresada no existe. LOL");
            }
            calcular = obj.IntentarNuevamente();
        }


    }

}
