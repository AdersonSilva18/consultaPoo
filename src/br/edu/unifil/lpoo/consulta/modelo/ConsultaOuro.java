package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta{

    @Override
    public Double getValorConsulta() {
        if(super.anoInclusaoPlano <= 2000){
            return 0.0;
        }
        return valorConsulta - (valorConsulta *0.30);
    }
}
