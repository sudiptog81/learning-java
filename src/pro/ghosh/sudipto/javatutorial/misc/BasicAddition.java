/*
 *  The MIT License
 *  Copyright (c) 2019 Sudipto Ghosh
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package pro.ghosh.sudipto.javatutorial.misc;

import java.util.Scanner;

public class BasicAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double fNum, sNum, result;
        System.out.print("Enter the first number: ");
        fNum = s.nextDouble();
        System.out.print("Enter the second number: ");
        sNum = s.nextDouble();
        result = fNum + sNum;
        System.out.print("Result: " + result);
    }
}
