public class Convert {
    public static void main( String[] args ) {
        int pennies = 164;
        final int PENNIES_PER_NICKLE=5;
        final int PENNIES_PER_DIME=10;
        final int PENNIES_PER_QUARTER=25;
        final int PENNIES_PER_LOONIE=100;

        //your code here - compute loonies, quarters, dimes, nickels and pennies
        int loonies = pennies / PENNIES_PER_LOONIE;
        pennies = pennies - PENNIES_PER_LOONIE * loonies;
        int quarters = pennies / PENNIES_PER_QUARTER;
        pennies = pennies - PENNIES_PER_QUARTER * quarters;
        int dimes = pennies / PENNIES_PER_DIME;
        pennies = pennies - PENNIES_PER_DIME * dimes;
        int nickels = pennies / PENNIES_PER_NICKLE;
        pennies = pennies - PENNIES_PER_NICKLE * nickels;
        


        System.out.println("loonies = " + loonies);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("pennies = " + pennies);
        
        int s = 5;
        System.out.println(s++ * s--); // 5 * 6 = 30;
        System.out.println(++s * --s); // 6 * 5 = 30;
        System.out.println(s-- * ++s); // 5 * 5 = 25;
        System.out.println("3"+"4"); // 34
        System.out.println(3+4); // 7
        System.out.println("3" + 4); // 34
    }
}