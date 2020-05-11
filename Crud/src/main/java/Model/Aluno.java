/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author Feeco
 */
public class Aluno {
    private Integer id;
    private String contrato;
    private String Nome;
    private String Nascimento;
    private String RG;
    private String Cpf;
    private String Obs;
    private String Curso;
    private int Ano;
    private String Turno;
    private String DataMatricula;
    private String Datavalidade;
    private String Foto;
    private String Sexo;
    
    public Aluno(){
    }
    
    public Aluno(String contrato, String nome,String RG, String Cpf, String Obs, String Curso,int Ano,String Turno,String DataMatricula,String Datavalidade,String Nascimento, String Sexo){
        this.contrato = contrato;
        this.Nome = nome;
        this.RG = RG;
        this.Cpf = Cpf;
        this.Obs = Obs;
        this.Curso = Curso;
        this.Ano = Ano;
        this.Turno = Turno;
        this.DataMatricula = DataMatricula;
        this.Datavalidade = Datavalidade;
        this.Nascimento = Nascimento;
        this.Sexo = Sexo;
    }
     public Aluno(Integer id,String contrato, String nome,String RG, String Cpf, String Obs, String Curso,int Ano,String Turno,String DataMatricula,String Datavalidade,String Nascimento, String Sexo){
        this.id= id;
        this.contrato = contrato;
        this.Nome = nome;
        this.RG = RG;
        this.Cpf = Cpf;
        this.Obs = Obs;
        this.Curso = Curso;
        this.Ano = Ano;
        this.Turno = Turno;
        this.DataMatricula = DataMatricula;
        this.Datavalidade = Datavalidade;
        this.Nascimento = Nascimento;
        this.Sexo = Sexo;
    }
    
    
     
    public Integer getid() {
        return id;
    }

    public void setContrato(Integer id) {
        this.id = id;
    }
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getDataMatricula() {
        return DataMatricula;
    }

    public void setDataMatricula(String DataMatricula) {
        this.DataMatricula = DataMatricula;
    }

    public String getDatavalidade() {
        return Datavalidade;
    }

    public void setDatavalidade(String Datavalidade) {
        this.Datavalidade = Datavalidade;
    }
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        // se for o mesmo objeto
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.contrato, other.contrato)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
