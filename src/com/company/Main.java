package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String selectItem;
        System.out.println("1)riazi1  2)riazi2  3)gosaste");
        selectItem=obj.nextLine();

        switch(selectItem)
        {
            case "1" :
                Riazi1 riazi1=new Riazi1() {
                    @Override
                    public void Hamniazi() {
                        System.out.println("riazi 1 pishniaze riazi 2 va gosaste ast");

                    }

                    @Override
                    public void TedadVahed() {
                        System.out.println("riazi1,3 vahed ast");
                    }
                }
            case"2":
                Riazi2 riazi2=new Riazi2() {
                    @Override
                    public void Pishniazi() {
                        System.out.println("riazi2 hamniaz gosaste ast");

                    }

                    @Override
                    public void TedadVahed() {
                        System.out.println("riazi 2,3 vahed ast");
                    }
                }
            case"3":
                Gosaste gosaste=new Gosaste() {
                    @Override
                    public void Hamniazi() {
                        System.out.println("gosaste va riazi2 ham niaz hastan");
                    }

                    @Override
                    public void TedadVahed() {
                        System.out.println("gosaste 3 vahed darad");
                    }
                }
        }

    }
}
