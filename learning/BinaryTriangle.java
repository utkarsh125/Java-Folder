// Should look something like this:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class BinaryTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                int x=i+j;
                String space = " ";
                if(x%2==0){
                    System.out.print("1"+space);
                }else{
                    System.out.print("0"+space);
                }
            }
            System.out.println();
        }
    }
}
