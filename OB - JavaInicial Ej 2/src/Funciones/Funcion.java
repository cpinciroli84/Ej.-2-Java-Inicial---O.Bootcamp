package Funciones;

public class Funcion {
    public static void main(String[] args) {
        double resultado = getPrice(250);
        System.out.println(resultado);
    }

    // en Argentina el valor del IVA es del 21%
    static double getPrice(double costo){
        return costo * 1.21;
    }
}
