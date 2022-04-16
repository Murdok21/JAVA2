public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int result = service.calculate(20);
        System.out.println("Бонусные мили " + result);

    }
}
