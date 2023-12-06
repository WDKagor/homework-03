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

        System.out.println("   ");
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

        System.out.println("   ");
        System.out.println("Задача 3");
        byte studentsOfLyudmilaP = 23;
        byte studentsOfAnnaS = 27;
        byte studentsOfEkaterinaA = 30;
        short totalPaperPurchased = 480;
        byte totalStudents = (byte) (studentsOfLyudmilaP + studentsOfAnnaS + studentsOfEkaterinaA);
        byte amountOfPaperPerStudent = (byte) (totalPaperPurchased / totalStudents);
        System.out.println("На каждого ученика рассчитано " + amountOfPaperPerStudent + " листов бумаги");

        System.out.println("   ");
        System.out.println("Задача 4");
        byte standardTimeInMinutes = 2;
        byte bottlesProducedWithStandTime = 16;
        byte minPerHour = 60;
        byte hoursInADay = 24;
        byte daysInAMonth = 30;
        byte reportingTime01InMinutes = 20;
        short bottlesProducedRepTime01 = (short) (reportingTime01InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime);
        System.out.println("За 20 мин машина произвела " + bottlesProducedRepTime01 + " штук бутылок");
        byte reportingTime02InHours = 1;
        byte reportingTime02InMinutes = (byte) (reportingTime02InHours * minPerHour);
        short bottlesProducedRepTime02 = (short) (reportingTime02InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime);
        System.out.println("За сутки машина произвела " + bottlesProducedRepTime02 + " штук бутылок");
        byte reportingTime03InDays = 3;
        short reportingTime03InMinutes = (short) (reportingTime03InDays * hoursInADay * minPerHour);
        int bottlesProducedRepTime03 = reportingTime03InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime;
        System.out.println("За 3 дня машина произвела " + bottlesProducedRepTime03 + " штук бутылок");
        byte reportingTime04InMonths = 1;
        int reportingTime04InMinutes = reportingTime04InMonths * daysInAMonth * hoursInADay * minPerHour;
        int bottlesProducedRepTime04 = reportingTime04InMinutes / standardTimeInMinutes * bottlesProducedWithStandTime;
        System.out.println("За месяц машина произвела " + bottlesProducedRepTime04 + " штук бутылок");

        System.out.println("   ");
        System.out.println("Задача 5");
        byte cansOfWhitePaint = 2;
        byte cansOfBrounPaint = 4;
        byte totalCansOfPaintForRoom = (byte) (cansOfWhitePaint + cansOfBrounPaint);
        byte totalCansPurchased = 120;
        byte numberOfPaintedRooms = (byte) (totalCansPurchased / totalCansOfPaintForRoom);
        byte totalCansOfWhitePaint = (byte) (cansOfWhitePaint * numberOfPaintedRooms);
        byte totalCansOfBrounPaint = (byte) (cansOfBrounPaint * numberOfPaintedRooms);
        System.out.println("В школе, где " + numberOfPaintedRooms + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrounPaint + " банок коричневой краски");

        System.out.println("   ");
        System.out.println("Задача 6");
        byte numberOfBananas = 8;
        byte bananaWeightInGr = 80;
        short milkInMl = 200;
        byte weightOf100MlMilkInGr = 105;
        byte IceCreamInBriquettes = 2;
        byte briquetteWeightInGr = 100;
        byte numberOfEggs = 4;
        byte weightOfEggInGr = 70;
        short grPerKg = 1000;
        short totalWeightOfBananas = (short) (numberOfBananas * bananaWeightInGr);
        short totalWeightOfMilk = (short) (milkInMl / 100 * weightOf100MlMilkInGr);
        short totalWeightOfIceCream = (short) (IceCreamInBriquettes * briquetteWeightInGr);
        short totalWeightOfEggs = (short) (numberOfEggs * weightOfEggInGr);
        int totalBreakfastWeightInGr = totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream + totalWeightOfEggs;
        double totalBreakfastWeightInKg = (double) totalBreakfastWeightInGr / grPerKg;
        System.out.println("Вес завтрака спортсмена составил " + totalBreakfastWeightInGr + " граммов, или " + totalBreakfastWeightInKg + " килограммов");





    }
}