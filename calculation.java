class Test{
    double base;
    int power, logBase, argument;
    Test(){
        base=2.0;
        power=2;
        logBase=2;
        argument=2;
    }

    double calculate(double base,int power){
        return Math.pow(base,power);
    }

    double calculate(int logbase,int argument){
        return Math.log(argument)/Math.log(logBase);
    }

    void display(double output){
        System.out.println("The output is: "+output);
    }
}

public class Main {
    public static void main(String args[]){
        Test obj=new Test();
        obj.display(obj.calculate(2,4));
        obj.display(obj.calculate(2.0,4));
    }
}
