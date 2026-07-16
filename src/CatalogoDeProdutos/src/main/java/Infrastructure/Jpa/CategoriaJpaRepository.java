package Infrastructure.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import Infrastructure.Entity.*;

import java.util.UUID;

public interface CategoriaJpaRepository extends JpaRepository<JpaCategoria, UUID> {

}
