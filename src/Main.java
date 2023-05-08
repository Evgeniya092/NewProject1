public class Main {
    public static void main(String[] args) {
        int price = 14580;
        int bonusMiles = 20;

        int miles = price / bonusMiles;
        System.out.println("Бонусных миль начислено:" + miles);
    }
}