package test;

public class test01 {
	public static void main(String[] args) {
		for(int a=1;a<=100;a++) {
			if(a%3==0&&a%15!=0) {
				System.out.println("Fizz");
				continue;
			}else if(a%5==0&&a%15!=0){
				System.out.println("Buzz");
				continue;
			}else if(a%15==0) {
				System.out.println("FizzBuzz");
				continue;
			}
			System.out.println(a);
		}
	}

}
