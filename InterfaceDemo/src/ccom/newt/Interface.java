package ccom.newt;

public class Interface {
	public static void main(String[]args) {

		CulturalEvent ce=new CulturalEvent();
		ce.singEvent(new Singer() {public void sing()
		{System.out.println("he is a singer");
		}});
	}
}


		interface Dancer{
			static double PI=3.14;
			public abstract void dance();
		}

		interface Singer{
			static double PI=3.14;
			public abstract void sing();

		}
		class Employee{
			class Manager extends Employee implements Dancer,Singer{
				public void sing() {
					System.out.println("he is a singer");
				}
				public void dance() {
					System.out.println("he is a dancer");

				}
			}
		}
		class CulturalEvent{
			void singEvent(Singer s) {
				s.sing();
			}}