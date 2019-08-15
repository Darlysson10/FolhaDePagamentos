# FolhaDePagamentos
Padrões de Projeto + Code Smells
Projeto solicitado pelo professor Baldoino Fonseca dos Santos Neto, da disciplina de Projeto de Software, da Universidade Federal de Alagoas(UFAL). https://sites.google.com/a/ic.ufal.br/comp215/ Linguagem de programação: Java Compilação: jdk 8 Projeto Folha de Pagamentos com Design Patterns e Code Smells. Desenvolvido no IntelliJ IDEA.
Padrões de projeto aplicados:
Padrão expert: Foi colocada a classe Empregado como a responsável por todos os dados dos funcionários que serão adicionados. Cada funcionário possui uma especificação que são subclasses de empregados (horista, comissionado, assalariado)
Creator - usado para determinar qual o tipo de funcionário será criado, daí determina-se o objeto que deve ser criado, nesse caso, por exemplo, a classe Add tem a responsabilidade de criar a classe horista caso o dado de inicialização seja a string "horista".
O último padrão GRASP usado foi o Abstract Factory. Pode-se observar que a classe Empregado é abstrata e que as classes Horista,Comissionado e Assalariado extendem a classe Empregado. Daí podemos fazer qualquer alteração nas classes que extendem sem afetar a classe abstrata Empregado.
