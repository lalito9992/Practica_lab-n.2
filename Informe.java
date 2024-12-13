import java.util.Scanner;

public class Informe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //constantes: sueldo, comision y la utilidad
        final double SUELDO_MES = 2500.00;
        final double COMISION_POR_AUTO_VENDID = 250.00;
        final double UTILIDAD_VALOR_VENTAS = 0.05;

        int totalCarroosVendidos = 0;
        double valorTotalVentas = 0.00;
        boolean seguir = true;

        System.out.println("Porfavor ingresar el valor o valores de autos vendidos (coloque -1 para terminar):");

        while (seguir) {
            double valorAutoVendido = sc.nextDouble();
            if (valorAutoVendido == -1) {
                seguir = false; // Se acaba el bucle si se ingresa -1.
            } else {
                if (valorAutoVendido > 10000) {
                    totalCarroosVendidos++;
                    valorTotalVentas += valorAutoVendido;
                }
            }
        }

        double comisionTotal = totalCarroosVendidos * COMISION_POR_AUTO_VENDID;
        double utilidadTotal = valorTotalVentas * UTILIDAD_VALOR_VENTAS;
        double pagoTotal = SUELDO_MES + comisionTotal + utilidadTotal;

        System.out.println("Informe de Ventas:");
        System.out.println("Total de carros vendidos: " + totalCarroosVendidos);
        System.out.printf("Valor total de ventas: $%.2f%n", valorTotalVentas);
        System.out.printf("Sueldo mensual: $%.2f%n", SUELDO_MES);
        System.out.printf("Comisión total: $%.2f%n", comisionTotal);
        System.out.printf("Utilidad total: $%.2f%n", utilidadTotal);
        System.out.printf("sueldo total: $%.2f%n", pagoTotal);

        sc.close();
    }
}