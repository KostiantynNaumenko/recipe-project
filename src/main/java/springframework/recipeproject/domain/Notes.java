package springframework.recipeproject.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Notes {

    @Id
    private Long id;

    private Recipe recipe;

    @Lob
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
