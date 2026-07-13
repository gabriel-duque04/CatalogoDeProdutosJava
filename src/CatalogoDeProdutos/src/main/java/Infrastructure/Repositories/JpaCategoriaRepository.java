package Infrastructure.Repositories;

import Application.Ports.PortsRepositories.ICategoriaRepository;
import Application.Ports.PortsRepositories.JpaSpringCategoriaRepository;
import Domain.Entities.Categoria;
import Infrastructure.JpaEntities.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
@RequiredArgsConstructor
public class JpaCategoriaRepository implements JpaSpringCategoriaRepository {

    private final JpaSpringCategoriaRepository repository;

}
