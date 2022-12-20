public class Main {
    public static void main(String[] args) {

        int balance = 100; //сумма на счёте//
        int addBalance = 1100; //сумма пополнения//
        int sum = (balance + addBalance); //итоговая сумма//

        System.out.println("Итоговая сумма:" + sum);
        int bonus = 1; //количество бонусов//
        int addBonus;
        if (sum >= 1000) {
            addBonus = (sum / 100 * bonus);
        } else {
            addBonus = 0;
            System.out.println("Баланс:" +(sum + addBonus));
        }


    }
}
