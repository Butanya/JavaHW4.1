public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        int actual = service.calculate(1000_60, true);
        int expected = 30;

        System.out.println("OP: " + expected + " ФР: " + actual);


    }
}
