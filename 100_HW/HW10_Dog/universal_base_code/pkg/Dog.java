package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;

	int sleep=0;
	

	public Dog() {
		name="Clifford";
		age=3;
		breed="big red dog";
		
	}
	public Dog(String call) {
		name=call;
		age=1;
		breed="dog dog";
		
	}
	public Dog(String call,String type) {
		name=call;
		age=1;
		breed=type;
		
	}
	public Dog(String call,int old) {
		name=call;
		age=old;
		breed="big red dog";
		
	}

	public void setName(String call){
		name=call;
	}
	public void setAge(int old){
		age=old;
	}
	public void setBreed(String type){
		breed=type;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;

	}
	public String getBreed(){
		return breed;

	}

	public boolean isSleeping(){
		sleep=(int)(Math.random()*2)+1;
		if(sleep==1){
			
			return true;
		}
		else{
			
			return false;
		}
		
	}
	public void bark(){
		System.out.println(name+" barks!");
		
		
	}

}
