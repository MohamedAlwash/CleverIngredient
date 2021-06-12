import javax.xml.crypto.Data;
import java.util.ArrayList;

public class DataHandler {
    final private static ArrayList<Person> persons = new ArrayList<>();
    final private static ArrayList<Recipe> recipes = new ArrayList<>();
    private static DataHandler dataHandler;

    private DataHandler(){}

    public static DataHandler getInstance() {
        if(dataHandler == null) {
            dataHandler = new DataHandler();
        }
        return dataHandler;
    }

    public void addPerson(String firstName, String lastName)
    {
        persons.add(new Person(firstName, lastName));
    }

    public static boolean showPersons()
    {
        int i = 1;
        if(persons.isEmpty())
        {
            System.out.println("U moet eerst personen toevoegen");

            return false;
        }else {
            System.out.println("Kies een index wie u bent");
            for(Person person : persons)
            {
                    System.out.println(i++ + ") " + person.getFirstName() + " " + person.getLastName());
            }
            return true;
        }
    }

    public void addIngredientToPerson(int choosePerson)
    {
        persons.get(choosePerson - 1).getHasStock().addIngredient();
    }

    public void showIngredientFromPerson(int choosePerson)
    {
        persons.get(choosePerson - 1).getHasStock().showIngredient();
    }


    public void addRecipe(String name, String whichRecipe)
    {
        if(whichRecipe.equals("italiaans")) {
            recipes.add(new ItalianRecipe(name));
            recipes.get(recipes. size()-1).addIngredient();
        }else {
            recipes.add(new SpecialRecipe(name));
            recipes.get(recipes.size()-1).addIngredient();
        }
    }

    public boolean showRecipes()
    {
        if(recipes.isEmpty())
        {
            System.out.println("Er zijn geen recepten, voeg eerst recept toe.");
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

    public void showIngredientFromRecipe(int chooseRecipe)
    {
        recipes.get(chooseRecipe - 1).preparationMethod();
    }
}
