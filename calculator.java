/* 
Write a class Calculator with add, subtract, multiply, and divide methods. Call them using object.*/
class Calculator {
    float n1, n2;

    Calculator(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    float add() {
        return n1 + n2;
    }

    float subtract() {
        return n1 - n2;
    }

    float multiply() {
        return n1 * n2;
    }

    float divide() {
       try{
        return n1/n2;
       }
       catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(12, 4);

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}





