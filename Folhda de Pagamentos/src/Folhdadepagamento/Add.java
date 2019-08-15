package Folhdadepagamento;
import java.util.*;
import java.util.Scanner;

public class Add
{
   public static void Adicionar(ArrayList<Empregado> empregados)
   {
       Scanner input2 = new Scanner(System.in);
       String in2;

       System.out.println("Digite o tipo de empregado:\n horista,  assalariado ou  comissionado");
       in2 = input2.nextLine();
       if (in2.equals("horista")) {
           Horista employee = new Horista();
           employee.addEmpregado(employee,empregados.size());
           empregados.add(employee);
       } else if (in2.equals("assalariado")) {
           Assalariado employee = new Assalariado();
           employee.addEmpregado(employee,empregados.size());
           empregados.add(employee);
       } else if (in2.equals("comissionado")) {
           Comissionado employee = new Comissionado();
           employee.addEmpregado(employee,empregados.size());
           empregados.add(employee);
       }
   }

}
