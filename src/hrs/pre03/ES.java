package hrs.pre03;

import java.util.Scanner;

public class ES {
    private static Scanner sc = new Scanner(System.in);
    
    public static int leerEntero() {
        return sc.nextInt();
    }

    public static long leerEnteroLargo() {
        return sc.nextLong();
    }

    public static float leerReal() {
        return sc.nextFloat();
    }

    public static double leerRealLargo() {
        return sc.nextDouble();
    }

    public static String leerCadena() {
        return sc.nextLine();
    }
    
    public static char leerCaracter() {
        String linea = sc.nextLine();
        
        return linea.charAt(0);
    }
    
    public static boolean leerBooleano() {
        return sc.nextBoolean();
    }
    
    public static void escribir(String linea) {
        System.out.print(linea);
    }

    public static void escribirLn(String linea) {
        System.out.println(linea);
    }
}
