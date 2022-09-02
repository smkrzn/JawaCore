package Lesson_1;

public class Team {

    private String nameTeam = new String("'Чемпионы'");
    private double [][] allResults = new double[4][4];
    private String[] team = new String[] {"Ваня", "Леша", "Вася", "Петя"};

    public void team(){
        System.out.println("Состав команды " + nameTeam);
        for (int i = 0; i < 4; i++){
            System.out.print(team[i] + "  ");;
        }
        System.out.println();
    }

    public String[] getTeam() {
        return team;
    }
}
