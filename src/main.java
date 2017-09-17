
public class main {
    public static void printAsteristks(){
        System.out.print("*");
    }

    public static void printAsteristks(int n){
        for(int i = 1; i <= n; i++){
            printAsteristks();
        }
    }

    public static void printAsteristksLine(int n){
        for(int i = 1; i <= n; i++){
            printAsteristks();
        }
        System.out.print("\n");
    }

    public static void printAsteristksColumm(int n){
        for(int i = 0; i <= n; i++){
           System.out.println("*");
        }
    }

    public static void printAsteristksTriangle(int n){
        int m = 1;
        while (m <= n){
            printAsteristksLine(m);
            m++;
        }
    }

    public static void printWhiteSpace(int n){
        for(int i = 1; i <= n; i++){
            System.out.print(" ");
        }
    }

    public static void printAsteristksIsoscelesTriangle(int n){
        int j = n;
        while (j > 0){
            printWhiteSpace(j-1);
            printAsteristks((n-j) * 2 + 1);
            printWhiteSpace(j-1);
            System.out.print("\n");
            j--;
        }
    }

    public static void printAsteristksIsoscelesTriangleWithName(int n, String name){
        int j = n;
        while (j > 0){
            if(j != 1) {
                printWhiteSpace(j - 1);
                printAsteristks((n - j) * 2 + 1);
                printWhiteSpace(j - 1);
                System.out.print("\n");
            }else{
                System.out.println(name);
            }
            j--;
        }
    }

    public static void printAsteristksInverseIsoscelesTriangle(int n){
        int j = 1;
        while (j <= n){
            if(j != 1) {
                printWhiteSpace(j - 1);
                printAsteristks((n - j) * 2 + 1);
                printWhiteSpace(j - 1);
                System.out.print("\n");
            }
            j++;
        }
    }

    public static void printDimmond(int n){
        printAsteristksIsoscelesTriangle(n);
        printAsteristksInverseIsoscelesTriangle(n);
    }

    public static void printDimmondName(int n, String name){
        printAsteristksIsoscelesTriangleWithName(n, name);
        printAsteristksInverseIsoscelesTriangle(n);
    }

    public static void fizzBuzz(int n){
        int m = 1;
        while (m <= n){
            if(m%3 == 0 && m%5 == 0){
                System.out.println("FizzBuzz");
            }else if(m%3 == 0){
                System.out.println("Fizz");
            }else if(m%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(m);
            }
            m++;
        }
    }

    public static void main (String args []){
        fizzBuzz(15);
    }
}
