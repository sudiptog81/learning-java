/*
 *  The MIT License
 *  Copyright (c) 2019 Sudipto Ghosh
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package pro.ghosh.sudipto.javatutorial.misc;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int test = new Scanner(System.in).nextInt();

        if (test == 9) {
            System.out.println("Yes!");
        } else if (test < 9 && test >= 0) {
            System.out.println("No!");
        } else if (test <= 3 || test >= 6) {
            System.out.println("Maybe..");
        } else {
            System.out.println("Else!");
        }

        switch (test) {
            case 1:
                System.out.println("Crawl");
                break;
            case 2:
                System.out.println("Talk");
                break;
            case 3:
                System.out.println("Trouble");
                break;
            default:
                System.out.println("Alien!");
                break;
        }

        System.out.println(test == 10 ? "Ten!" : "Not Ten.");
    }
}
