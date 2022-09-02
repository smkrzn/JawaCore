package Lesson_1;



public class Main {

    public static void main(String[] args) {
        Team team = new Team();
        team.team();
        results();
    }

    public static void results(){
        System.out.println("Результаты:");
        Team team = new Team();
        Course course = new Course();
        String[] names = team.getTeam();
        for (int i = 0; i < 4 ; i++){
            System.out.println(names[i]);
            course.check();
        }
    }
}
