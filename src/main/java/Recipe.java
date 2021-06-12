public abstract class Recipe {
    final private String name;

    public Recipe(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract void showIngredient();
    public abstract String showSpecialIngredient();

    public abstract void addIngredient();

    public void preparationMethod()
    {
        System.out.println("De volgende ingrediënten behoren tot deze recept " + this.getName());
        this.showIngredient();
        this.showSpecialIngredient();
    }
}