public class Gerecht {

    private Boolean alcoholToegestaan;
    private Boolean gratisToetje;
    private double prijs = 0;

    public double berekenPrijs(int leeftijd, Boolean vasteKlanten, int groep, Boolean alcohol18Plus){
        alcoholToegestaan = alcohol18Plus;
        gratisToetje = vasteKlanten;
        int totaleGroep = groep;

        if(leeftijd >= 4 && leeftijd <= 18) {
            totaleGroep -= 1;
            prijs = 20 * 0.80;
        }

        if(groep >= 5 ) {
            totaleGroep -= 1;
        }

        prijs = prijs + (totaleGroep * 20);
        return prijs;
    }
}
