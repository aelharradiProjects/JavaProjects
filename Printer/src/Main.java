
public class Main {
	public static void main(String[] args) {
		int numberPages = 409;
		int addedPages=0;
		if (numberPages%4 != 0) {
			addedPages=4-numberPages%4;
			numberPages=numberPages+addedPages;
		}
		System.out.println(addedPages + " Pages added ");
		for (int i = 1; i <= numberPages/2; i+=2) {
			System.out.print(i+",");
			System.out.print(numberPages/2+i+",");
			System.out.print(numberPages/2+i+1+",");
			System.out.print(i+1+",");
		}
		
	}
}
