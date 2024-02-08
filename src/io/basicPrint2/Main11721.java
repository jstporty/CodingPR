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
