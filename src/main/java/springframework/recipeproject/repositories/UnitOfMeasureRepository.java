package springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeproject.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    public Optional<UnitOfMeasure> findByDescription(String uom);
}
