package Folhdadepagamento;
import java.util.*;
public class Comissao
{
    public static void EmpregadoComissionado(ArrayList<Empregado> empregados)
    {
        System.out.println("Digite o numero de identificacao do empregado:");
        Scanner input = new Scanner(System.in);
        int ids = input.nextInt();
        String getString = input.nextLine();
        if (empregados.get(ids).getTipo().equals("comissionado"))
        {
            empregados.get(ids).vendas(empregados.get(ids));
        }
        else System.out.println("O empregado nao e comissionado");
    }



}
