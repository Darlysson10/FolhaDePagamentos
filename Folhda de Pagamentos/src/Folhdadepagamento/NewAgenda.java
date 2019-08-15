package Folhdadepagamento;

import java.util.*;

public class NewAgenda
{
    public static void AgendaNew(ArrayList<Empregado> empregados)
    {
        System.out.println("Digite o número de identificação do empregado");
        Scanner input = new Scanner(System.in);
        String freq1,freq2;
        int freq3;
        int  ids = input.nextInt();
        String getString = input.nextLine();
        System.out.println("Digite a frequência de pagamento: Mensal ou Semanal.\n" +
                "Se for mensal, digite o dia do pagamento.\n" +
                "Se for semanal, informe o intervalo de semanas de pagamento e o dia da semana para ser pago." +
                "\nO último dia útil do mês é considerado como $.");
        System.out.println("Por exemplo, se for mensal, digite: mensal 1 (significa que sera pago todo dia 1 do mes).\n" +
                "Se for semanal, digite: semanal 2 sexta(significa que sera pago a cada 2 semanas na sexta)\n\n");
        System.out.println("Digite se é mensal ou semanal");
        freq1 = input.nextLine();

        System.out.println("Digite a frequência de pagamento (inteiro)");
        freq3 = input.nextInt();
        if (freq1.equals("semanal")){
            System.out.println("Digite o dia da semana de pagamento");
            freq2 = input.nextLine();
            empregados.get(ids).setNovaAgenda("semanal");
            empregados.get(ids).setFreq(freq3);
            empregados.get(ids).setDia(freq2);
        }
        else if (freq1.equals("mensal"))
        {
            empregados.get(ids).setNovaAgenda("mensal");
            empregados.get(ids).setFreq(freq3);
        }
    }
}
