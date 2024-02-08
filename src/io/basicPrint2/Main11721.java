package io.basicPrint2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text= br.readLine();
        int count =0;
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i));
            count++;
            if(count==10){
                System.out.println();
                count=0;
            }
        }
    }
}
/**
 *입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
 *
 *   입력                                                                                 출력
 *OneTwoThreeFourFiveSixSevenEightNineTen                    OneTwoThre
 *                                                                                 eFourFiveS
 *                                                                                 ixSevenEig
 *                                                                                 htNineTen
 * */