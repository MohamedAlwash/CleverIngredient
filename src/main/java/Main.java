class Main {
    public static void main(String[] arg){
        DataHandler.getInstance().addPerson("mo", "alwash");

        Menu menu = new Menu();
        menu.menuList();
    }

    public static void testMethod(String tekst)
    {
        System.out.println(tekst);
    }
}
