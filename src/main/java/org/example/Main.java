package org.example;
public class Main {
    static class meinRechner{
        private  static final int _Var = 10;
        static int [] Array = new int [10];
        public meinRechner(){}

        public static void iterate () {
            for (int i = 0; i > Array.length; i++) {
                System.out.println(Array[i]);
            }
        }


        public static int add(int a, int b) {
            int localNumber = _Var;
            return ((a + localNumber + b));
        }


        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int divide(int a, int b) {
            return a / b;
        }

        public static int isBigger (int a, int b){
            if(a > b){
                {
                    return a;
                }
            }
            return b;
        }
    }
    public static void main(String[] args) {
        meinRechner.iterate();
        System.out.println(meinRechner.add(1,2));
        System.out.println(meinRechner.multiply(1,2));
        System.out.println(meinRechner.subtract(1,2));
        System.out.println(meinRechner.divide(1,0));
        System.out.println(meinRechner.isBigger(1,2));
    }
}