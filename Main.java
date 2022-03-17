public class Main {
        public static void main(String[] args) {
		double a = 1.75;
		double b = 70.0;
		double bmi = b/(a*a);

                
		bmi = ((double)Math.round(bmi*10))/10;
		 System.out.println( bmi );
        }
}


