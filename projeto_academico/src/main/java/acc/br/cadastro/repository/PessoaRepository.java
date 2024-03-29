/**************************************************************************
* Autor : André Philipe
* Data criacao: 04/04/2022
* Nome do arquivo: PessoaRepository
* Arquivo de implementacao de repositorio da entidade PessoaRepository
****************************************************************************/

/****Pacote da classe****/
package acc.br.cadastro.repository;

//INICIO: Imports da interface
import org.springframework.data.repository.CrudRepository;
import acc.br.cadastro.model.Pessoa;
//FIM: Imports da interface

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{

}
