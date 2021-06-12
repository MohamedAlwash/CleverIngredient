public class Menu {
    private int choice;

    private void runMenuList()
    {
        while(true)
        {
            switch(this.choice)
            {

                case 1:// Persoon toevoegen
                    System.out.println("Wat is uw voornaam");
                    String firstName = Checker.checkInputString();
                    System.out.println("Wat is uw achternaam");
                    String lastName = Checker.checkInputString();
                    DataHandler.getInstance().addPerson(firstName, lastName);
                    break;
                case 2:// Lijst van personen laten zien
                    DataHandler.getInstance().showPersons();

                    break;
                case 3:// Voorraad toevoegen aan een persoon
                    if(DataHandler.getInstance().showPersons())
                    {
                        DataHandler.getInstance().addIngredientToPerson(Checker.checkInputInt());
                    }

                    break;
                case 4:// Voorraad bekijken van een persoon
                    if(DataHandler.getInstance().showRecipes())
                    {
                        DataHandler.getInstance().showIngredientFromPerson(Checker.checkInputInt());
                    }
                    break;
                case 5:// Recepten toevoegen
                    System.out.println("Wilt u een italiaans recept of een speciaal recept toevoegen");
                    String receipe = Checker.checkInputString();
                    System.out.println("Wat is de naam van de recept die u wilt toevoegen?");
                    DataHandler.getInstance().addRecipe(Checker.checkInputString(), receipe);
                    break;
                case 6:// Recepten bekijken
                    if(DataHandler.getInstance().showRecipes())
                    {
                        DataHandler.getInstance().showIngredientFromRecipe(Checker.checkInputInt());
                    }


                    break;

//                case 5:// Overzicht van gerechten op basis van beschikbaar voorraad
//
//                    break;

                case 0: //Verlaat de applicatie
                    System.exit(0);
            }
            System.out.println("Typ maar 1 om terug te gaan naar menu");
            if(Checker.checkInputInt()== 1) {this.menuList();}
        }
    }

    public void menuList()
    {
        System.out.println("1) Persoon toevoegen");
        System.out.println("2) Lijst van personen laten zien");
        System.out.println("3) Voorraad toevoegen aan persoon");
        System.out.println("4) Voorraad bekijken van een persoon");
        System.out.println("5) Recepten toevoegen");
        System.out.println("6) Recepten bekijken");
//        System.out.println("5) Overzicht van gerechten op basis van beschikbaar voorraad");
        System.out.println("0) Verlaat de applicatie");

        System.out.println("Kies maar een nummer");
        this.choice = Checker.checkInputInt();
        this.runMenuList();

    }
}

