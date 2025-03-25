public class NullPointerException {
    public static String meth(){
        String text = null;
        return text;
    }
    public static void main(String[] args) {
        try{
        String text = meth();
        System.out.println(text.toLowerCase());


        }catch (NullPointerException e){
            System.out.println("solved " + e.getMessage());
        }

    }
}
