/*
Viktor lives in a far and cold country named Krakovia that is passing by difficult times. 
Viktor works in a factory and after a work day he often goes with some friends to a bar to drink some beers and to dream with better times. 
Due to some economical problems the in ation is very high in Krakovia and a beer costs about 5,400,000,000 Krakovian dollars. 
Because this, is hard to check the value of the bill and to divide its value equally by Viktor and his friends. As you have a good heart you have decided to help them to solve this problem.
Input
There will be several test cases, each test case stats with two numbers 1 ≤ N ≤ 1000 that is the number of itens in the bill and 1 ≤ F ≤ 20 that represents how many friends are in the bar and should pay the bill. 
Then there will be N lines, each line represents the value of a item. The value of a item is indicated by an integer 1 ≤ V ≤ 1020. Input is terminated by a bill where N = F = 0.
Output
For each test case you should print the message: `Bill #N costs S: each friend should pay P ', where N represents the number of the bill, 
starting from 1; S indicates the sum of the itens of the bill; and P is how much money each friend should pay, 
you should calculte this value by dividing the total value of the bill by the number of friends in the bar, if the result is not an integer value just print the integer part of the number, 
see the sample input/output. 
After each test case, you should print a blank line.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class Krakovia  {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            
            int items;
            BigInteger personas;
            int casos=0;
            BigInteger precioTotal= new BigInteger("0");
            PrintWriter pw = new PrintWriter(System.out);
            while(true){
                String[] listaNum = br.readLine().split(" ");
                items = Integer.parseInt(listaNum[0]);
                personas = new BigInteger(listaNum[1]);
                if(items==0 && personas.equals(BigInteger.ZERO)){
                    break;
                }
                casos++;
                for(int i=0; i<items;i++){
                    BigInteger precioItem = new BigInteger(br.readLine());
                    precioTotal = precioTotal.add(precioItem);
                }
                
                BigInteger porPersona = precioTotal.divide(personas);
                pw.printf("Bill #%d costs %s: each friend should pay %s\n\n",casos,precioTotal,porPersona);
                
                pw.flush();
                precioTotal = BigInteger.ZERO;
        }
        }catch(IOException e){
            e.printStackTrace();
        }
        

 
    }
}
