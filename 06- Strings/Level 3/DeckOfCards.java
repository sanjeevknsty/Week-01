import java.util.Arrays;
import java.util.Scanner;

public class DeckOfCards {

    public static String[] getsuitAndRank(String[] suits ,String[] rank,int cards){
    String[] decKOfCards = new String [cards];
    int count = 0;
        for(int i =0 ; i< suits.length ; i++){
            for (int j =0; j < rank.length ; j++){
                decKOfCards[count++] = rank[j] + " of " + suits[i];
            }
        }
//        System.out.println(Arrays.deepToString(decKOfCards));
    return decKOfCards;
    }

    public static String[] shuffle(String[] cards){
        for (int i =0 ; i<cards.length ;i++){
            int randomCardNumber = i + (int) (Math.random() * (cards.length - i));
            cards[i] = cards[randomCardNumber];
        }
//        System.out.println(Arrays.toString(cards));
        return cards;
    }

    public static void distribute(String [] cards,int players,int n){
        int numOfCards = cards.length;
        if (players * n <= numOfCards){
            int count = 0;
            String[][] playersCards = new String[players][n];
            for (int i= 0 ; i< players;i++){
                for (int j =0 ; j<n;j++ ){
                    playersCards[i][j] = cards[count++];
                }
            }
            System.out.println(Arrays.deepToString(playersCards));
            for (int i= 0 ; i< players;i++){
                System.out.println("Player " +(i+1));
                for (int j =0 ; j<n;j++ ){
                    System.out.print( playersCards[i][j] + ", " );
                }
                System.out.println();
            }
        }else {
            System.out.println("Not Possible");
        }

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Players");
        int players = input.nextInt();
        System.out.println("Enter cards to disribute");
        int n = input.nextInt();

        String [] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] rank = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int numOfCards = suits.length * rank.length;

        String[] decKOfCards =  getsuitAndRank(suits,rank,numOfCards);

        String [] shuffledCards = shuffle(decKOfCards);

        distribute(shuffledCards,players,n);


    }
}
