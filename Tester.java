import java.util.*;

class Employee{
private String name;
private String id;
private int age;
Scanner sc=new Scanner(System.in);

Employee(String name,String id,int age){
setName(name);
setid(id);
setAge(age);
}

void setName(String name){
this.name=name;
}
String getName(){
return name;
}

void setid(String id){
this.id=id;
}
String getid(){
return id;
}

void setAge(int age){
this.age=age;
}
int getAge(){
return age;
}
}

class SalariedEmployee extends Employee{
private double empSalary;
char status;

SalariedEmployee(String name,String id,int age,double empSalary){
super(name,id,age);
setSalary(empSalary);
}

void setSalary(double empSalary){
this.empSalary=empSalary;
}

double getSalary(){
return empSalary;
}

void empstatus(){
System.out.print("Enter status of the employee ==> 'P' for Permanent or 'C' for Contract: ");
status=sc.next().charAt(0);
if(status=='P'){
setSalary(empSalary+2000);               //permanent emp ==> allowance
}
else if(status=='C'){
setSalary(empSalary);                  //contract emp ==> no allowance
}
}
}

public class Tester{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
SalariedEmployee[] emp=new SalariedEmployee[5];

for(int i=0;i<5;i++){
System.out.print("Enter the name of the employee: ");
String n=sc.nextLine();
System.out.print("Enter the id: ");
String d=sc.nextLine();
System.out.print("Enter the age of the employee: ");
int a=sc.nextInt();
System.out.print("Enter the salary of the employee: ");
double s=sc.nextDouble();
sc.nextLine();
SalariedEmployee obj=new SalariedEmployee(n,d,a,s);
emp[i]=obj;
emp[i].empstatus();
System.out.print("\n");
}

for(int i=0;i<4;i++){
for(int j=i+1;j<5;j++){
SalariedEmployee temp;
if(emp[i].getSalary()>emp[j].getSalary()){
temp=emp[i];
emp[i]=emp[j];
emp[j]=temp;
}
}
}

System.out.println("The details of the employee with highest salary");
System.out.println("Name: "+emp[4].getName());
System.out.println("Id: "+emp[4].getid());
System.out.println("Age: "+emp[4].getAge());
System.out.println("Salary: "+emp[4].getSalary());
}
}

