/*******************************************
* Autor : André Philipe
* Data criacao: 26/03/2022
* Nome do arquivo: Classe Pessoa
* Arquivo de implementacao da classe pessoa
*******************************************/

/****Pacote da classe****/
package acc.br.cadastro.model;

//INICIO: Imports da classe
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.databind.ObjectMapper;
//FIM: Imports da classe

@Table
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ")
    @Column(name="IDpessoa")
    public Integer idPessoa;

    @Column(name="PESSOAnome", nullable=false, length=45)
    private String pessoaNome;

    @Column(name="PESSOACPF", nullable=false, length=14)
    private String cpf;

    /*INICIO: enun sexo*/ 
    public enum Sexo {

        MASCULINO,
        FEMININO,
        OUTROS;
    }
    /*FIM: enun sexo*/ 

    @Column(name = "PESSOASexo")
    private String pessoaSexo;

    @Column(name = "PessoaTipo")
    private String pessoaTipo;

    @Column(name = "Turma_idTurma")
    public int turma_idTurma;

    /*INICIO: Getters E Setters idPessoa*/ 
    public Integer getIdPessoa() {
        return idPessoa;
    }
    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }
    /*FIM: Getters E Setters idPessoa*/ 

    /*INICIO: Getters E Setters pessoaNome*/ 
    public String getPessoaNome() {
        return pessoaNome;
    }
    public void setPessoaNome(String pessoaNome) throws Exception 
    {

        if(pessoaNome == null || pessoaNome == ""){
            throw new Exception("O Campo Nome e obrigatorio.");
        }
        else if(pessoaNome.length() > 45)
        {
            throw new Exception("O numero de caracteres para o campo deve ser menor ou igual a 45.");
        }
        else
        {
           this.pessoaNome = pessoaNome; 
        }
    }
    /*INICIO: Getters E Setters pessoaNome*/ 
    
    /*INICIO: Getters E Setters PESSOASexo*/ 
    public String getPessoaSexo() {
        return pessoaSexo;
    }
    public void setPessoaSexo(String pessoaSexo) throws Exception {

        this.pessoaSexo = pessoaSexo;
        System.out.println("INICIO: case pessoaSexo");
        switch (pessoaSexo){

            case "MASCULINO":
                System.out.println("O sexo informado é MASCULINO");
                this.pessoaSexo = new ObjectMapper().writeValueAsString(Sexo.MASCULINO);
                break;

            case "FEMININO":
                System.out.println("O sexo informado é FEMININO");
                this.pessoaSexo = new ObjectMapper().writeValueAsString(Sexo.FEMININO);
                break;

            case "OUTROS":
                System.out.println("O sexo informado é OUTROS");
                this.pessoaSexo = new ObjectMapper().writeValueAsString(Sexo.OUTROS);
                break;

            case "":
                throw new Exception("O campo sexo é obrigatorio.");


            case "null":
                throw new Exception("O campo não pode ser NULL.");

            default:
                throw new Exception("Os dados válidos são 'MASCULINO, FEMININO OU OUTROS.'");
            
        
        }
        System.out.println("FIM: case pessoaSexo");
    }
    /*FIM: Getters E Setters PESSOASexo*/ 

    /*INICIO: Getters and Setters PessoaTipo*/ 
    public String getPessoaTipo() {
        return pessoaTipo;
    }
    public void setPessoaTipo(String pessoaTipo) throws Exception {
        this.pessoaTipo = pessoaTipo;
        String alunoB = "ALUNO";
        String alunoNb = "ALUNOBOLSISTA";
        if(pessoaTipo == "" || pessoaTipo == null){

            throw new Exception("O campo tipo é obrigatorio.");
        }
        else if(pessoaTipo.equals(alunoB) || pessoaTipo.equals(alunoNb) == true)
        {
            System.out.println(pessoaTipo);
            this.pessoaTipo = pessoaTipo;
        }
        else
        {
            throw new Exception("Os valores tipo devem ser ALUNO OU ALUNOBOLSISTA..");
        }

    }
    /*FIM: Getters E Setters PessoaTipo*/ 

    /*INICIO: Getters E Setters PESSOACPF*/ 
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) throws Exception {

        if(cpf == null || cpf == ""){
            throw new Exception("O Campo CPF e obrigatorio.");
        }
        else if(cpf.length() > 14)
        {
            throw new Exception("O numero de caracteres para o campo deve ser menor ou igual a 14.");
        }
        else
        {
           this.cpf = cpf; 
        }
    }
    /*FIM: Getters E Setters PESSOACPF*/ 

    /*INICIO: Getters E Setters Turma_idTurma*/ 
    public int getTurma_idTurma() {
        return turma_idTurma;
    }
    public void setidTurma(int turma_idTurma) {
        this.turma_idTurma = turma_idTurma;
    }
    /*FIM: Getters E Setters Turma_idTurma*/ 

}
