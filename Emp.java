class Emplo {
    int salary=10000;
    int bonus=0;
    Emplo(){
        getSalary();
        getBonus();
    }
    int getSalary(){
        return salary;
    }
    int getBonus(){
        return bonus;
    }
}

class Intern extends Emplo{
    Intern(){
        super();
    }
    int getSalary(){
        return (3*salary)/4;
    }
    int getBonus(){
        return 500;
    }
}
class Clerk extends Emplo{
    Clerk(){
        super();
    }
    int getSalary(){
        return (salary/2);
    }
    int getBonus(){
        return 1000;
    }
}
class Manager extends Emplo{
    Manager(){
        super();
    }
    int getSalary(){
        return (2*salary);
    }
    int getBonus(){
        return 5000;
    }
}
public class Emp{
    public static void main(String args[]){
        Emplo i=new Intern();
        System.out.println("----- For Intern ------");
        System.out.println("The base salary for intern is: Rs."+i.getSalary());
        System.out.println("The bonus for the intern is: Rs."+i.getBonus());
        System.out.println("The total salary for intern is: Rs."+(i.getSalary()+i.getBonus())+"\n");
        
        Emplo c=new Clerk();
        System.out.println("----- For Clerk ------");
        System.out.println("The base salary for clerk is: Rs."+c.getSalary());
        System.out.println("The bonus for the clerk is: Rs."+c.getBonus());
        System.out.println("The total salary for clerk is: Rs."+(c.getSalary()+c.getBonus())+"\n");
        
        Emplo m=new Manager();
        System.out.println("----- For Manager ------");
        System.out.println("The base salary for manager is: Rs."+m.getSalary());
        System.out.println("The bonus for the manager is: Rs."+m.getBonus());
        System.out.println("The total salary for manager is: Rs."+(m.getSalary()+m.getBonus())+"\n");
    }
}

