import java.util.Scanner;

public class RectHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        //outerloop
        for(int i=1; i<=x; i++){
            //inner loop
            for(int j=1;j<=y;j++){
                //cell ---> (i,j)
                //Use || for 'and'
                if(i==1||j==1||i==x||j==y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
