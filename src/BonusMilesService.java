public class BonusMilesService {
    public int calculate(int amount) {
        int ticketPrice = 1000;
        int bonusMiles = ticketPrice / amount;
        return bonusMiles;
    }

}
