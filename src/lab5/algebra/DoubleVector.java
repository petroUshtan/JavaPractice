package lab5.algebra;

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

    public static double mult(DoubleVector a, DoubleVector b) {
        return a.mult(b);
    }

}
