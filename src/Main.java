//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 2000;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int x = account + amount + bonus;
        System.out.println("Итоговый счет: " + x + " Количесво начисленых бонусов: "+ bonus);


    }
}
