package org.paualgo;

import org.paualgo.missingnum.*;
import org.paualgo.kaprekar.*;
import org.paualgo.sort.*;
import org.paualgo.spot.*;
import org.paualgo.order.*;

public class Main {

    public static void main(String[] args) {
//        //zad1
//        TestOne testOne = new TestOne(new BubbleSort());
//        testOne.printResult();
//
//        //zad2
//        TestTwo testTwo = new TestTwo();
//        testTwo.spot();
//
//        //zad3
//        TestThree testThree = new TestThree();
//        testThree.test();
//
//        //zad4
//        TestFour testFour = new TestFour();
//        testFour.test();
//
//        //zad5
//        TestFive testFive = new TestFive();
//        testFive.print();

        //testy
        Main main = new Main();
        System.out.println(main.dodawanie(2, 5));
    }

    public int dodawanie(int a, int b) {
        return a+b;
    }
}
