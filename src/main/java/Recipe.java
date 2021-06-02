import java.util.ArrayList;

public class Recipe {
    final private String name;
    final private ArrayList<Ingredient> ingredients = new ArrayList<>();



    public Recipe(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void addIngredient()
    {
        System.out.println("Welke ingerdiënt wilt u toevoegen aan uw recept?");
        System.out.println("Typ stop om af te breken.");
        while(true) {
            String newIngredient = Checker.checkInputString();
            if (newIngredient.equals("stop")) {
                break;
            }else {
                for (Ingredient ingredient : ingredients) {
                    if (ingredient.getName().equals(newIngredient)) {
                        System.out.print(newIngredient + "is al aanwezig in deze recept ");
                    }
                }
                ingredients.add(new Ingredient(newIngredient));
            }
        }
    }

    public void showIngredient()
    {
        System.out.println("De volgende ingrediënten behoren tot deze recept " + this.getName());
        for(Ingredient ingredient : ingredients)
        {
            System.out.println(ingredient.getName());
        }
    }

    public boolean addIngrediënt(ArrayList<String> nieuwIngredienten)
    {
        if(nieuwIngredienten.size() >= 4 && nieuwIngredienten.size() <= 15)
        {
            for(String ingredient : nieuwIngredienten)
            {
                ingredients.add(new Ingredient(ingredient));
            }
            return true;
        }
        return false;
    }
}