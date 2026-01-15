import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mejillones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(sc.hasNext()){
            int numero=sc.nextInt();
            sc.nextLine();
            List<Integer> pilaMejillones =new ArrayList<>();
            for (int i = 0; i < numero; i++) {
                int mejillonActual=sc.nextInt();
                int posicion =Mejillones.busqueda(pilaMejillones,mejillonActual);

                if(posicion>pilaMejillones.size()-1){
                    pilaMejillones.add(mejillonActual);
                }else{
                    pilaMejillones.set(posicion, mejillonActual);


                }
            }
            sc.nextLine();
            System.out.println(pilaMejillones.size());
        }
    }
    public static int busqueda(List<Integer> array,int objetivo){
         int inicio=0;
         int fin= array.size()-1;
         int res =array.size();
         while(inicio<=fin){
             //usar este
             int medio=inicio+(fin-inicio)/2;
             if(array.get(medio)>objetivo){
                 res = medio;
                 fin =medio-1;
             }else{
                 inicio = medio+1;
             }
         }
         return res;
    }
}
