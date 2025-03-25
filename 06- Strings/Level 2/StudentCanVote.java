import java.util.Arrays;

public class StudentCanVote {
    public static int[] rand(){
        int[] arr = new int[10];
        for(int i =0 ; i< 10 ; i++){
            arr[i] = (int) (Math.random() * 99);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static String[][] canVote(int[] ages){

        String [][] vote = new String[ages.length][2];
        for( int i= 0; i< ages.length ;i++){
            vote[i][1] = String.valueOf(ages[i]);
            if(ages[i]>= 18){
                vote[i][0] = "Can Vote";
            }
            else {
                vote[i][0] = "Cannot Vote";
            }
        }
        System.out.println(Arrays.deepToString(vote));
        return vote;
    }

    public static void display(String[][] vote){
        for (int i =0 ; i< vote.length ; i++){
            System.out.println(vote[i][0] + " " + vote[i][1]);
        }
    }
    public static void main(String[] args) {

    int ages [] = rand();
    String [][] vote = canVote(ages);
    display(vote);

    }
}
