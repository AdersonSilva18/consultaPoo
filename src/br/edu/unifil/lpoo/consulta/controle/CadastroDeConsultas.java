package br.edu.unifil.lpoo.consulta.controle;

import br.edu.unifil.lpoo.consulta.modelo.Consulta;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeConsultas {
    public List<Consulta> listaConsulta = new ArrayList<>();

    public void incluirConsulta(Consulta consulta) {
        listaConsulta.add(consulta);
    }

    public void exibirContasByType(String type) throws Exception {
        for (Consulta consulta : listarConsultarByType(type)) {
            System.out.println("Matricula: "+ consulta.getMatricula());
            System.out.println("Nome do Paciente: "+ consulta.getNomePaciente());
        }
    }

    public Integer countConsultasByType(String type){
        return listarConsultarByType(type).toArray().length;
    }

    public List<Consulta> listarConsultarByType(String type){
        List<Consulta> listaFiltrada = new ArrayList<>();
        for (Consulta consulta : listaConsulta) {
            String classTypeName = "";
            String className = consulta.getClass().getSimpleName();

            switch (type) {
                case "PRATA":
                    classTypeName = "ConsultaPrata";
                case "OURO":
                    classTypeName = "ConsultaOuro";
                case "DIAMANTE":
                    classTypeName = "ConsultaDiamante";
                case "FAMILIA":
                    classTypeName = "ConsultaFamilia";
            }

            if (className.equals(classTypeName)) {
                listaFiltrada.add(consulta);
            }
        }
        return listaFiltrada;
    }


    public Double getValorTotalConsultaByType(String type){
        Double valorTota = 0.0;
        for (Consulta consulta: listarConsultarByType(type)) {
            valorTota+= consulta.getValorConsulta();
        }
        return valorTota;
    }
}
