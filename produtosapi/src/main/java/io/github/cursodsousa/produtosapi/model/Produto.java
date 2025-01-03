package io.github.cursodsousa.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// POJO -> Plain Old Java Object
@Entity
@Table(name = "produto")
public class Produto {

        @Id
    @Column(name="id")
    private String id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "descricao")
    private String descricao;
    
    
    @Column(name = "preco")
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("id=").append(id);
        sb.append(", nome=").append(nome);
        sb.append(", descricao=").append(descricao);
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }

}
