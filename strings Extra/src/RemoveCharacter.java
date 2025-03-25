public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        String result = str.replace(String.valueOf(ch), "");
        System.out.println("Modified String: " + result);
    }
}
