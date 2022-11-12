public class Main {
    public static void main(String[] args) {

        byte num0 = 67;
        System.out.println("Значение переменной num0 с типом byte равно " + num0);
        short num1 = -159;
        System.out.println("Значение переменной num1 с типом short равно " + num1);
        int num2 = 27897;
        System.out.println("Значение переменной num2 с типом int равно " + num2);
        long num3 = 987678965549L;
        System.out.println("Значение переменной num3 с типом long равно " + num3);
        float num4 = 27.12f;
        System.out.println("Значение переменной num4 с типом float равно " + num4);
        double num5 = 2.786;
        System.out.println("Значение переменной num5 с типом long равно " + num5);
        boolean lies = false;
        System.out.println("Значение переменной lies  с типом boolean равно " + lies);


        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paperPages =480;
        System.out.println("На каждого ученика рассчитано " + paperPages / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna) + " листов бумаги");


        byte bottels2Min = 16;
        System.out.println("За 20 минут машина произвела бутылок " + bottels2Min / 2 * 20 + " штук");
        System.out.println("За сутки машина произвела бутылок " + bottels2Min / 2 * 60 *24 + " штук");
        System.out.println("За трое суток машина произвела бутылок " + bottels2Min / 2 * 60 * 24 * 3 + " штук");
        System.out.println("За месяц машина произвела бутылок " + bottels2Min / 2 * 60 * 24 * 30 + " штук");


        byte paintCans = 120;
        System.out.println("В школе где " + paintCans / (2 + 4) + " классов, нужно " + paintCans / (2 + 4) * 2 + " банок белой краски  и " + paintCans / (2 + 4) * 4 + " коричневой краски");


        short bananas = 80 * 5;
        short milk = 105 * 2;
        short iceCreamSundae = 100 * 2;
        short rawEggs = 70 * 4;
        System.out.println(bananas + iceCreamSundae + rawEggs + " gramms");
        System.out.println((bananas + iceCreamSundae + rawEggs) / 1000f + " kg");


        int desieredResult = 7 * 1000;
        int perDay250 = desieredResult / 250;
        int perDay500 = desieredResult / 500;
        System.out.println(perDay250);
        System.out.println(perDay500);
        System.out.println((perDay250 + perDay500) / 2);


        int mashaMonthlySalary = 67760;
        int deniseMonthlySalary = 83690;
        int kristinaMonthlySalary = 76230;

        int newMashaMonthlySalary = mashaMonthlySalary / 10 + mashaMonthlySalary;
        int newDeniseMonthlySalary = deniseMonthlySalary / 10 + deniseMonthlySalary;
        int newKristinaMonthlySalary = kristinaMonthlySalary / 10 + kristinaMonthlySalary;

        int mashaYearlySalary = mashaMonthlySalary * 12;
        int denisYearSalary = deniseMonthlySalary * 12;
        int kristinaYearSalary =  kristinaMonthlySalary * 12;

        int newMashaYearlySalary = newMashaMonthlySalary * 12;
        int newDenisYarlySalary = newDeniseMonthlySalary * 12;
        int newKristinaYearlySalary = newKristinaMonthlySalary *12;

        System.out.println("Маша теперь получает " + newMashaMonthlySalary + " Рублей. Годовой доход вырос на " + newMashaYearlySalary % mashaYearlySalary + " рублей");
        System.out.println("Денис теперь получает " + newDeniseMonthlySalary + " Рублей. Годовой доход вырос на " + newDenisYarlySalary % denisYearSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaMonthlySalary + " Рублей. Годовой доход вырос на " + newKristinaYearlySalary % kristinaYearSalary + " рублей");


    }
}