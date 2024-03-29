/**************************************************************************
* Autor : André Philipe
* Data criacao: 04/04/2022
* Nome do arquivo: AlunoService
* Arquivo de implementacao de service da entidade AlunoService
****************************************************************************/

/****Pacote da classe****/
package acc.br.cadastro.services;

//INICIO: Imports do services
import java.util.ArrayList;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import acc.br.cadastro.model.Aluno;
import acc.br.cadastro.repository.AlunoRepository;
//FIM: Imports do services

@Service
public class AlunoService {
    
    @Autowired
    AlunoRepository alunoRepository;


    public List<Aluno> getAllAluno()
    {
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunoRepository.findAll().forEach(aluno -> alunos.add(aluno));
        return alunos;
    }

    public Aluno getAlunoById(Integer idAluno)
    {
        return alunoRepository.findById(idAluno).get();
    }

    public void saveOrUpdate(Aluno aluno)
    {
        alunoRepository.save(aluno);
    }

    public void delete(Integer idAluno)
    {
        alunoRepository.deleteById(idAluno);
    }

	public void save(Aluno alunos) {
	}

    public Aluno getById(int idAluno) {
        return null;
    }

}

