import java.util.Random;
import java.util.Scanner;
public class Testscores {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)
    {
        Random random=new Random();
        int size = random.nextInt((10-3) + 1) + 3;
        int[] testScores=new int[size];
        String[] letterGrades=new String[size];
        int kale=1;
        System.out.println("Please input "+size+" test score(s)");
        for (int i=0; i<size; i++){
            System.out.println();
            System.out.print("Enter test score "+kale++);
            testScores[i]= Integer.parseInt(scanner.nextLine());
        }
        for (int i=0; i<size; i++){
            String letGrade=letterGrades[i];
            int newScores=testScores[i];
            String letterGrade = getLetterGrade(newScores, letGrade, size);
            letterGrades[i]=letterGrade;
        }
        printGrades(letterGrades,testScores, size);
        printHighestScore(testScores, size);
        printLowestScore(testScores, size);
        printAverageScore(testScores, size);

    }
    public static String getLetterGrade(int newScores, String letGrade, int size)
    {
        if(newScores>=90)
        {
            letGrade="A";
            return letGrade;
        }else if(newScores>=80)
        {
            letGrade="B";
            return letGrade;
        }
        else if(newScores>=70)
        {
            letGrade="C";
            return letGrade;
        }
        else if(newScores>=60)
        {
            letGrade="D";
            return letGrade;
        }
        else{
        letGrade="F";
        return letGrade;
    }

    }
    public static void printGrades(String[] letterGrades, int[] testScores, int size)
    {
    for(int i=0; i<size;i++) {
        System.out.println("Score: Grade:");
        System.out.println(testScores[i]+"       "+letterGrades[i]);
    }
    }
    public static void printHighestScore(int[] testScores, int size)
    {
        int highest=0;
        for(int i=1;i<size;i++){
            if (testScores[i]>=highest){
                highest=testScores[i];
            }
        }
        System.out.println("The highest score is "+highest);
    }
    public static void printLowestScore(int[] testScores, int size)
    {
        int lowest=100;
        for(int i=0;i<size;i++){
            if (testScores[i]<=lowest){
                lowest=testScores[i];
            }
        }
        System.out.println("The highest score is "+lowest);
    }
    public static void printAverageScore(int[] testScores, int size)
    {
        float average=0;
        int bale=size;
            for (int i = 0; i <size; i++) {
                average = (average + testScores[i]);
            }
        average=(average)/bale;

        System.out.println("The average score is "+average);
    }
}
