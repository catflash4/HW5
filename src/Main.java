public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        //Задача 2
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015) {
           switch (clientOS){
               case 0:
                   System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                   break;
               case 1:
                   System.out.println("Установите облегченную версию приложения для Android по ссылке");
                   break;
           }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        }
        //Задача 3
        int year = 2021;
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (year > 1584){
            if(leapYear){
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

        //Задача 4
        int deliveryDistance = 95;
        int daysForDelivery;
        if (deliveryDistance < 20){
            daysForDelivery = 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            daysForDelivery = 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            daysForDelivery = 3;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else {
            System.out.println("Доставки нет");
        }

        //Задача 5
        int monthNumber = 12;
        switch (monthNumber){
            case 12,1,2:
                System.out.println("Это сезон зимы");
                break;
            case 3,4,5:
                System.out.println("Это сезон весны");
                break;
            case 6,7,8:
                System.out.println("Это сезон лета");
                break;
            case 9,10,11:
                System.out.println("Это сезон осени");
                break;
            default:
                System.out.println("В году всего 12 месяцев");
        }
    }
}