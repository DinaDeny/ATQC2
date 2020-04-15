package com.yalantis;

//1 task
public class App {
    public static void main(String[] args) {
        String myName = "John";
        String myAdmin = myName;
        System.out.println(myAdmin);
    }
}


//2 task
public class App {
    public static void main(String[] args) {
        System.out.println(r(25, 20));
    }
    public static int r (int n1, int n2) {
        return n1 - n2;
    }

}


//3 task
public class App {
    public static void main(String[] args) {
        int result = maxFunction(142, 350, 105);
        System.out.println("Максимальное значение " + result);
    }

        public static int maxFunction ( int n1, int n2, int n3){
            int maxValue = n1;
            if (n2 > n1 && n2 > n3) {
                return n2;
            }
            else if(n3>n2 && n3>n1){
                return n3;
            }
        return n1;
        }


    }




//4 task
public class App {
    public static void main(String[] args) {

        int num = 27;
        if (num%2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}


//5 task
public class App {
    public static void main(String[] args) {
        //for
        for (int i = 5; i > 0; i--){
        System.out.println(i);
        }
        // while
        int i = 5;
        while (i >= 1){
            System.out.println(i);
            i--;
        }
        //do while
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);


    }
}


//6 task
    public class App {
        public static void main(String[] args) {

            String mySeven = "Таблица умножения на 7:";
            System.out.println(mySeven);
            for (int i=1; i<10; i++){
                String mySeven1 = i + " * 7";
                System.out.println(mySeven1 + " = " + i*7);
            }
        }
    }


// 7 task
    public class App {
        public static void main(String[] args) {
            int[] array1 = {54, 47, 896, 46};
            int sum = 0;
            for(int i = 0; i<array1.length; i++){
                sum += array1[i];
            }
            System.out.println(sum);

        }
    }

//8 task
    public class App {
        public static void main(String[] args) {
            calculator ( 250.5, '5', 5.5);
        }
        public static void calculator( double n1, char operation, double n2) {
            if(operation == '+') {
                System.out.println("Результат сложения = " + (n1 + n2));
            } if (operation == '-'){
                System.out.println("Результат вычитания = " + (n1 - n2));
            }
            if (operation == '*'){
                System.out.println("Результат умножения = " + (n1 * n2));
            }
            if (operation == '/') {
                System.out.println("Результат деления = " + (n1 / n2));
            }
          switch (operation){
              case '+':
                  System.out.println("Результат сложения = " + (n1 + n2));
                  break;
              case '-':
                  System.out.println("Результат вычитания = " + (n1 - n2));
                  break;
              case '*':
                  System.out.println("Результат умножения = " + (n1 * n2));
                  break;
              case '/':
                  System.out.println("Результат деления = " + (n1 / n2));
                  break;
              default:
                  System.out.println("Неверно указан оператор");
          }
        }
    }





