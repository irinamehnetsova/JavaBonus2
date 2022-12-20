public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    int balance = 500; //сумма на счёте//
    int addBalance = 1100; //сумма пополнения//
    int bonus = 1; //количество бонусов//
    int addBonus;
    if (addBalance >= 1000)

    {


        addBonus = addBalance / 100 * bonus;

    } else

    {
        addBonus = 0;
        System.out.println("Баланс:" + (balance + addBalance + addBonus));
    }


}
