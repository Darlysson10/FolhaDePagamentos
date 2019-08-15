package Folhdadepagamento;

import java.util.*;

public class Remove
{
    public static void remover(ArrayList<Empregado> empregados){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o id do empregado que desejas remover");
        int idremove = input.nextInt();
        System.out.println("Removendo "+empregados.get(idremove).getNome());
        empregados.remove(idremove);
        System.out.println("Operação concluída");

    }
}
