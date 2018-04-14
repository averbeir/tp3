/**
 * Created by averbeir on 14/04/18.
 */
public class tp3 {

    public static void main(String[] args){
        System.out.println(pgcd(4997,1));

        int[] tab = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(maxTab(tab));

        System.out.println(sum(tab));

        System.out.println(isEven(-5));
    }

    private static int pgcd(int d,int n){
        if(d < 0 || n < 0){
            throw new IllegalArgumentException();
        }
        int r=0;
        while(n!=0)
        {
            r=d%n;
            d=n;
            n=r;
        }
        return d;
    }

    private static int maxTab(int[] tab){
        if(tab == null){
            throw new IllegalArgumentException();
        }
        int max = tab[0];
        for(int i=1;tab.length>i;i++){
            if(tab[i] > max ){
                max = tab[i];
            }
        }
        return max;
    }

    private static int sum(int[] tab){
        if(tab == null){
            throw new IllegalArgumentException();
        }
        int sum = tab[0];
        for (int i = 1;i<tab.length;i++){
            sum += tab[i];
        }
        return sum;
    }

    private static boolean isEven(int p){
        return p%2 == 0;
    }

    private static boolean isPrime(int p){
        return true;
    }
}
