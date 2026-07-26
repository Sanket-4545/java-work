import java.util.Scanner;

public class IntroArray{
    public static void main(String[] args) {
        int marks[] = new int [50];
        Scanner Marks = new Scanner(System.in);
marks [0] = Marks.nextInt();
marks [1] = Marks.nextInt();
marks [2] = Marks.nextInt();

System.out.println("Physics: " + marks[0]);
System.out.println("Chemistry: " + marks[1]);   
System.out.println("Maths: " + marks[2]);

int percentage = (marks[0] + marks[1] + marks[2]) / 3;
System.out.println("Percentage: " + percentage+"%"); 

if (percentage>=35){
    System.out.println("Wow! You passed the exam.");
}
else{
    System.out.println("Sorry, you failed the exam.");  
}
Marks.close();
    }
}