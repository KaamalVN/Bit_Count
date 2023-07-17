import java.util.Scanner;

public class Bit_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count=0;
        while(number>0){

            if((number%2)==1){
                count++;
            }
            number/=2;
        }
        System.out.println(count);
    }
}
