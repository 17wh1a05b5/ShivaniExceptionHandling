package epamcom.ExceptionHandling;
import java.util.Scanner;
import java.util.logging.Logger;
public class Interset_Code {
	static Logger log = Logger.getLogger(Interset_Code.class.getName());
	public static void Interest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		log.info("Enter Principal Amount");
		try {
			double principalamt=sc.nextDouble();
			log.info("Enter Time");
			double time = sc.nextDouble();
			log.info("Enter rate of interset");
			double rateofinterest=sc.nextDouble();
			log.info("Simple Interest ="+(principalamt*time*rateofinterest)/100);
			log.info("Compound Interest ="+ principalamt* (Math.pow((1+rateofinterest/100),time)));
		}
		catch (Exception e) {
			log.info("It is Invalid input");
		}
		
	}
}
