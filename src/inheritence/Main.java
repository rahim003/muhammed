package inheritence;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Erlan", "Janysh", "Kutman", "Kanykei", "Aigerim", "Eliza", "Lira eje", "Meerim eje", "Erbol", "Osmon", "Adil", "Davlat baike", "Abdyrazak",
                "Bakas", "Yntymak", "Nuriza", "Zarina", "Arun", "Syimyk", "Bektur"};
        int number = random.nextInt(names.length);
        System.out.println(names[number]);
        Student student=new Student();
    }
}
