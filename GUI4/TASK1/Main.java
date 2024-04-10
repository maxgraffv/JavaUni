class Main
{
    public static void main(String[] args)
    {

        ICalc myAdd = (x, y) -> {return x + y;};
        ICalc mySubtract = (x, y) -> {return x - y;};
        ICalc myMultiply = (x, y) -> {return x * y;};
        ICalc myDivide = (x, y) -> { 
               if(y == 0) throw new ArithmeticException("CANNOT DIVIDE BY ZERO");
               return x/y;
            };


        System.out.println("ADD: " + myAdd.calc(4, 4));
        System.out.println("SUB: " + mySubtract.calc(4, 4));
        System.out.println("MUL: " + myMultiply.calc(4, 4));
        System.out.println("DIV: " + myDivide.calc(4, 4));


    }

}
