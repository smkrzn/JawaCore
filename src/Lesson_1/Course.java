package Lesson_1;

public class Course {

    public static void check(){
        Obstacle obstacle = new Obstacle();
        Result men = new Result();
        double[] result = men.result();
        double[] standart = obstacle.standart();
        String[] obstacls = obstacle.getObstacls();
        for( int i = 0; i < 4 ; i++){
            String a = new String();
            System.out.print(obstacls[i]);
            if ((result[i] >= standart[i] && i > 1) || ((result[i] <= standart[i] && i < 2))){
                a = "пройдено";
            } else {
                a = "не пройдено";
            }
            System.out.println(result[i] + "/" + standart[i] + "  " + a);
        }
    }

    public static void results(){
        System.out.println("Результаты:");
        Team team = new Team();
        String[] names = team.getTeam();
        for (int i = 0; i < 4 ; i++){
            System.out.println(names[i]);
            check();
        }
    }
}
