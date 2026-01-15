package com.example.codigo2dam.optprog.desafios.disenio_algoritmos;

import java.util.*;

public class GuijarrosBalanza {

    private List<Integer> piedras;
    private int mitad;


    public boolean backtracking(int indice, int suma) {
        suma += piedras.get(indice);

        if (suma == mitad)
            return true;
        else if (suma > mitad)
            return false;

        for (int i=1; i<(piedras.size() - indice); i++) {
            if (backtracking(indice + i, suma)) {
                return true;
            }
        }

        return false;
    }



    public void registrarEntrada() {
        Scanner sc = new Scanner(System.in);

        int cantGuijarros;
        while ((cantGuijarros = sc.nextInt()) != 0) {
            piedras = new ArrayList<>();
            int sumaTotal = 0;
            for (int i=0; i<cantGuijarros; i++) {
                int piedra = sc.nextInt();
                piedras.add(piedra);
                sumaTotal += piedra;
            }
            mitad = sumaTotal/2;

            boolean esPosible = backtracking(0, 0);

            System.out.println(esPosible ? "SI" : "NO");
        }
    }

    public static void main(String[] args) {

        GuijarrosBalanza gb = new GuijarrosBalanza();
        gb.registrarEntrada();

    }



}
