package com.company;

public class Vector3d extends AbstractVector {
    public double a,b,c;
    public Vector3d (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void get_sum(AbstractVector abstractVector) {
    }
    @Override
    public void get_diff(AbstractVector abstractVector) {
    }
    @Override
    public void get_mult(AbstractVector abstractVector) {
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public void get_sum3D(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double sum_a = a+vector3d_2.a;
        double sum_b = b+vector3d_2.b;
        double sum_c = c+vector3d_2.c;
        System.out.println("The sum of two 3d vectors is " + sum_a + " ; " + sum_b + " ; " + sum_c);
    }
    @Override
    public void get_diff3D(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double diff_a = a-vector3d_2.a;
        double diff_b = b-vector3d_2.b;
        double diff_c = c-vector3d_2.c;
        System.out.println("The difference of two 3d vectors = " + diff_a + " ; " + diff_b + " ; " + diff_c);
    }

    @Override
    public void get_vector_mult3D(AbstractVector abstractVector) {
        Vector3d vector3d_2 = (Vector3d)abstractVector;
        double mult1 = b*vector3d_2.c-c*vector3d_2.b;
        double mult2 = a*vector3d_2.c-c*vector3d_2.a;
        double mult3 = a*vector3d_2.b-b*vector3d_2.a;
        System.out.println("The multiplication of two 3d vectors = "+ mult1 + " ; " +- mult2 + " ; " + mult3);
    }
    /*scalar vector multiplication formula:  (aybz - azby) -  (axbz - azbx) +  (axby - aybx)*/
}


