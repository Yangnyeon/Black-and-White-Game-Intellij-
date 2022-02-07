import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class minum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Random random = new Random();
        ArrayList com = new ArrayList();
        ArrayList me = new ArrayList();
        ArrayList Exception = new ArrayList();
        int meScore = 0 ;
        int comScore = 0 ;




        for(int i = 0 ; i <= 9 ; i++) {
            com.add(i);
            me.add(i);
        }

         //System.out.println(com);
        System.out.println(me);
         int comturn = 0 ;

        for(int q = 0 ; q < 10 ; q++) {
            int meturn = in.nextInt();
            me.remove(new Integer(meturn));

            while (Exception.size() < 1 + q) {
                comturn = random.nextInt(10)  ;
                if(!Exception.contains(comturn)) {
                    Exception.add(comturn);
                }
            }
            com.remove(new Integer(comturn));

            if(meturn > comturn) {
                meScore++;
            } else if(meturn < comturn) {
                comScore++ ;
            }


            System.out.println("내가 입력한 숫자 : " + meturn);
            //System.out.println("컴퓨터 가 입력한 숫자 : " + comturn);
            System.out.println("나의 점수 : " + meScore);
            System.out.println("컴퓨터 점수 : " + comScore);
            System.out.println("내가 남은 숫자 : " + me);
            //System.out.println(com);
        }

        System.out.println("끗");


    }
}

