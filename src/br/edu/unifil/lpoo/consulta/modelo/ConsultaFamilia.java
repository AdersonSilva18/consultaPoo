package br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta {

    @Override
    public Double getValorConsulta() {
        if (getNumeroDependente() > 2) {
            return valorConsulta - (valorConsulta * 0.50);
        }
        return valorConsulta;
    }
}
