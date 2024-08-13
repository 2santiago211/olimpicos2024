package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        //PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALLAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS

        //TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES SURAMERICANOS

        ////////////////////////////////////////////////////////////////

        ArrayList<String> paises=new ArrayList<>();
        ArrayList<Integer> medallas=new ArrayList<>();
        Scanner leerTeclado=new Scanner(System.in);

        System.out.println("***Olimpicos 2024***");


        for (int i=0; i<2; i++){
            String pais;
            int sumatoriaMedallas=0;
            System.out.print("Ingrese un pais: ");
            pais=leerTeclado.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE MEDALLAS DE CADA PAIS
            System.out.print("Digita el numero de medallas de oro de "+pais+": ");
            int medallasOro=leerTeclado.nextInt();
            System.out.print("Digita el numero de medallas de plata de "+pais+": ");
            int medallasPlata= leerTeclado.nextInt();
            System.out.print("Digita el numero de medallas de bronce de "+pais+": ");
            int medallasBronce= leerTeclado.nextInt();
            sumatoriaMedallas=medallasOro+medallasPlata+medallasBronce;
            System.out.println(pais+" Obtuvo en total: "+sumatoriaMedallas+" Medallas en Paris");

            leerTeclado.nextLine();
            medallas.add(sumatoriaMedallas);
        }

        //RECORRIENDO UN ARREGLO
        int paisMayor=medallas.get(0);
        System.out.println("El pais con mas medallas obtuvo un total de medallas: ");
        for (Integer medalla:medallas){
            System.out.println(medallas);

            if (medalla>paisMayor){
                paisMayor=medalla;

            }

        }
        System.out.println("El pais con mas medallas obtuvo un total de : "+paisMayor );
//QUIERO PREGUNTAR CUAL ES EL CAJON INDICE DONDE SE GUARDO LA CANTIDAD DE MEDALLAS MAYOR
          int indiceGanador=medallas.indexOf(paisMayor);
        System.out.println("el indice ganador es: "+indiceGanador);

//quiero obtener el valor que hay dentro de un cajon
        System.out.println("Asi pues el pais ganador fue: "+paises.get(indiceGanador));



    }
}
