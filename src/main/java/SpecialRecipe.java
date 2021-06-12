import java.util.ArrayList;

public class SpecialRecipe extends Recipe {
    private String specialIngredient;
    final private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public SpecialRecipe(String name) {
        super(name);
    }

    @Override
    public void showIngredient() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName());
        }
        System.out.println("Speciale ingredient is:");
        System.out.println(this.showSpecialIngredient());
    }

    @Override
    public String showSpecialIngredient() {
        return this.specialIngredient;
    }

    @Override
    public void addIngredient() {
        System.out.println("Welke ingerdiënt wilt u toevoegen aan uw recept?");
        System.out.println("Typ stop om af te breken en om een speciale ingrediënt toe te voegen.");
        while(true) {
            String newIngredient = Checker.checkInputString();
            if (newIngredient.equals("stop")) {
                System.out.println("Wat is het speciale ingrediënt");
                this.specialIngredient =  Checker.checkInputString();
                break;
            }else {
                ingredients.add(new Ingredient(newIngredient));
            }
        }
    }
}
