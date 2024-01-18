import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("heres your pyramid");
        pyramidString(n);
        sc.close();
    }
public static int pyramidString(int x){
    int rowCount=1;
    for(int i = 0; i < x; i++){
        for(int j = x; j >= i; j--){
            System.out.print(" ");
        }
        for(int h = 1; h <= rowCount;h++){
            System.out.print("* ");
        }
System.out.println();
rowCount++;
    }
    return x;
}
}

