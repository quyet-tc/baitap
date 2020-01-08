/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

/**
 *
 * @author Admin
 */
public class Session56 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    String studName;
    int studAge;
    void initialize(){
        studName="jame";
        studAge=26;
        
    }
    void display(){
        System.out.println("Student Name: "+studName);
        System.out.println("Student Age: "+studAge);
    }
    
    public static void main(String[] args) {
        
//        int num=1;
//        int product = 0 ;
//        while (num<=5){
//            product = num *10;
//            System.out.printf("\n%d*10=%d",num,product);
//            num++;
//        }
//        System.out.println("\nOutside  the loop!");
//int num1=1;
//int num2=30;
//while (++num1<--num2);
//        System.out.println("midpointn is: "+num1);
//
//while (true){
//    System.out.println("Welcome to loops...");
//}
//int num=1,sum=0;
//
//do{
//    sum=sum+num;
//    num++;
//}while(num<=10);
//        System.out.printf("Sum of 10 number is:%d\n",sum);
/*for statement*/
//
/*scope of control variable in 'for' statement*/
//int product;
//for(int num=1;num<=5;num++){
//    product=num*10;
//    System.out.printf("\n%d*10=%d",num,product);
//}
/*use of comma in 'for' statement*/
//int i,j;
//int max=10;
//for (i=0,j=max;i<=max;i++,j--){
//    System.out.printf("\n%d+%d=%d",i,j,i+j);
//}
/*variation in 'for ' loop*/
//
/*infinite 'for' loop*/
//for (;;){
//    System.out.println("This will go on and on");
//}
/*nested loop*/
//int row,col;
//for(row=1;row<=5;row++){
//    for(col=1;col<=row;col++){
//        System.out.println("*");
//    }
//    System.out.println();
//}
/*break statemet*/
//int cnt,number;
//for (cnt=1,number=0;cnt<=10;cnt++){
//    Scanner input=new Scanner(System.in);
//    System.out.println("Enter a number: ");
//    number=input.nextInt();
//    if(number==0){
//        break;
//    }
//    
//}
/*continue statement*/
//int cnt,square,cube;
//for (cnt=1;cnt<300;cnt++){
//    if(cnt%3==0){
//        continue;
//    }
//    square=cnt*cnt;
//    cube=cnt*cnt*cnt;
//    System.out.printf("\nSquare of %d is %d",cnt,square,cube);
//}
/*labeled statements*/
//int i;
//outer:
//for(i=0;i<5;i++){
//    if(i==2){
//        System.out.println("hello");
//        break outer;
//    }
//    System.out.println("this is outer loop.");
//}
//        System.out.println("Good-bye");
//outer:
//for(int i=1;i<5;i++){
//    for(int j=1;j<5;j++){
//        if(j>i){
//            System.out.println();
//            continue outer;
//        }
//        System.out.print(" "+j );
//    }
//    System.out.println("\nThis is the outer loop.");
//}
//        System.out.println("Good-bye");

/*if anumber is 3 then it is secondstring*/
/*session 5 try it yourself*/
//Scanner s=new Scanner(System.in);
//        System.out.println("nhap aNumber");
//int aNumber =s.nextInt();
//
//if(aNumber>=0){
//    if(aNumber==0){
//        System.out.println("First string");
//    }else{
//        System.out.println("Second string");
//        
//    }
//}else{
//    System.out.println("Third String");
//}
//homework objCustomer1=new homework();
//objCustomer1.customerID=100;
//objCustomer1.customerName="john";
//objCustomer1.customerAddress="123Street";
//objCustomer1.customerAge=30;
//        System.out.println("Customer Identification Number:"+objCustomer1.customerID);
//        System.out.println("Customer Name: "+objCustomer1.customerName);
//        System.out.println("Customer Address: "+objCustomer1.customerAddress);
//        System.out.println("Customer Age: "+objCustomer1.customerAge);
//      
//out:
//while(true){
//    Scanner input=new Scanner(System.in);
//    System.out.println("nhap vao mot so: ");
//    int a=input.nextInt();
//    System.out.printf("so ban vua nhap la: %d\n",a);
//    System.out.println("do you want to input more ? yes or no");
//    Scanner input1=new Scanner(System.in);
//    String st=input1.nextLine();
//    if(st.equals("yes")){
//        continue out;
//    }else{
//        break;
//    }
//}
/*tim so nguyen to giua hai so*/
//int a ,b;
//Scanner input = new Scanner(System.in);
//        System.out.println("nhap vao so a: ");
//        a=input.nextInt();
//        System.out.println("nhap vao so b: ");
//        b=input.nextInt();
//        System.out.println("so nguyen to giua hai so la:");
//        out:
//        for(int i=a;i<=b;i++){
//            int count=0;
//            for(int j=1;j<i;j++){
//                if(i%j==0){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.println(i);
//            }
//        }
//  
/*session 5 -exercise4*/
//Scanner input=new Scanner(System.in);
//String a,b,c,d;
//a=input.nextLine();
//b=input.nextLine();
//c=input.nextLine();
//d=input.nextLine();
//System.out.printf("the sum is: %s",a+b+c+d);
//
/*session 6*/
//homework objStudent =new homework();
//objStudent.initialize();
//objStudent.display();
/*snippet2*/


 }
}
 class Customerhw{
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void changecustomeraddress(String address){
     customerAddress=address;
    
 }
    void displaycustomerinfor(){
        System.out.println("customer Identificationnumber: "+customerID);
        System.out.println("Customer Address: "+customerAddress);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Age: "+customerAge);
        
        
    }
    public static void main(String[] args) {
        Customerhw objCustomer1=new Customerhw();
        objCustomer1.customerID=100;
        objCustomer1.customerName="john";
        objCustomer1.customerAddress="123 Street";
        objCustomer1.customerAge=30;
//        System.out.println("Customer identification Number:"+objCustomer1.customerID);
//        System.out.println("Customer Name: "+objCustomer1.customerName);
//        System.out.println("Customer Address: "+objCustomer1.customerAddress);
//        System.out.println("Customer Age: "+objCustomer1.customerAge);
objCustomer1.displaycustomerinfor();      
    }
}
class Customer{
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void displaycustomerinfor(){
        System.out.println("customer Identificationnumber: "+customerID);
        System.out.println("Customer Address: "+customerAddress);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Age: "+customerAge);
       
    }
    void changeCustomerAddress(String address){
        customerAddress=address;
    }
    public static void main(String[] args) {
        Customer objCustomer= new Customer();
        objCustomer.customerID=100;
        objCustomer.customerName="john";
        objCustomer.customerAddress="1234Street";
        objCustomer.customerAge=30;
        System.out.println("the result before modified");
        objCustomer.displaycustomerinfor();
        objCustomer.changeCustomerAddress("Main street");
        System.out.println("the result after modified:");
        objCustomer.displaycustomerinfor();     
    }
}
class Rectangle{
    int a;
    int b;
    
    Rectangle(){
       a=10;
       b=10;
    }
    public static void main(String[] args) {
        Rectangle objRec=new Rectangle();
        System.out.println("Width: "+objRec.a);
        System.out.println("height: "+objRec.b);
    }
        
}
class Employee2{
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;
    void displayEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("=================");
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Employee Age: "+employeeAge);
        System.out.println("Employee Salary: "+employeeSalary);
        System.out.println("Employee Marital Status: "+maritalStatus);
       
    }
    public static void main(String[] args) {
        Employee2 objEmp=new Employee2();
        objEmp.displayEmployeeDetails();
    }
}
class Rectangle1{
    int a;
    int b;
    Rectangle1(){
        System.out.println("Constructor Invoked..");
        a=10;
        b=10;
        
    }
    Rectangle1(int widt,int heig){
        System.out.println("Parameerized Constructor");
        a=widt;
        b=heig;
    }
    
    void displayDimension(){
        System.out.println("Width: "+a);
        System.out.println("Height: "+b);
    }
    public static void main(String[] args) {
        Rectangle1 objRec1=new Rectangle1(10,20);
        Rectangle1 objRec2=new Rectangle1(6,9);
        System.out.println("\nRectanglee1 Details");
        System.out.println("=============");
        objRec1.displayDimension();
        System.out.println("\nRectangle2 Details");
        System.out.println("\n===========");
        objRec2.displayDimension();
    }
}
class objectReferences{
    int a ;
    int b;
    objectReferences(int c,int d){
        a=c;
        b=d;
    }
    void displayDismention(){
        System.out.println("width: "+a);
        System.out.println("Height: "+b);
    }
    public static void main(String[] args) {
        objectReferences objRec1=new objectReferences(10,10);
        objectReferences objRec2;
        objRec2=objRec1;
        System.out.println("Rectangle1 detail");
        System.out.println("=====");
        objRec1.displayDismention();
        System.out.println("Rectangle2 detail");
        System.out.println("=====");
        objRec2.displayDismention();
        
        
    }
}
 class Rectangle2 {
    private int width;
    private int height;
        public Rectangle2() {
        System.out.println("Constructor Invoked...");
        width = 10;
        height = 10;
        }
        public Rectangle2 (int wid, int heig) {
        System.out.println("Parameterized Constructor Invoked...");
        width = wid;
        height = heig;
        }
        public void displayDimensions(){
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
        }
        public static void main(String[] args) {
        Rectangle2 a = new Rectangle2();
        a.displayDimensions();
    }
}
 class CustomerDetail {
    private String name = "John";
    private int age = 12;
    
    void displayDetails() {
    System.out.println("Person Details");
    System.out.println("==============");
    System.out.println("Person Name: " + name);
    System.out.println("Person Age: " + age);
    }
    public static void main(String[] args) {
    CustomerDetail a = new CustomerDetail();
    a.displayDetails();
}
}
class bankingAccount {
    private int accountID;
    private String holderName;
    private String accountType;
    {
        accountID = 100;
        holderName = "John Anderson";
        accountType = "Savings";
    }
        public void displayAccountDetails() {
            System.out.println("Account Details");
            System.out.println("===============");
            System.out.println("Account ID: " + accountID + "\nAccount Type: " +accountType);
        }
        public static void main(String[] args) {
        bankingAccount objAccount = new bankingAccount();
        objAccount.displayAccountDetails();
        }
}