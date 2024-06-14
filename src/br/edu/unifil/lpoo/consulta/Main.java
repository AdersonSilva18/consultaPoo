package br.edu.unifil.lpoo.consulta;

import br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;
import br.edu.unifil.lpoo.consulta.modelo.Consulta;
import br.edu.unifil.lpoo.consulta.modelo.ConsultaPrata;

public class Main {

    public static void main(String[] args) {
        CadastroDeConsultas controle = new CadastroDeConsultas();

        try {
            controle.incluirConsulta(new ConsultaPrata());
            controle.exibirContasByType("PRATA");

        } catch (Exception e) {

        }
    }
}
