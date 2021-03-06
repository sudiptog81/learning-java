/*
 *  The MIT License
 *  Copyright (c) 2019 Sudipto Ghosh
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package pro.ghosh.sudipto.javatutorial.classes;

public class DefaultClass {
    public static void main(String[] args) {
        Function function = new Function("Function");
        function.simpleMethod();
        function.greet();

        Function dumbFunction = new Function("Dumb Function");
        dumbFunction.greet();

        Awesome awesome = new Awesome("Message");
        awesome.main(null);

        Student john = new Student(1, "John Doe", 16);
        Student zeba = new Student(2, "Zeba Khan", 18);
        Student[] studentArr = {john, zeba};
        System.out.println("   Name   |   Age");
        System.out.println("---------------------");
        for (Student student: studentArr) {
            System.out.println(student.get_name() + "  |  " + student.get_age());
        }
    }
}
