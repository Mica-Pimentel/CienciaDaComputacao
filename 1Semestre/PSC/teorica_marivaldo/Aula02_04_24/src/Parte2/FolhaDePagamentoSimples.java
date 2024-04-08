package Parte2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolhaDePagamentoSimples {

    public static void main(String[] args) {
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        Scanner in = new Scanner(System.in);

        System.out.println("INSERÇÃO DE FUNCIONARIOS");
        while (true) {
            System.out.println("Digite o nome do funcionario, ou digite 'fim' para encerrar:");
            String nome = in.nextLine();
            if (nome.equals("fim")) {
                break;
            }

            System.out.println("Digite o ID do funcionario:");
            int id = in.nextInt();
            in.nextLine();

            System.out.println("Digite a taxa por hora do funcionario:");
            double taxaPorHora = in.nextDouble();
            in.nextLine();

            Funcionario novoFuncionario = new Funcionario(nome, id, taxaPorHora);
            folhaDePagamento.adicionarFuncionario(novoFuncionario);
        }

        //INSERCAO MANUAL DAS HORAS TRABALHADAS
        folhaDePagamento.inserirHorasTrabalhadas();

        //EXIBINDO OS DETALHES DOS FUNCIONARIOS
        folhaDePagamento.exibirDetalhesFuncionarios();

        in.close();
    }

}

class Funcionario {

    String nome;
    int id;
    double taxaPorHora;
    int horasTrabalhadas;

    public Funcionario(String nome, int id, double taxaPorHora) {
        this.nome = nome;
        this.id = id;
        this.taxaPorHora = taxaPorHora;

    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getTaxaPorHora() {
        return taxaPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}

class FolhaDePagamento {

    List<Funcionario> funcionarios;

    public FolhaDePagamento() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularSalarioBruto(Funcionario funcionario, int horasTrabalhadas) {
        return horasTrabalhadas * funcionario.getTaxaPorHora();
    }

    public double calcularSalarioLiquido(double salarioBruto, double taxaImposto) {
        return salarioBruto * (1 - taxaImposto);
    }

    public void inserirHorasTrabalhadas() {
        Scanner in = new Scanner(System.in);
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Digite as horas trabalhadas por " + funcionario.getNome());
            int horasTrabalhadas = in.nextInt();
            funcionario.setHorasTrabalhadas(horasTrabalhadas);

        }
    }

    public void exibirDetalhesFuncionarios() {

        for (Funcionario funcionario : funcionarios) {
            System.out.println("nome: " + funcionario.getNome());
            System.out.println("ID: " + funcionario.getId());
            int horasTrabalhadas = funcionario.getHorasTrabalhadas();
            double salarioBruto = calcularSalarioBruto(funcionario, horasTrabalhadas);
            double salarioLiquido = calcularSalarioLiquido(salarioBruto, 0.1);//10%de IMPOSTO obs: FAZ UELI QUE SOBE PARA 50 
            System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
            System.out.println("Salário Bruto: " + salarioBruto);
            System.out.println("Salário Líquido: " + salarioLiquido);
            System.out.println("------------------------------------");
        }
    }

}
