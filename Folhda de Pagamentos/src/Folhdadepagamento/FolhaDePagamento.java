package Folhdadepagamento;
import java.util.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = -1;
        String getString;
        int inputs = 0;
        int j,ids;

        int id = 0;

        java.util.ArrayList<Empregado> empregados = new java.util.ArrayList<Empregado>();
        java.util.ArrayList<Empregado> backupEmpregado = new java.util.ArrayList<Empregado>();
        Stack<ArrayList<Empregado>> undo = new Stack<ArrayList<Empregado>>();
        Stack<ArrayList<Empregado>> redo = new Stack<ArrayList<Empregado>>();



        while (in != 0) {
            System.out.println("\nO que deseja fazer?\n\n1 - Adicionar empregado\n" +
                    "2 - Remover empregado\n3 - Lancar cartao de ponto\n4 - Lancar resultado de venda\n" +
                    "5 -  Lancar uma taxa de servico\n6 - Alterar detalhes de um empregado\n" +
                    "7 - Rodar a folha de pagamento para hoje\n8 - Desfazer/Refazer\n" +
                    "9 - Agenda de pagamentos\n10 - Criar nova agenda de pagamento\n0 - Encerrar");

            in = input.nextInt();
            getString = input.nextLine();

            if (in > 0 && in <= 7) {
                    for (j = 0; j < id; j++) {
                        backupEmpregado.add(empregados.get(j));
                    }
                    undo.push(backupEmpregado);
                inputs++;
            }

            switch (in) {
                case 1:
                    Add.Adicionar(empregados);
                    id++;
                    break;
                case 2:
                   Remove.remover(empregados);
                    id--;
                    break;
                case 3:
                    Horas.HoristaEspecifc(empregados);
                    break;
                case 4:
                    Comissao.EmpregadoComissionado(empregados);
                    break;
                case 5:
                    Tax.TaxDefine(empregados);
                    break;
                case 6:
                    EditarEmpregado.Edit(empregados);
                    break;
                case 7:
                    RodarFolhaDePagamento.Roll(empregados);
                    break;
                case 8:
                    int action;
                    System.out.println("Pressione 1 para desfazer ou 2 para refazer");
                    action = input.nextInt();
                    if (inputs > 0)
                    {
                        if (action == 1)
                        {
                            redo.push(empregados);
                            empregados = undo.pop();
                            System.out.println("Desfeito");
                        }
                        else
                        {
                            undo.push(empregados);
                            empregados = redo.pop();
                            System.out.println("Refeito");
                        }
                    }
                    break;

                case 9:
                    AgendaPagamento.AgendaDePagamento(empregados);
                    break;
                case 10:
                    NewAgenda.AgendaNew(empregados);
                    break;


            }




        }
    }

}
