//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account = 100; // Сумма на счету до пополнения
        int amount = 2000; // Сумма пополнения
        int bonus; // Бонусы начисляемые после пополнения
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = account + amount + bonus;
        System.out.println("Итоговый счет: " + totalAmount + " Количесво начисленых бонусов: "+ bonus);


    }
}
