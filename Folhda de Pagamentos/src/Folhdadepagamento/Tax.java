package Folhdadepagamento;

import java.util.*;

public class Tax
{
    public static void TaxDefine(ArrayList<Empregado> empregados)
    {
        System.out.println("Digite o numero de identificacao do empregado:");
        Scanner input = new Scanner(System.in);
        int ids = input.nextInt();
        if (empregados.get(ids).isSindicato())
        {
            System.out.print("Digite a taxa de servico: ");
            empregados.get(ids).setTaxaDeServico(input.nextDouble());
            System.out.println("Feito");
        }
        else System.out.println("Empregado não pertence a um sindicato");
    }
}
