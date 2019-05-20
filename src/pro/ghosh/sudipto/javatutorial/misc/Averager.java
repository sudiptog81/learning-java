/*
 *  The MIT License
 *  Copyright (c) 2019 Sudipto Ghosh
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package pro.ghosh.sudipto.javatutorial.misc;

import java.util.Scanner;

public class Averager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int marks;
        int average;

        System.out.print("Enter number of subjects studied: ");
        int subjects = s.nextInt();

        for (int i = 0; i < subjects; i++) {
            System.out.print("Marks in Subject " + (i + 1) + ": ");
            marks = s.nextInt();
            total += marks;
        }

        average = total / subjects;
        System.out.print("Average: " + average);
    }
}
