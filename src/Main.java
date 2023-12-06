public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int arcticBears;
        arcticBears = 35200;
        System.out.println("Значение переменной arcticBears с типом int равно " + arcticBears);
        byte blackBook = 57;
        System.out.println("Значение переменной blackBook с типом byte равно " + blackBook);
        short cleanWindows = 30767;
        System.out.println("Значение переменной cleanWindows с типом short равно " + cleanWindows);
        long darkBricks = 30564000000L;
        System.out.println("Значение переменной darkBricks с типом long равно " + darkBricks);
        float energyInStock = 600500.4382f;
        System.out.println("Значение переменной energyInStock с типом float равно " + energyInStock);
        double freeMemory = 588402.9875731495;
        System.out.println("Значение переменной freeMemory с типом double равно " + freeMemory);

        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println("Значение переменной a с типом float равно " + a);
        long b = 987678965549L;
        System.out.println("Значение переменной b с типом long равно " + b);
        double c = 2.786;
        System.out.println("Значение переменной c с типом double равно " + c);
        short d = 569;
        System.out.println("Значение переменной d с типом short равно " + d);
        int e = -159;
        System.out.println("Значение переменной e с типом int равно " + e);
        short f = 27897;
        System.out.println("Значение переменной f с типом short равно " + f);
        byte g = 67;
        System.out.println("Значение переменной g с типом byte равно " + g);

        System.out.println("Задача 3");
        byte studentsOfLyudmilaP = 23;
        byte studentsOfAnnaS = 27;
        byte studentsOfEkaterinaA = 30;
        short totalPaperPurchased = 480;
        int totalStudents = studentsOfLyudmilaP + studentsOfAnnaS + studentsOfEkaterinaA;
        int amountOfPaperPerStudent = totalPaperPurchased / totalStudents;
        System.out.println("На каждого ученика рассчитано " + amountOfPaperPerStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte standardTimeInMinutes = 2;
        byte bottlesProducedWithStandTime = 16;
        byte minPerHour = 60;
        byte hoursInADay = 24;
        byte daysInAMonth = 30;
        byte reportingTime01InMinutes = 20;
        int bottlesProducedRepTime01 = reportingTime01InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime;
        System.out.println("За 20 мин машина произвела " + bottlesProducedRepTime01 + " штук бутылок");
        byte reportingTime02InHours = 1;
        int reportingTime02InMinutes = reportingTime02InHours * minPerHour;
        int bottlesProducedRepTime02 = reportingTime02InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime;
        System.out.println("За сутки машина произвела " + bottlesProducedRepTime02 + " штук бутылок");
        byte reportingTime03InDays = 3;
        int reportingTime03InMinutes = reportingTime03InDays * hoursInADay * minPerHour;
        int bottlesProducedRepTime03 = reportingTime03InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime;
        System.out.println("За 3 дня машина произвела " + bottlesProducedRepTime03 + " штук бутылок");
        byte reportingTime04InMonths = 1;
        int reportingTime04InMinutes = reportingTime04InMonths * daysInAMonth * hoursInADay * minPerHour;
        int bottlesProducedRepTime04 = reportingTime04InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime;
        System.out.println("За месяц машина произвела " + bottlesProducedRepTime04 + " штук бутылок");







    }
}