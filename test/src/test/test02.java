package test;

public class test02 {
public static void main(String[] args) {
	for(int a=1;a<=100;a++) {
		if((a%15==0)||(a/10%10==5&&a%10==3)||(a/10%10==3&&a%10==5)) {
			System.out.println("FizzBuzz");
			continue;
		}
		else if((a%3==0&&a%15!=0)||(a%10==3)) {		
			System.out.println("Fizz");
			continue;
		}else if((a%5==0&&a%15!=0)||(a%10==5)){
			System.out.println("Buzz");
			continue;
		}
		System.out.println(a);
	}
}
}

