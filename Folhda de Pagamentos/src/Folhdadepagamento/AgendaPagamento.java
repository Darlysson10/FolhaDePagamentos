package Folhdadepagamento;

import java.util.*;

public class AgendaPagamento
{
    public static void AgendaDePagamento (ArrayList<Empregado> empregados)
    {
        System.out.println("Agenda de pagamento\n");
        for (int j = 0; j < empregados.size(); j++)
        {
            empregados.get(j).novaAgenda(empregados.get(j));

        }
    }
}
