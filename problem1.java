public class problem1 {
    public static void main(String[] args) {
        String s = "Hello World";
       recursiveMethod(s);
    }
    static String recursiveMethod(String str)
    {
    char [] ch = str.toCharArray();
    for (int i = ch.length-1; i >=0;i--){
        System.out.print(ch[i]);
    }
    return str;
    }
}
