import java.util.ArrayList;

public class DataHandler {
    final private static ArrayList<Person> persons = new ArrayList<>();
    final private static ArrayList<Recipe> recipes = new ArrayList<>();

    public static void addPerson(String firstName, String lastName)
    {
        persons.add(new Person(firstName, lastName));
    }

    public static boolean showPersons(boolean question)
    {
        int i = 1;
        if(persons.isEmpty())
        {
            System.out.println("U moet eerst personen toevoegen");

            return false;
        }else {
            if (question) {
                System.out.println("Kies een index wie u bent");
            }
            for(Person person : persons)
            {
                    System.out.println(i++ + ") " + person.getFirstName() + " " + person.getLastName());
            }
            return true;
        }
    }

    public static void addIngredientToPerson(int choosePerson)
    {
        persons.get(choosePerson - 1).getStock().addIngredient();
    }

    public static void showIngredientFromPerson(int choosePerson)
    {
        persons.get(choosePerson - 1).getStock().showIngredient();
    }

    public static void addRecipe(String name)
    {
        recipes.add(new Recipe(name));
        recipes.get(recipes.size()-1).addIngredient();
    }

    public static boolean showRecipes()
    {
        if(recipes.isEmpty())
        {
            System.out.println("Er zijn geen recepten, voeg eerst recepten toe.");
            return false;
        }else {
            System.out.println("Welke ingrediënten wilt u zien van de volgende recepten?");
            int i = 1;
            for(Recipe recipe : recipes)
            {
                System.out.println(i++ + ") " + recipe.getName());
            }
            return true;
        }
    }

    public static void showIngredientFromRecipe(int chooseRecipe)
    {
        recipes.get(chooseRecipe - 1).showIngredient();
    }
}
