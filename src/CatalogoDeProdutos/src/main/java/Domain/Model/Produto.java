package Domain.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Produto")
public class Produto {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Descricao")
    private String descricao;

    @Column(name = "Preco")
    private double preco;

    @Column(name = "CategoriaId")
    private Integer categoriaId;

    @Column(name = "Ativo")
    private boolean ativo;

    @Column(name = "DataDeCriacao")
    private Timestamp dataDeCriacao;
}
