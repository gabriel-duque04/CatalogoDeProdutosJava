package Application.Ports.PortsRepositories;

import Domain.Entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import Infrastructure.Repositories.JpaEntities.JpaCategoria;
public interface ICategoriaRepository extends JpaRepository {

    public Optional<JpaCategoria> getCategoriaById(Integer id);

    public Optional<Iterable<JpaCategoria>> getCategoriasPaginado(int tamanhoPag, int pagina);

    public Optional<JpaCategoria> updateCategoriaById(Integer id, Categoria categoriaAtualizada);

    public Optional<Boolean> deleteCategoriaById(Integer id);

    public Optional<JpaCategoria> createCategoria(Categoria categoriaNova);
}
