package br.smc.apt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.smc.apt.domain.Produto;
import br.smc.apt.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
    ProdutoService produtoService;
	
	@RequestMapping(method = RequestMethod.GET)
    public Iterable<Produto> list() {
        return produtoService.list();
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public Produto insert(@RequestBody Produto produto) {
        return produtoService.persist(produto);
    }
	
	
	@RequestMapping(method = RequestMethod.PUT)
    public Produto update(@RequestBody Produto produto) {
        return produtoService.persist(produto);
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value="{produtoId}")
	@ResponseStatus(value = HttpStatus.OK)
    public void delete(@PathVariable("produtoId") Long produtoId) {
        produtoService.delete(produtoId);
    }
}