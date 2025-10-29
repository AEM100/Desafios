/*
Hoy he descubierto que mis profesores son humanos. 
Te acostumbras a verles entrar en clase, soltar su rollete e irse y de alguna manera tu subconsciente piensa que en el momento que abandonan el aula su existencia se queda en suspenso hasta la siguiente clase en la que vuelven a salir de su hibernación para contarte la siguiente parte del tema. 
En definitiva, que son entes sin una vida más allá del aula. Sin pasado. Sin futuro.

Pero, como digo, hoy he descubierto que son humanos. Estábamos en un exámen y estaba mi profesor vigilando para que no copiáramos mientras charlaba animadamente con otro que había venido a hacerle compañía1. La conversación que estaban teniendo no tiene desperdicio, porque estaban hablando de sus "tiempos mozos" cuando ellos mismos hacían exámenes,
así que no pude evitar prestar atención a lo que decían:

— …

— Había un catedrático cuya única aportación a la asignatura era idear la pregunta del examen que no supiera responder nadie.

— Igualito que ahora, que pasas por veinte versiones distintas de cada ejercicio hasta que das con uno que crees que van a saber hacer…

— Ya te digo. Pues han pasado 25 años y todavía me acuerdo de la pregunta que, naturalmente, nadie supo responder: "¿Qué número divisible por 3 tiene un factorial que termina con 16 ceros?". Flipa.

— ¡Ostras! ¡Qué bueno! Ese problema es chulísimo. De hecho está relacionado con esta asignatura. Igual alguno de estos sabría hacerlo —dijo señalándonos—. Ven que te lo explico.

Y se fueron hacia la pizarra; mientras uno explicaba, el otro se sorpendía de descubrir, 25 años después, cómo se resolvía el problema. Lo peor para mí fue que, 
sabiendo que la solución debería estar a mi alcance, me pasé el examen intentando resolverlo en lugar de centrarme en mis preguntas. Espero que no tengan que pasar 25 años para averiguar cómo se hace…
*/

import java.util.Scanner;

public class Despues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long d = sc.nextLong();
            long n = sc.nextLong();
            if (d == 0 && n == 0){
                break;
            }

            long resultado = buscarMinimoMultiplo(d, n);
            if (resultado == -1){
                System.out.println("NINGUNO");
            }
            else{
                System.out.println(resultado);
            }
        }
        
    }

    static long cerosFactorial(long k) {
        long count = 0;
        while (k > 0) {
            k /= 5;
            count += k;
        }
        return count;
    }

    static long buscarMinimoMultiplo(long d, long n) {
    long inicio = 1;
    long fin = 5 * (n+1) * d;
    long resultado = -1;

    while (inicio <= fin) {
        long centro = inicio + (fin - inicio) / 2;
        long k = centro * d; 
        long ceros = cerosFactorial(k);
        if (ceros < n) {
            inicio = centro + 1;
        } else {
            if (ceros == n) {
                resultado = k;
            } 
            fin = centro - 1;            
        }
    }

    return resultado; 
}



}
