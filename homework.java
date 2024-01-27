package com.cqupt.hello;

import java.util.Scanner;

public class homework {

    public static void main(String[] args) {
        System.out.println("1、第一题答案 B 2、第二题答案 B 3、第三题答案 D 4、第四题答案 B 5、第五题答案 D");
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
//等腰三角形
        System.out.print("请输入想要打印的等腰三角形的行数：");
        int a=sc.nextInt();
        isPalindrome(a);
        System.out.println("---------------------------------------------------------------");
        //逆序,位数
        System.out.println("请输入一个正整数：");
        String s= sc.next();
        reverseSUM(s);
        System.out.println("---------------------------------------------------------------");
        //回文数判断
        System.out.println("输入一个数字（判断是否回文数）");
        int hui= sc.nextInt();
        huiwenshu(hui);
        System.out.println("---------------------------------------------------------------");
        //水仙花数打印
        ShuiXianHua();
        System.out.println("---------------------------------------------------------------");
        //
        System.out.println("请输入十个整数以组成数组");
        int []zuizhi=new int[10];
        arraysDemo(zuizhi);
    }

    public static void isPalindrome(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseSUM(String s){
       String b="";
       char[]c=s.toCharArray();

       for(int i=c.length-1;i>=0;i--){
           b=b+c[i];
       }
        System.out.println("您输入的正整数的位数是："+c.length);
        System.out.println("您输入的正整数的逆序是："+b);
    }

    public static void huiwenshu(int num){
        int t=num;
        int a=0;
        while(num!=0){
            int n=num%10;
            num/=10;
            a=a*10+n;
        }
        if(a==t){
            System.out.println("是的");
        }
        else{
            System.out.println("不是");
        }
    }

    public static void ShuiXianHua(){
        System.out.println("输出所有三位数中的水仙花数");
        for(int i=100;i<1000;i++){
            int a=i/100;
            int b=i%100/10;
            int c=i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.print(i+" ");
            }
        }
    }

    public static void arraysDemo(int []zuizhi){
        Scanner sc=new Scanner(System.in);
        int max=-999999999,min=999999999;
        for(int i=0;i<10;i++){
            zuizhi[i]=sc.nextInt();
            if(zuizhi[i]>max)
                max=zuizhi[i];
            if(zuizhi[i]<=min)
                min=zuizhi[i];
        }
        System.out.println(max+min);
    }
}
