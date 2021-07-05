package mainClass;

import java.util.Arrays;

public class ilham {

    public static void main(String[] args) {

        // x y - 2d array
        // 1 1      #A
        // 2 0.5    #B
        // 3 3      #C

        // carilah jarak terdekat - bandingkan
        // sqrt((x2 - x1)^2 + (y2 - y1)^2)
                                //A,B,C
        double[][] koordinat = { { 1, 1 }, { 2, 0.5 }, { 3, 3 } };          //2d array berisi koordinat

        double distanceAB = banding(koordinat[0], koordinat[1]);            //jarak dari tiap masing2 titik
        double distanceAC = banding(koordinat[0], koordinat[2]);
        double distanceBC = banding(koordinat[1], koordinat[2]);
        double[] distance = {distanceAB, distanceAC, distanceBC};           //masukkan data jarak kedalam array untuk dianalisis menggunakan method
        System.out.println(Arrays.toString(distance));

        double closestDistance = closest(distance);                         //pemanggilan method
        System.out.println("Jarak terdekat adalah = " +closestDistance);    //printout
    }

    public static double banding(double x1, double x2, double y1, double y2){
        double result;
        result = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return result;
    }

    public static double banding(double[] koor1, double[] koor2){
        double result;
        result = Math.sqrt(Math.pow((koor2[0] - koor1[0]),2) + Math.pow((koor2[1] - koor1[1]),2));
        return result;
    }

    public static double closest(double[] array){
        double closest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < closest)
                closest = array[i];
        }
        return closest;
    }
}
