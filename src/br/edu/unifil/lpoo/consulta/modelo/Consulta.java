package br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {

    private String nomePaciente;
    private Long matricula;
    protected Long  numeroDependente;
    protected Integer anoInclusaoPlano;
    protected Double valorConsulta;

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Long getNumeroDependente() {
        return numeroDependente;
    }

    public void setNumeroDependente(Long numeroDependente) {
        this.numeroDependente = numeroDependente;
    }

    public Integer getAnoInclusaoPlano() {
        return anoInclusaoPlano;
    }

    public void setAnoInclusaoPlano(Integer anoInclusaoPlano) {
        this.anoInclusaoPlano = anoInclusaoPlano;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
