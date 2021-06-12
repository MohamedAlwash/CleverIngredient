import java.util.ArrayList;

public class ItalianRecipe extends Recipe {
    final private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public ItalianRecipe(String name) {
        super(name);
    }

    @Override
    public void showIngredient() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName());
        }
    }

    @Override
    public String showSpecialIngredient() {
        return "";
    }

    @Override
    public void addIngredient() {
        System.out.println("Welke ingerdiënt wilt u toevoegen aan uw recept?");
        System.out.println("Typ stop om af te breken.");
        while(true) {
            String newIngredient = Checker.checkInputString();
            if (newIngredient.equals("stop")) {
                break;
            }else {
                ingredients.add(new Ingredient(newIngredient));
            }
        }
    }
}