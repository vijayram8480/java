import java.util.Scanner;
public class test{
    public static void main(String[]args){
        Scanner mark=new Scanner(System.in);
        System.out.println("enter the mark:");
        int gg=mark.nextInt();
        if(gg>=90){
            System.out.println("grade A");
        } 
        else if(gg>=67){
            System.out.println("grade b");
        }
        else if(gg>=56){
            System.out.println("grade c");
        } 
        else{
            System.out.println("grade d");
        }
    }
}