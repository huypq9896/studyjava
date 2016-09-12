
package tongdayso;

import java.util.Scanner;

public class Tongdayso{
    public static void main(String[] args) {
        int i, n;
        float E=1;
        Scanner h= new Scanner (System.in);
        n= h.nextInt();
        System.out.println(" Nhap n: " +n);
        for(i=1; i<=n; i++){
            E= E + (float)1/i;
        }
        System.out.println(" Tong E la: " +E);
    }
}
