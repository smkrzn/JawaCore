package Lesson_7;


import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

    private final Controller controller = new Controller();

    public void runApplication() throws IOException {
        Scanner scanner = new Scanner(System.in);
        WeatherRequest weatherRequest = new WeatherRequest();
        while (true) {
            System.out.println("Введите широту (диапазон от -90 до + 90; С.Ш. '+', Ю.Ш. '-')");
            Float lat = null;
            try {
                lat = scanner.nextFloat();
            } catch (NumberFormatException e){
                e.printStackTrace();
            }
            checkLat(lat);

            System.out.println("Введите долготу (диапазон от -180 до + 180; В.Д. '+', З.Д. '-')");
            Float lon = null;
            try {
                lon = scanner.nextFloat();
            } catch (NumberFormatException e){
                e.printStackTrace();
            }
            checkLon(lon);
            setCoordinates(lat,lon);

            System.out.println("Введите ответ: 1 - Получить текущую погоду, " +
                    "2 - Получить погоду на следующие 5 дней, " +
                    "выход (exit) - завершить работу");
            String result = scanner.nextLine();

            checkIsExit(result);

            try {
                validateUserInput(result);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }

            try {
                notifyController(result);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void checkIsExit(String result) {
        if (result.toLowerCase().equals("выход") || result.toLowerCase().equals("exit")) {
            System.out.println("Завершаю работу");
            System.exit(0);
        }
    }

    private void setCoordinates(Float lat, Float lon) {
        WeatherRequest.getInstance().setCoordinates(lat, lon);
    }


    private void validateUserInput(String userInput) throws IOException {
        if (userInput == null || userInput.length() != 1) {
            throw new IOException("Incorrect user input: expected one digit as answer, but actually get " + userInput);
        }
        int answer = 0;
        try {
            answer = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IOException("Incorrect user input: character is not numeric!");
        }
    }

    private void notifyController(String input) throws IOException {
        controller.onUserInput(input);
    }

    private void checkLat (Float lat) throws IOException {
        if (lat <= 90 && lat >= -90){
        } else {
            throw new IOException("Incorrect user input: it was expected that the answer would be" +
                    " in the range from -90 to +90, but in fact it turns out " + lat);
        }
    }

    private void checkLon (Float lon) throws IOException {
        if (lon <= 180 && lon >= -180){
        } else {
            throw new IOException("Incorrect user input: it was expected that the answer would be" +
                    " in the range from -180 to +180, but in fact it turns out " + lon);
        }
    }


}
