
public class Calculator {
	//attributes
	double calcValue;
	
	//Constructor
	Calculator(){
		calcValue = 0;
	}
		
	Calculator(double value){
		calcValue = value;
		}
	
	double getcalcValue(){
		return calcValue;
}
	void addValue(double value){
		calcValue += value;
	}
	void subtractValue(double value){
		 calcValue -= value;
	}
	void multiplyValue(double value){
		calcValue *= value;
	}
	void divideValue(double value){
		calcValue /= value;
	}
	
}
