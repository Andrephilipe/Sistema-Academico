/****************************************************
* Autor : André Philipe
* Data criacao: 26/03/2022
* Nome do arquivo: Classe AlunosTurmas
* Arquivo de implementacao da classe AlunosTurmas
**************************************************/

/****Pacote da classe****/
package acc.br.cadastro.model;

/***INICIO: Imports da classe***/
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/***FIM: Imports da classe***/
 
@Entity
@Table
public class AlunosTurmas {
     
    @Id
    @Column(name = "idTurmas")
    private int idTurmas;
 
    @Column(name = "Aluno_IDTurma")
    private int aluno_IDTurma;
 
    /*INICIO: Getters E Setters idTurmas*/ 
    public int getidTurmas() {
        return idTurmas;
    }
    public void setidTurmas(int idTurmas) {
        this.idTurmas = idTurmas;
    }
    /*FIM: Getters E Setters idTurmas*/ 
 
    /*INICIO: Getters E Setters aluno_IDTurma*/ 
    public int getaluno_IDTurma() {
        return aluno_IDTurma;
    }
    public void setaluno_IDTurma(int aluno_IDTurma) {
        this.aluno_IDTurma = aluno_IDTurma;
    }
    /*FIM: Getters E Setters aluno_IDTurma*/ 
 
}