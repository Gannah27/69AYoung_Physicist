package com.company;

import java.util.Scanner;

public class Main {
    public static String Equivlence(int x,int arr[][]){
        int sum=0;
        for(int j=0;j<3;j++){

            for (int i=0;i< arr.length;i++){
                sum+=arr[i][j];
            }
            if(sum!=0){

                return "NO";
            }
        }
       return "YES";
    }

    public static void main(String[] args) {
        int sum=0;
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        int[][] twoD = new int[x][3];
        for(int i=0;i<x;i++){
            for (int j=0;j<3;j++) {
                twoD[i][j] = s.nextInt();
            }
        }
        System.out.println( Equivlence(x,twoD));
    }
 }

