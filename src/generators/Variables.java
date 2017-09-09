/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generators;

/**
 *
 * @author pinedo
 */
public class Variables {

    public double seeder, output, x4;
    public int x1, x2, x3;

    public Variables(double seeder, double output) {
        this.seeder = seeder;
        this.output = output;
    }

    public Variables(int x1, int x2, int x3, int x4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public double getSeeder() {
        return seeder;
    }

    public void setSeeder(double seeder) {
        this.seeder = seeder;
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

}
