/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timsolnvnn;

import java.util.Scanner;

/**
 *
 * @author Silk
 */
public class TimSoLNNN {
    public static void main(String[] args) {
        float a, b, c, max;
        Scanner n = new Scanner (System.in);
        a = n.nextFloat();
        b = n.nextFloat();
        c = n.nextFloat();
        max = a;
            if(max < b)
                max = b;
            if (max < c)
                max = c;
        System.out.println("So lon nhat = " +max);
    }
}
