public class Main {
    public static void main(String[] args) {
        int initial = 100; // начальный счет
        int sum = 500; // сумма пополнения

        int bonus;
        if (sum > 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        int result = initial + sum + bonus;
        System.out.println(bonus);
        System.out.println(result);
    }
} //если сумма пополнения 5500,то сумма бонусов 55 и итоговая сумма на счету 5655
// если сумма пополнения 500, то  сумма бонусов 0 и итоговая сумма на счету 600