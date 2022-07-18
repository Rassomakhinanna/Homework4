public class Main {
    public static void main(String[] args) {

        // Задание 1
        int clientOS = 0;
        if ( clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ( clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2014;
        if ( clientDeviceYear < 2015 && clientOS == 0 ){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if ( clientDeviceYear < 2015 && clientOS == 1 ){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите приложение по ссылке");
        }

        // Задание 3
        int year = 2024;
        if ((year % 4 == 0) && (year % 100 !=0) || year % 400 == 0) {
            System.out.println(year + " - это високосный год");
        } else {
            System.out.println( year + " - это не високосный год");
        }

        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <=20) {
            System.out.println("Потребуется 1 день");
        }
        if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется 2 дня");
        }
        if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер введен неверно");
        }
    }
}