package br.smc.apt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.smc.apt.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
