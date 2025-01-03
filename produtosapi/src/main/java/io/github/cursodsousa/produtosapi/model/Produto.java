package io.github.cursodsousa.produtosapi.model;


// POJO -> Plain Old Java Object
public class Produto {

    private String id;
    private String nome;
    private String descricao;
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
