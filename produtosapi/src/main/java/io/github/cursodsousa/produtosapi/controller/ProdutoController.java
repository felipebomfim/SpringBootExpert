package io.github.cursodsousa.produtosapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.cursodsousa.produtosapi.model.Produto;
import io.github.cursodsousa.produtosapi.repository.ProdutoRepository;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar (@RequestBody Produto produto){
        System.out.println("Produto recebido: "+ produto);

        var id  = UUID.randomUUID().toString();
        produto.setId(id);
        
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable String id){
        return produtoRepository.findById(id).orElse(null);
    }

    @GetMapping()
    public List<Produto> obterTodosOsProdutos(){
        return produtoRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable("id") String id){
        produtoRepository.deleteById(id);
    }
}
