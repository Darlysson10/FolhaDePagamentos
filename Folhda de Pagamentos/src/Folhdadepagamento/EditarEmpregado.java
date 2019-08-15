package Folhdadepagamento;

import java.util.*;

public class EditarEmpregado
{
   public static void Edit(ArrayList<Empregado> empregados)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Digite o numero de identificacao do empregado:");
       int ids = input.nextInt();
       empregados.get(ids).editarEmpregado(empregados.get(ids));

   }

}
