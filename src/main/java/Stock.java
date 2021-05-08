import java.util.ArrayList;

public class Stock implements IIngredient {
    final static private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient()
    {
        System.out.println("Welke ingerdiënt wilt u toevoegen aan uw voorraad?");
        System.out.println("Typ stop om af te breken.");
//        while(true)
//        {
//            String newIngredient = Checker.checkInputString();
//            if(newIngredient.equals("stop"))
//            {
//                break;
//            }else {
//                for(Ingredient ingredient : ingredients)
//                {
//                    if (ingredient.getName().equals(newIngredient))
//                    {
//                        System.out.print("U heeft dit al op voorraad, voer opnieuw in");
//                    }
//                }
//                ingredients.add(new Ingredient(newIngredient));
//            }
//        }
    }

    public void showIngredient()
    {
        if(ingredients.isEmpty())
        {
            System.out.println("Uw voorraad is leeg, voeg eerst producten bij");
            this.addIngredient();
        }else {
            System.out.println("U heeft de volgende ingrediënten al op voorraad:");
            for(Ingredient ingredient : ingredients)
            {
                System.out.println(ingredient.getName());
            }
        }
    }
}
