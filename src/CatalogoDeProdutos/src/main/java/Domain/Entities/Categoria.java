package Domain.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;

public class Categoria {
    private Integer id;

    private String nome;

    private String descricao;

    private Timestamp dataDeCriacao;

    public Categoria(){}

    public Categoria(String nome, String descricao,Timestamp dataDeCriacao){
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeCriacao = dataDeCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public Timestamp getDataDeCriacao() {
        return dataDeCriacao;
    }


}
