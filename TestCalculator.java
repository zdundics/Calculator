
public class TestCalculator {
	public static void main(String [] args){
		Calculator casio = new Calculator();
		Calculator texasInt = new Calculator(3);
		
		casio.addValue(5);
		casio.subtractValue(5);
		System.out.println(casio.getcalcValue());
		
		
		texasInt.multiplyValue(2);
		System.out.println(texasInt.getcalcValue());
	}
}
