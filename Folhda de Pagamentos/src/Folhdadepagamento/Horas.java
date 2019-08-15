package Folhdadepagamento;
import java.util.*;
public class Horas
{
    public static void HoristaEspecifc(ArrayList<Empregado> empregados)
    {
        System.out.println("Digite o número de identificação do empregado:");
        Scanner input = new Scanner(System.in);
        int ids = input.nextInt();
        String getString = input.nextLine();
        if (empregados.get(ids).getTipo().equals("horista"))
        {
            empregados.get(ids).cartaoPonto(empregados.get(ids));
        }
        else System.out.println("Empregado não é horista");
    }
}
