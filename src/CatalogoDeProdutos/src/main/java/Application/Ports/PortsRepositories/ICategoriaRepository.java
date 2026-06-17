package Application.Ports.PortsRepositories;

import Domain.Entities.Categoria;

import java.util.Optional;

public interface ICategoriaRepository {

    public Optional<Categoria> getCategoriaById(Integer id);

    public Optional<Iterable<Categoria>> getCategoriasPaginado(int tamanhoPag, int pagina);

    public Optional<Categoria> updateCategoriaById(Integer id, Categoria categoriaAtualizada);

    public Optional<Boolean> deleteCategoriaById(Integer id);

    public Optional<Categoria> createCategoria(Categoria categoriaNova);
}
