public class Main {

    static int capital = 1500000;
    static int[] users = {6000, 1200, 25000, 38000, 143200, 72500, 6200, 82900, 26000, 299000};
    static int[][] usActions = {{100, -60, -200, 300, 80, -154, -56, 120, 90, -150},
                                {5,  10,  -25,  20,  10,  -5,   35,  60,  -90,  45},
                                {600, 200, -1000, 430, 150, 1500, -800, 1300, -500, 290},
                                {6000, 1200, -1500, 1430, 1500, 1200, -5000, 1300, -1500, 2090},
                                {14000, 4500,  -39000,  8000, 25000, 4500, -6200, 15000, -2400, -12000},
                                {6500, 1200, -1500, 1430, -1500, 1500, -5000, 1300, -1500, 1090},
                                {90, 60, -150, 200, -80, -175, 56, 120, -90, 600},
                                {6500, 1200, -1500, 1430, -1500, 1500, -500, 6300, -9500, 590},
                                {6000, 200, -100, 300, -500, 1200, -500, 300, -1500, 2090},
                                {30000, 4500,  -39000,  80000, 25000, 4500, 60000, 15000, -2400, -12000}};
    static int used = Sum.sum(users);
    static int free = capital-used;
    static int exRate = ((used * 100)/capital)*100;

    public static void main(String[] args) {
        System.out.println("Capital - " + capital);
        System.out.println("Used - " + used);
        System.out.println("Free - " + free);
        System.out.println("Курс - " + exRate);
        System.out.println();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                users[j] += usActions[j][i];
            }
            used = Sum.sum(users);
            free = capital-used;
            exRate = ((used * 100)/capital)*100;
            System.out.println("Capital - " + capital);
            System.out.println("Used - " + used);
            System.out.println("Free - " + free);
            System.out.println("Курс - " + exRate);
            for(int j = 0; j < 10; j++){
                System.out.print(" "+users[j]);
            }
            System.out.println();
        }

    }

}

