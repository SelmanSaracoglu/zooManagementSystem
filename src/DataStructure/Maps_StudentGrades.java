package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Maps_StudentGrades {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();

        int total = 0;

        grades.put("Selman", 94);
        grades.put("Hansa", 98);
        grades.put("Fehmi", 87);
        grades.put("Kerim", 68);

        for (Map.Entry<String, Integer> entry : grades.entrySet()){
            total += entry.getValue();
        }
        double average = (double) total / grades.size();
        System.out.println("Not Ortalaması: " + average);



        String topStudent = "";
        int highestGrade = 0;

        for (Map.Entry<String, Integer> entry : grades.entrySet()){
            if(entry.getValue() > highestGrade) {
                highestGrade = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("En Yuksek Not " + highestGrade + " ile " + topStudent + " Ogrencisine Ait.");


    }

}
