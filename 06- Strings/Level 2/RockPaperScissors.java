import java.util.Scanner;

public class RockPaperScissors {

    public static int computerChoice(){
        int choice = (int) ((Math.random()*2 )+ 1);
        System.out.println(choice);
        return choice;
    }

    public static int matchUp(int user ,int computer){
        if(user == 1 && computer == 2){
            return 2;
        }else if(user == 2 && computer == 3){
            return 3;
        }else if(user == 3 && computer == 1){
            return 1;
        }else if(user == 1 && computer == 3){
            return 1;
        }else if(user == 3 && computer == 2){
            return 3;
        }else if(user == 2 && computer == 1){
            return 2;
        }
        return 0;
    }

    public static void averageWins(int userWins, int computerWins,int n){
        System.out.println(userWins+ " "+ computerWins + " "+ n);

        int[][] arr = new int[2][2];
        double userWinsAverage =(double) userWins /n;
        double computerWinsAverage =(double) computerWins /n;
        System.out.println("User Win Average " + userWinsAverage + " Computer Win Average " + computerWinsAverage);
        double userWinPercent = userWinsAverage * 100;
        double computerWinPercent = computerWinsAverage * 100;

        System.out.println("User Percent " + userWinPercent + " computer win Percent " + computerWinPercent);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Games to play");
        int n = input.nextInt();
        String[] game = {"Tied","rock", "paper", "scissors"};
        int userWins = 0;
        int computerWins =0;
        int loop = n;
        while (loop>0){
            System.out.println("1: Rock 2: Paper 3: Scissors");
            int userChoice = input.nextInt();
            int computerChoice = computerChoice();

            int res = matchUp(userChoice,computerChoice);
            if(game[computerChoice] == game[res] ){
                System.out.println("Computer Wins");
                computerWins++;

            } else if (game[userChoice] == game[res]) {
                System.out.println("You win");
                userWins++;
            }else {
                System.out.println("Match Tied");
            }
            System.out.println(game[userChoice] + " " + game[computerChoice] + " " + game[res]);
            loop--;
        }
        averageWins(userWins,computerWins,n);
    }
}
