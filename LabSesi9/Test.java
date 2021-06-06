/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSesi9;

/**
 *
 * @author HP
 */
public class Test {
    public static void main(String[] args) {
        new A();
        new B();
    }
}

    class A {
        int i = 7;
        
        public A() {
            setI(20);
            System.out.println("i from A is " + i);
        }
        
        public void setI(int i) {
            this.i = 2 * i;
        }
    }

    class B extends A {
        public B() {
            System.out.println("i from B is " + i);
        }

        public void setI(int i) {
            this.i = 3 * i;
        }
    }
