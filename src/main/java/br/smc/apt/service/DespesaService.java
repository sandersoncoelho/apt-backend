package br.smc.apt.service;

import br.smc.apt.domain.Despesa;
import br.smc.apt.repository.DespesaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesaService {

    @Autowired
    DespesaRepository despesaRepository;

    public Iterable<Despesa> list(){
        return despesaRepository.findAll();
    }
    
    public void save(Despesa despesa) {
    	despesaRepository.save(despesa);
    }
    
    public void delete(Long despesaId) {
    	despesaRepository.delete(despesaId);
    }
}

