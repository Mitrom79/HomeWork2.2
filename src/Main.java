public class Main {
    public static void main(String[] args) {


        int myInt = 10;
        byte myBite = 5;
        short myShort = 20;
        long myLong = 100_000_000_00L;
        float myFloat = 1.5f;
        double myDouble = 2.5;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myBite);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);


        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = 159;
        short f = 27897;
        byte g = 67;


        int studentsOfClass1 = 23;
        int studentsOfClass2 = 27;
        int studentsOfClass3 = 30;
        int totalSheets = 480;
        int totalStudents = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;
        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги");


        int bottlesPerMinute = 8;
        int minutesInDay = 1440;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Dys = bottlesPerMinute * minutesIn3Days;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesIn3Dys + " штук бутылок");
        System.out.println("За 20 минут машина произвела " + bottlesInMonth + " штук бутылок");


        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе,где " + totalClasses + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски");


        int bananasCount = 5;
        int banasWeigtGramm = 80;
        int milkVolume = 200;
        double iceCreamWeightGramm = 2 * 100;
        int eggsCount = 4;
        int eggsWeightGramm = 70;

        int totalWeight = bananasCount * banasWeigtGramm + milkVolume * 105 / 100 + (int) iceCreamWeightGramm +
                eggsCount * eggsWeightGramm;
        double totalWeihgtInKg = totalWeight / 1000.0;
        System.out.printf(" Общий вес завтрака: %d грамм (%.2f кг)", totalWeight, totalWeihgtInKg);


        int weightLossGoalKg = 7;
        double dailyWeihgtLossLowKg = 0.25;
        double dailyWeightLossHighKg = 0.5;

        int daysLow = (int) Math.ceil(weightLossGoalKg / dailyWeihgtLossLowKg);
        int daysHigh = (int) Math.ceil(weightLossGoalKg / dailyWeightLossHighKg);
        int daysAverage = (daysLow + daysHigh) / 2;
        System.out.println("Для похудения на " + weightLossGoalKg + " кг при потере веса " + dailyWeihgtLossLowKg +
                " кг в день нужно " + daysLow + " дней");
        System.out.println("Для похудения на " + weightLossGoalKg + " кг при потере веса " + dailyWeightLossHighKg +
                " кг в день нужно " + daysHigh + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней для похудения на " + weightLossGoalKg + " кг");



        double increasedPercent = 1.1;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (int) (mashaSalary * increasedPercent);
        int denisNewSalary = (int) (denisSalary * increasedPercent);
        int kristinaNewSalary = (int) (kristinaSalary * increasedPercent);

        int mashaAnnuualIncomeBefore = mashaSalary * 12;
        int denisAnnuualIncomeBefore = denisSalary * 12;
        int kristinaAnnuualIncomeBefore = kristinaSalary * 12;

        int mashaAnnuualIncomeAfter = mashaNewSalary * 12;
        int denisAnnuualIncomeAfter = denisNewSalary * 12;
        int kristinaAnnuualIncomeAfter = kristinaNewSalary * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " +
                (mashaAnnuualIncomeAfter - mashaAnnuualIncomeBefore) + " рублей. ");

        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " +
                (denisAnnuualIncomeAfter - denisAnnuualIncomeBefore) + " рублей. ");

        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " +
                (kristinaAnnuualIncomeAfter - kristinaAnnuualIncomeBefore) + " рублей. ");



    }
}