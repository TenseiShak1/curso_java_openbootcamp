package java_basico;

import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int valor_producto;double resultado, iva;
        System.out.println("Digite el valor del producto");
        valor_producto= dato.nextInt();
        System.out.println("Digite el porcentaje de IVA del producto como numero entero.");
        iva= dato.nextInt();

        resultado = valor_producto + (valor_producto / iva);
        System.out.println("Valor del Producto con el iva incluido: "+resultado);

    }

}
