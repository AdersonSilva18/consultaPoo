package br.edu.unifil.lpoo.consulta.visao;

import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.Scanner;

public class SistemaClinica {
    public static void main(String[] args) {
        CadastroDeConsultas cadastroDeConsultas = new CadastroDeConsultas();
        ConsultaPrata consultaPrata = new ConsultaPrata();
        consultaPrata.setValorConsulta(120.00);
        consultaPrata.setMatricula(12L);
        consultaPrata.setAnoInclusaoPlano(2024);
        consultaPrata.setNumeroDependente(122L);
        Scanner scanner = new Scanner(System.in);
        cadastroDeConsultas.incluirConsulta(consultaPrata);
        String controle = "start";
        while (controle != "s") {

            System.out.println("Selecione a opcao do painel");
            System.out.println("Escreva 1 para realizar uma consulta");
            switch (controle) {
                case "1":
                    System.out.println("Qual tipo de consulta deseja realizar?");
                    System.out.println("PRATA , OURO , DIAMANTE , FAMILIA");
                    Consulta consulta = new Consulta();
                    switch (scanner.nextLine()) {
                        case "PRATA":
                            consulta = new ConsultaPrata();
                        case "OURO":
                            consulta = new ConsultaOuro();
                        case "DIAMANTE":
                            consulta = new ConsultaDiamante();
                        case "FAMILIA":
                            consulta = new ConsultaFamilia();
                    }
                    System.out.println("Escreva o valor da consulta");
                    consulta.setValorConsulta(scanner.nextDouble());
                    System.out.println("");

                case "2":
                case "3":
                case "4":
                case "5":
            }
        }
    }
}
