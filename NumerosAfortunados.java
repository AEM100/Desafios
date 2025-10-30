/*
Numero del desafio = 146

Números afortunados
Tiempo máximo: 1,000-3,000 s  Memoria máxima: 16384 KiB
Dado un N ≥ 2, se llaman números afortunados a los que resultan de ejecutar el siguiente proceso: se comienza generando una lista que contiene los números desde 1 hasta N en este orden; 
se elimina de la lista un número de cada 2 (es decir, los números 1, 3, 5, etc.); de la lista final resultante se elimina un número de cada 3, etc.
El proceso termina cuando se va a eliminar un número de cada M y el número de elementos que quedan es menor que M. Los números que queden en la lista en este momento son los afortunados.

Entrada
La entrada consistirá en distintos casos de prueba, cada uno en una línea. Cada caso de prueba contiene el número con el que se calcularán los números afortunados. 
Ese número será siempre mayor o igual que 2 y no mayor que 100.000. La entrada terminará con un 0, que marcará el final de la entrada y no generará salida.

Salida
Para cada caso de prueba se escribirá una línea que contendrá al principio el N de partida, seguido por dos puntos, un espacio y todos los números afortunados en orden decreciente.

*/

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NumerosAfortunados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
         int listaNum;
        while ((listaNum=sc.nextInt())!=0) {
            int eliminacion = 3;
            Queue<Integer> cola = new ArrayDeque<>();
           
            for (int i = 2; i < listaNum + 1; i += 2) {
                cola.offer(i); 
            }
            while (cola.size()>= eliminacion) {
                int num= cola.size();
                for (int j = 0; j < num;j++) {
                    if (j%eliminacion==0) {
                        cola.poll();
                    } else {
                        cola.offer(cola.poll());
                    }
                }
                eliminacion++;
                
            }
            List<Integer> listaInvertida = new ArrayList<>(cola);
            Collections.reverse(listaInvertida);
            System.out.print(listaNum+":");
            for(int numero: listaInvertida){
                System.out.print(" "+numero);
            }
            System.out.println();
           
        }
    }
}
