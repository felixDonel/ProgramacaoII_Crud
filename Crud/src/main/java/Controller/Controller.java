/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aluno;
import Service.MainFrameService;
import java.util.ArrayList;

/**
 *
 * @author Feeco
 */
public class Controller {
    
private ArrayList<Aluno> alunos;
private Aluno aluno;

    public Controller() {
        this.alunos = new ArrayList<>();
    }
    
    public Boolean addAluno(Aluno aluno) {
        // nao podemos ter alunos repetidos com o mesmo email
        // implementar
        // void  - sem retorno -> não podem ter efeitos colaterais
        boolean valid = true;
        
        // procurar pelo email
        // - restricao no banco -> email pode ser um campo unico
        // - consulta de validacão
        // -- se você tiver muitos dados
        // -- se não tiver cache em memória
        
        // - modificar para consulta de validação
        for (Aluno c : this.getAlunos()) {
            if(c.getContrato().equals(aluno.getContrato())) {
                
                valid = false;
                break;
            }
        }
        
        if(valid) {
            MainFrameService.inserir(aluno);
        }
        return valid;
    }

    public Boolean removeAluno(Aluno aluno) {
        boolean remove = this.alunos.remove(aluno);
        return remove;
    }

    public ArrayList<Aluno> getAlunos() {
        this.alunos = MainFrameService.getAll();
        return this.alunos;
    }
    public ArrayList<Aluno> getAlunosBusca(String busca,String valor) {
        this.alunos = MainFrameService.getAllBusca(busca, valor);
        return this.alunos;
    }
    public Aluno buscaraluno(String busca,String valor) {
        
        this.aluno = MainFrameService.buscaraluno( busca, valor);
        return this.aluno;
    }
    
    
public Boolean Delete(String Contrato) {
    
            MainFrameService.Delete(Contrato);
        
        return true;
    }




public Boolean upAluno(Aluno aluno) {
        // nao podemos ter alunos repetidos com o mesmo email
        // implementar
        // void  - sem retorno -> não podem ter efeitos colaterais
        boolean valid = true;
        
        // procurar pelo email
        // - restricao no banco -> email pode ser um campo unico
        // - consulta de validacão
        // -- se você tiver muitos dados
        // -- se não tiver cache em memória
        
        // - modificar para consulta de validação
        
        
        if(valid) {
            MainFrameService.update(aluno);
        }
        return valid;
    }
}
