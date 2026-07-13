package Infrastructure.Repositories.JpaEntities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Categoria")
public class JpaCategoria {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Descricao")
    private String descricao;

    @Column(name  = "DataDeCriacao")
    private Timestamp dataDeCriacao;
}
