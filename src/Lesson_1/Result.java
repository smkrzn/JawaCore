package Lesson_1;

import java.util.Random;

public class Result {


    private double RUN100METERS;
    private double RUN400METERS;
    private double JUMP_UP;
    private double JUMP_LONG;


    private double run100(){
        return RUN100METERS = (((Math.random() * 26) + 115) / 10);
    }

    private double run400(){
        return RUN400METERS = (((Math.random() * 200) + 555) / 10);
    }

    public double jumpUp(){
        return JUMP_UP = (((Math.random() * 40) + 165) / 100);
    }

    public double jumpLong(){
        return JUMP_LONG = (((Math.random() * 20) + 35) / 10);
    }

    public double[] result(){
        double result[] = new double[4];
        result[0] = (Math.rint(run100() * 10))/10;
        result[1] = (Math.rint(run400() * 10))/10;
        result[2] = (Math.rint(jumpUp() * 100))/100;
        result[3] = (Math.rint(jumpLong() * 100))/100;
        return result;
    }
}
