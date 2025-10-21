package cognizant.qea25qe028;

class Cthread extends Thread{
Cthread(){start();}
public void run(){
System.out.print("Hi");}
public static void main (String args[]){
Cthread th1=new Cthread();
Cthread th2=new Cthread();
}}