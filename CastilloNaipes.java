/*
  Debido a la ascendencia británica de mi abuela, en la familia hay mucha afición al bridge. Cada vez que se ponen a jugar empiezan a decir cosas extrañas como subasta, tres sin triunfo, 
ser el muerto o slam. Yo no entiendo nada. Solo espero pacientemente a que llegue la hora del té y dejen de jugar, para coger las cartas y ponerme a hacer castillos, que es lo que me gusta.

Para montarlos, empiezo colocando varias parejas de cartas formando triángulos consecutivos que recuerdan a una sucesión de letras A sin la línea horizontal del centro. 
Encima, entre cada par de triángulos, pongo una carta que hace las veces de "suelo" para el siguiente nivel, y repito el procedimiento, con un triángulo menos que en el piso previo. 
Después de un rato llego a la cúspide, con un único triángulo.

A veces hago un mal movimiento y se me desmorona todo el castillo. Pero lo que peor llevo es cuando, a mitad del montaje, me quedo sin cartas y se queda a mitad mi gran obra.*/


import java.util.Scanner;

public class CastilloNaipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for(int i=0; i<casos;i++){
           long numero = sc.nextInt();
          /*Uso de formula aritmetica modificada tanto para los pisos /\ como para el suelo --*/
           long numeroPisos= (numero*(2+numero*2))/2;
           long numeroSuelo = (numero*(numero-1))/2;
           long total= numeroPisos+numeroSuelo;
           System.out.println(total);
        }
    }
}
