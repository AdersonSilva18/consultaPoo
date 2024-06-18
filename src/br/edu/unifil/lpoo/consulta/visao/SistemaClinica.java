package br.edu.unifil.lpoo.consulta.visao;

import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.Scanner;

public class SistemaClinica {
    public static void main(String[] args) {
        CadastroDeConsultas cadastroDeConsultas = new CadastroDeConsultas();
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();
        while (opcao != 5) {
            System.out.println("Selecione a opção do painel:");
            System.out.println("1 - Realizar uma nova consulta");
            System.out.println("2 - Consultar consultas cadastradas por plano");
            System.out.println("3 - Consultar o total de consultas por plano");
            System.out.println("4 - Consultar o valor total de consultas por plano");
            System.out.println("5 - Sair");

            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de consulta deseja realizar?");
                    System.out.println("PRATA, OURO, DIAMANTE, FAMILIA");
                    String tipoConsulta = scanner.nextLine().toUpperCase();
                    Consulta consulta = null;

                    switch (tipoConsulta) {
                        case "PRATA":
                            consulta = new ConsultaPrata();
                            break;
                        case "OURO":
                            consulta = new ConsultaOuro();
                            break;
                        case "DIAMANTE":
                            consulta = new ConsultaDiamante();
                            break;
                        case "FAMILIA":
                            consulta = new ConsultaFamilia();
                            break;
                        default:
                            System.out.println("Tipo de consulta inválido!");
                            continue;
                    }

                    System.out.println("Informe o valor da consulta:");
                    double valorConsulta = scanner.nextDouble();
                    consulta.setValorConsulta(valorConsulta);

                    System.out.println("Informe a matrícula do paciente:");
                    long matricula = scanner.nextLong();

                    System.out.println("Informe o ano de inclusão no plano:");
                    int anoInclusao = scanner.nextInt();

                    System.out.println("Informe o número do dependente:");
                    long numeroDependente = scanner.nextLong();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    consulta.setMatricula(matricula);
                    consulta.setAnoInclusaoPlano(anoInclusao);
                    consulta.setNumeroDependente(numeroDependente);

                    cadastroDeConsultas.incluirConsulta(consulta);
                    System.out.println("Consulta incluída com sucesso!");
                    break;

                case 2:
                    try {
                        System.out.println("Informe o tipo de plano (PRATA, OURO, DIAMANTE, FAMILIA):");
                        String planoConsulta = scanner.nextLine().toUpperCase();
                        cadastroDeConsultas.exibirContasByType(planoConsulta);
                    } catch (Exception e) {
                        System.out.println("Erro ao exibir consultas por tipo de plano: " + e.getMessage());
                    }

                    break;

                case 3:
                    System.out.println("Informe o tipo de plano (PRATA, OURO, DIAMANTE, FAMILIA):");
                    String planoTotal = scanner.nextLine().toUpperCase();
                    int totalConsultas = cadastroDeConsultas.countConsultasByType(planoTotal);
                    System.out.println("Total de consultas para o plano " + planoTotal + ": " + totalConsultas);
                    break;

                case 4:
                    System.out.println("Informe o tipo de plano (PRATA, OURO, DIAMANTE, FAMILIA):");
                    String planoValor = scanner.nextLine().toUpperCase();
                    double valorTotalConsultas = cadastroDeConsultas.getValorTotalConsultaByType(planoValor);
                    System.out.println("Valor total das consultas para o plano " + planoValor + ": " + valorTotalConsultas);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
