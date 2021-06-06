public class Person {
    final private String firstName;
    final private String lastName;
    final private Stock hasStock;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hasStock = new Stock();
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public Stock getHasStock()
    {
        return this.hasStock;
    }
}
