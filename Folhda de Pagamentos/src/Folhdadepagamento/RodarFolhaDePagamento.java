package Folhdadepagamento;

import java.util.*;

public class RodarFolhaDePagamento
{
    private static int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    private static int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
    private static int ano = Calendar.getInstance().get(Calendar.YEAR);
    private static int diasemana = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
    private  static int sexta2 = 0;

    public static void Roll(ArrayList<Empregado> empregados)
    {



        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
        System.out.println();
        int flag = 0;

        if (dia == 29 && diasemana == 6) {
            flag = 1;
        } else if (dia == 28 && diasemana == 6) {
            flag = 1;
        } else if (dia == 30 && diasemana != 7 && diasemana != 1) flag = 1;

        for (int j = 0; j < empregados.size(); j++)
        {


            if(empregados.get(j).getTipo().equals("horista") && diasemana == 6) empregados.get(j).rodarFolha(empregados.get(j));
            else if (empregados.get(j).getTipo().equals("assalariado") && flag == 1) empregados.get(j).rodarFolha(empregados.get(j));
            else if (empregados.get(j).getTipo().equals("comissionado") && diasemana == 6 && ((sexta2%2 == 0) || (sexta2 == 0))) empregados.get(j).rodarFolha(empregados.get(j));

            dia++;
            diasemana++;
            if (dia == 31 && mes != 12)
            {
                dia = 1;
                mes++;
            }
            if (diasemana == 8) diasemana = 1;
            if (dia == 31 && mes == 12)
            {
                ano++;
                mes = 1;
                dia = 1;
            }
            if (diasemana == 6) sexta2++;

        }
    }

}
