public class clac{
    public static void main(String args[]){
        String testVar = args[0];
        int length = args.length;
        double[] valueArray = new double [length];
        for (int i = 1; i < length; i++){
            valueArray[i] = Double.parseDouble(args[i]);
            System.out.println(args[i]);
        }

        System.out.println(args[0].getClass().getSimpleName());
        System.out.println("test");
        
        if(testVar == "+"){
            System.out.println("test plus");
            System.out.println(plus(valueArray[1], valueArray[2]));
        }
        // } else if (args[0] == "-"){
        //     System.out.println(minus(valueArray[1], valueArray[2]));
        // } else if (args[0] == "*"){
        //     System.out.println(multiply(valueArray[1], valueArray[2]));
        // } else if (args[0] == "/"){
        //     System.out.println(divide(valueArray[1], valueArray[2]));
        // }
    }
    
    public static double plus(double a, double b){
        return a + b;
    }
    public static double minus(double a, double b){
        return a - b;
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
    
    public static String stringAnalysis(String calculation){
        return "";
    }
}    
