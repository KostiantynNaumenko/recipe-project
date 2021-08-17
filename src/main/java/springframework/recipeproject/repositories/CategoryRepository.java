package springframework.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    public Optional<Category> findByDescription(String description);

}
