import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[7][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==0||i==3||i==6){
                    arr[i][j]=" * ";
                }
                else if(j==0||j==3){
                    arr[i][j]=" * ";
                }
                else{
                    arr[i][j]="   ";
                }

            }
        }

        for(String[] sira:arr){
            for(String sutun:sira){
                System.out.print(sutun);
            }
            System.out.println();
        }

    }
}