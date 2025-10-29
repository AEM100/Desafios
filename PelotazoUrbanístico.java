/*
  https://aceptaelreto.com/problem/statement.php?id=755
Moisés Eña está dispuesto a hacerse rico gracias al ladrillo. Ha comprado un gran terreno en un pueblecito bien comunicado y planea hacer una urbanización de lujo. 
Hace algún tiempo intentó forrarse haciendo pisos baratos para gente con recursos modestos y el tema no acabó muy bien.

Ahora ha puesto su punto de mira en gente más acaudalada y cree que la mejor forma de llamar su atención es haciendo viviendas unifamiliares en parcelas lo más grandes posible. 
Por eso quiere dividir su terreno en el menor número de parcelas posible, para que sean cuadradas y tan grandes como se pueda, 
siempre que todas sean iguales y cubran el terreno completo sin dejar espacio sin utilizar.*/

import java.util.Scanner;

public class PelotazoUrbanístico {

    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();

        long mcd;
        long numParcelas;
        for (int i=0; i<casos; i++) {

            long a = sc.nextLong();
            long b = sc.nextLong();

            mcd = gcd(a, b);

            numParcelas = (a * b) / (mcd*mcd);
            System.out.println(numParcelas);
        }
    }
}
