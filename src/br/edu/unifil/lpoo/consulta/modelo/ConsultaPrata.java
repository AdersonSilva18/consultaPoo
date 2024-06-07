package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta{

    @Override
    public Double getValorConsulta() {
        return valorConsulta - (valorConsulta *0.20);
    }
}
