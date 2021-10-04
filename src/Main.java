public class Main {
    public static void main(String[] args) {
        double currentAmount = - 20.28;
        double replenishmentAmount = 1080.59;

        int bonusAmount = 100;

        int bonus;
        if (replenishmentAmount>1000) {
            bonus = (int) replenishmentAmount / bonusAmount;
        } else {
            bonus = 0;
        }

        double finalAmount = currentAmount + replenishmentAmount + bonus;

        System.out.println("Конечная сумма на счете = " + finalAmount);
        System.out.println("в том числе количество бонусов = " + bonus);
    }
}
