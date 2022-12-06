package br.com.dio.padroes.padroesspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.padroes.padroesspring.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
