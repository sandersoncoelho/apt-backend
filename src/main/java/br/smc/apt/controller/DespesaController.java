package br.smc.apt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.smc.apt.domain.Despesa;
import br.smc.apt.service.DespesaService;

@RestController
@RequestMapping("/despesa")
public class DespesaController {

	@Autowired
    DespesaService despesaService;
	
	@RequestMapping(method = RequestMethod.GET)
    public Iterable<Despesa> list() {
        return despesaService.list();
    }
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
    public void insert(@RequestBody Despesa despesa) {
        despesaService.save(despesa);
    }
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.OK)
    public void update(@RequestBody Despesa despesa) {
        despesaService.save(despesa);
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value="{despesaId}")
	@ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable("despesaId") Long despesaId) {
        despesaService.delete(despesaId);
    }
}