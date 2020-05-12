/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Feeco
 */
public class MainFrameService {
     public static Boolean inserir(Aluno aluno) {
        Boolean sucesso = true;
        // Abrindo a conexão com o banco
        try {
            DataService.open();
            // Instanciando o objeto statement (stmt)
            Statement stmt = DataService.conn.createStatement();
            // Executando uma instrução SQL.
            // Instanciando o objeto preparedStatement (pstmt)
            PreparedStatement pstmt = DataService.conn.prepareStatement("INSERT INTO `TelaCadastro`.`Aluno` "
                    + "(Nome,Contrato,Ano,Turno,DataNasciemnto,DataMatricula,DataValidade,RG,CPF,Curso,Obs,Genero)"
                    + "VALUES ( ?,?,?,?,?,?,?,?,?,?,?,?)");
            // Setando o valor ao parâmetro 
            // Aluno.setName("")   
            pstmt.setString(1, aluno.getNome());
            pstmt.setString(2, aluno.getContrato());
            pstmt.setInt(3, aluno.getAno());
            pstmt.setString(4, aluno.getTurno());
            pstmt.setString(5, aluno.getNascimento());
            pstmt.setString(6, aluno.getDataMatricula());
            pstmt.setString(7, aluno.getDatavalidade());
            pstmt.setString(8, aluno.getRG());
            pstmt.setString(9, aluno.getCpf());
            pstmt.setString(10, aluno.getCurso());
            pstmt.setString(11, aluno.getObs());
            pstmt.setString(12, aluno.getSexo());
            // Fechando a conexão com o banco
            pstmt.execute();
            DataService.close();
        } catch (SQLException e) {
            sucesso = false;
            // Fechando a conexão com o banco
            DataService.close();
            e.printStackTrace();
        }
        return sucesso;
    }

    public static Boolean update(Aluno aluno) {
        Boolean sucesso = true;

        try {
            // Abrindo a conexão com o banco
            DataService.open();
            // Instanciando o objeto preparedStatement (pstmt)
            PreparedStatement pstmt = DataService.conn.prepareStatement("UPDATE aluno SET Nome = ?,Ano = ?,Turno = ?,DataNasciemnto = ?,DataMatricula = ?,DataValidade = ?,RG = ?,CPF = ?,Curso = ?,Obs = ?,Genero = ? Where Contrato = ?");
            // Setando o valor ao parâmetro 
            // aluno.setName("")
            pstmt.setString(1, aluno.getNome());
            pstmt.setInt(2, aluno.getAno());
            pstmt.setString(3, aluno.getTurno());
            pstmt.setString(4, aluno.getNascimento());
            pstmt.setString(5, aluno.getDataMatricula());
            pstmt.setString(6, aluno.getDatavalidade());
            pstmt.setString(7, aluno.getRG());
            pstmt.setString(8, aluno.getCpf());
            pstmt.setString(9, aluno.getCurso());
            pstmt.setString(10, aluno.getObs());
            pstmt.setString(11, aluno.getSexo());
            pstmt.setString(12, aluno.getContrato());
            // Fechando a conexão com o banco
            pstmt.execute();
            DataService.close();
        } catch (SQLException e) {
            sucesso = false;
            // Fechando a conexão com o banco
            DataService.close();
            e.printStackTrace();
        }

        return sucesso;
    }

    public static ArrayList<Aluno> getAll() {
        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            DataService.open();
            Statement stmt = DataService.conn.createStatement();
            // 
            ResultSet rs = stmt.executeQuery("SELECT id,Nome,Contrato,RG,CPF,Obs,Curso,Ano,Turno,DataMatricula,DataNasciemnto,DataValidade,Genero FROM aluno");
            while (rs.next()) {
                alunos.add(new Aluno(rs.getInt("id"),rs.getString("contrato"),rs.getString("nome"),
                        rs.getString("RG"), rs.getString("Cpf"), rs.getString("Obs"), rs.getString("Curso"),rs.getInt("Ano"),rs.getString("Turno"),
                        rs.getString("DataMatricula"),rs.getString("DataValidade"),rs.getString("DataNasciemnto"),rs.getString("Genero")));
            }
            DataService.close();
        } catch (SQLException e) {
            DataService.close();
            e.printStackTrace();
        }
        return alunos;
    }
    
   public static ArrayList<Aluno> getAllBusca(String busca, String valor) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        try {
            DataService.open();
            Statement stmt = DataService.conn.createStatement();
            // 
            ResultSet rs = stmt.executeQuery("SELECT id,Nome,Contrato,RG,CPF,Obs,Curso,Ano,Turno,DataMatricula,DataNasciemnto,DataValidade,Genero FROM aluno where " + busca +" = '"+ valor +"';");
            while (rs.next()) {
                alunos.add(new Aluno(rs.getInt("id"),rs.getString("contrato"),rs.getString("nome"),
                        rs.getString("RG"), rs.getString("Cpf"), rs.getString("Obs"), rs.getString("Curso"),rs.getInt("Ano"),rs.getString("Turno"),
                        rs.getString("DataMatricula"),rs.getString("DataValidade"),rs.getString("DataNasciemnto"),rs.getString("Genero")));
            }
            DataService.close();
        } catch (SQLException e) {
            DataService.close();
            e.printStackTrace();
        }
        return alunos;
    } 
   
   
   
   public static Aluno buscaraluno(String busca, String valor) {
        Aluno alunos = new Aluno();

        try {
            DataService.open();
            Statement stmt = DataService.conn.createStatement();
            // 
            ResultSet rs = stmt.executeQuery("SELECT id,Nome,Contrato,RG,CPF,Obs,Curso,Ano,Turno,DataMatricula,DataNasciemnto,DataValidade,Genero FROM aluno where " + busca +" = '"+ valor +"';");
            while (rs.next()) {
                new Aluno(rs.getInt("id"),rs.getString("contrato"),rs.getString("nome"),
                        rs.getString("RG"), rs.getString("Cpf"), rs.getString("Obs"), rs.getString("Curso"),rs.getInt("Ano"),rs.getString("Turno"),
                        rs.getString("DataMatricula"),rs.getString("DataValidade"),rs.getString("DataNasciemnto"),rs.getString("Genero"));
            }
            DataService.close();
        } catch (SQLException e) {
            DataService.close();
            e.printStackTrace();
        }
        return alunos;
    } 




   
   
    public static Boolean Delete(String Contrato) {
        Boolean sucesso = true;

        try {
            // Abrindo a conexão com o banco
            DataService.open();
            // Instanciando o objeto preparedStatement (pstmt)
            PreparedStatement pstmt = DataService.conn.prepareStatement("delete from aluno Where Contrato = ?");
            // Setando o valor ao parâmetro 
            // aluno.setName("")
            pstmt.setString(1, Contrato);
            // Fechando a conexão com o banco
            pstmt.execute();
            DataService.close();
        } catch (SQLException e) {
            sucesso = false;
            // Fechando a conexão com o banco
            DataService.close();
            e.printStackTrace();
        }

        return sucesso;
    }
}
