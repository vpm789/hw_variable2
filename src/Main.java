public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача №1");
        byte a = 1;
        short b = 12;
        int c = 123;
        long d = 1234;
        float e = 1.9F;
        double f = 12.56;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2() {
        System.out.println("Задача №2");
        float a = 27.12f;
        long b= 987678965549L;
        short c = 2786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }
    public static void task3() {
        System.out.println("Задача №3");
        byte stLP = 23;
        byte stAS = 27;
        byte stEA = 30;
        short totalSheet = 480;
        int stSheet = totalSheet/(stLP+stAS+stEA); //почему-то не получилось использовать тип short
        System.out.println("На каждого ученика рассчитано "+stSheet+" листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача №4");
        byte perfMachine2min = 16;
        int perfMachine20min = perfMachine2min * 10;
        int perfMachine1day = perfMachine2min * 30 * 24;
        int perfMachine3day = perfMachine2min * 30 * 24 * 3;
        int perfMachine1month = perfMachine2min * 30 * 24 * 30;
        System.out.println("За 20 минут машина произвела "+perfMachine20min+" штук бутылок");
        System.out.println("За 1 сутку машина произвела "+perfMachine1day+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+perfMachine3day+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+perfMachine1month+" штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача №5");
        byte totalPaint = 120;
        byte whitePaint1Room = 2;
        byte brownPaint1Room = 4;
        int amountRoom = totalPaint/(whitePaint1Room+brownPaint1Room);
        int totalWhitePaint = totalPaint*2/(whitePaint1Room+brownPaint1Room);
        int totalBrownPaint = totalPaint*4/(whitePaint1Room+brownPaint1Room);
        System.out.println("В школе, где "+amountRoom+" классов, нужно "+totalWhitePaint+" банок белой краски и "+totalBrownPaint+" банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача №6");
        short bananasWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceCreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        System.out.println("Вес спортзавтрака - "+(bananasWeight+milkWeight+iceCreamWeight+eggWeight)+" гр. или - "+(bananasWeight+milkWeight+iceCreamWeight+eggWeight)/1000+" кг.");
    }
    public static void task7() {
        System.out.println("Задача №7");
        byte lossWeight = 7;
        short loss1DayMin = 250;
        short loss1DayMax = 500;
        int amountDayMax = lossWeight*1000/loss1DayMin;
        int amountDayMin = lossWeight*1000/loss1DayMax;
        int amountDayAvr = lossWeight*1000*2/(loss1DayMax+loss1DayMin);
        System.out.println("Для похудения на "+lossWeight+" кг. требуется минимум "+amountDayMin+" дней, максимум "+amountDayMax+" дней, в среднем "+amountDayAvr+" дней.");
    }
    public static void task8() {
        System.out.println("Задача №8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = (int) (salaryMasha*1.1);
        int newSalaryDenis = (int) (salaryDenis*1.1);
        int newSalaryKristina = (int) (salaryKristina*1.1);
        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей. Годовой доход вырос на "+(newSalaryMasha-salaryMasha)*12+" рублей");
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей. Годовой доход вырос на "+(newSalaryDenis-salaryDenis)*12+" рублей");
        System.out.println("Кристина теперь получает "+newSalaryKristina+" рублей. Годовой доход вырос на "+(newSalaryKristina-salaryKristina)*12+" рублей");
    }

}