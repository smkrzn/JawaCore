package Lesson_1;

public class Obstacle {
    final double run100 = 12.5;
    final double run400 = 65.5;
    final double jumpUp = 1.85;
    final double jumpLong = 4.50;



    private String[] obstacls = new String[] {"Бег на 100 метров  ", "Бег на 400 метров  ",
            "Прыжки в высоту  ", "Прыжки в длинну  "};

    public double[] standart() {
        double[] standart = new double[] {run100, run400, jumpUp, jumpLong};
        return standart;
    }

    public double getRun100() {
        return run100;
    }

    public double getRun400() {
        return run400;
    }

    public double getJumpUp() {
        return jumpUp;
    }

    public double getJumpLong() {
        return jumpLong;
    }

    public String[] getObstacls() {
        return obstacls;
    }
}
