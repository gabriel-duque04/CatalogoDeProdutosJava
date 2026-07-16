package Domain.Repository;

import Domain.Model.Produto;

import java.util.Optional;

public interface ProdutoRepository {

    public Optional<Produto> getProdutoById(Integer id);

    public Optional<Iterable<Produto>> getProdutosByCategoriaId(Integer categoriaId);

    public Optional<Iterable<Produto>> getProdutosPaginados(int tamanhoPagina, int pagina);

    public Optional<Produto> updateProdutoById(Integer id, Produto produtoAtualizado);

    public Optional<Boolean> deleteProdutoById(Integer id);

    public Optional<Produto> createProduto(Produto produtoNovo);
}
