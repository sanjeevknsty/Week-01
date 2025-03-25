import java.util.Scanner;

public class PhyChemMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Physics Marks  ");
        int Physics = scanner.nextInt();
        System.out.print("Chemistry Marks ");
        int Chemistry = scanner.nextInt();
        System.out.print("Maths Marks ");
        int Maths = scanner.nextInt();
        
        int total = 300;
        double Marks = Physics+ Chemistry +Maths;
        double percent = (Marks/total) * 100;
        System.out.println(percent);
        if(percent >= 80){
        System.out.println(Marks + " Grade A (Level 4, above agency-normalized standards)" );
            
        }else if(percent >= 70){
        System.out.println(Marks + " Grade B (Level 3, at agency-normalized standards)" );
            
        }else if(percent >= 60){
        System.out.println(Marks + " Grade C (Level 2, below, but approaching agency-normalized standards)" );
            
        }else if(percent >= 50){
        System.out.println(Marks + " Grade D (Level 1, well below agency-normalized standards)" );
            
        }else if(percent >= 40){
        System.out.println(Marks + " Grade E (Level 1, too below agency-normalized standards)" );
            
        }else {
            System.out.println(Marks + " Grade R (Remedial standards)" );
        }

        scanner.close();
    }
}
