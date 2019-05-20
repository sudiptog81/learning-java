/*
 *  The MIT License
 *  Copyright (c) 2019 Sudipto Ghosh
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package pro.ghosh.sudipto.javatutorial.classes;

public class Student {
    private int id;
    private int age;
    private String name;

    Student(int id, String name, int  age) {
        set_id(id);
        set_name(name);
        set_age(age);
    }

    private int get_id() {
        return this.id;
    }

    private void set_id(int id) {
        this.id = id;
    }

    public String get_name() {
        return this.name;
    }

    private void set_name(String _name) {
        this.name = _name;
    }

    public int get_age() {
        return this.age;
    }

    private void set_age(int age) {
        this.age = age;
    }
}
