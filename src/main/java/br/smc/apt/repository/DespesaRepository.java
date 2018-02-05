package br.smc.apt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.smc.apt.domain.Despesa;

@Repository
public interface DespesaRepository extends CrudRepository<Despesa, Long> {
}
