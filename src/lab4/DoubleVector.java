package lab4;

import java.util.Arrays;

/**
 * Created by Petro on 06.03.2017.
 */
public class DoubleVector {
    private double[] vector = null;

    public DoubleVector(double[] vector) {
        this.vector = vector;
    }

    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }

    public double[] sum(DoubleVector temp){
        double[] sumVect = new double [temp.vector.length];
        for(int i=0;i<this.vector.length;i++) {
            sumVect[i] = this.vector[i] + temp.vector[i];
        }
        return sumVect;
    }

    public static double[] sum (DoubleVector a, DoubleVector b){
        return a.sum(b);
    }

    public static double mult(DoubleVector a, DoubleVector b)
    {
        return a.mult(b);
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);
        System.out.println("v1 * v2 = " + v1.mult(v2));
        System.out.println("v1 * v2 = " + DoubleVector.mult(v1, v2));
        System.out.println("v1 * v3 = " + v1.mult(v3));
        System.out.print("sum of v1 and v3: ");
        for(double v : (v1.sum(v3)) ){
            System.out.print(v+" ");
        }

        System.out.print("\nSTATIC sum of v1 and v3: ");
        for(double v : (sum(v1,v3)) ){
            System.out.print(v+" ");
        }
    }
}
