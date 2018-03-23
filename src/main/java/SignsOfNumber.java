public class SignsOfNumber {
	public int sumOfSigns(int number) {
		if (number == 0){
			return 0;
		}else {
			return number%10 + sumOfSigns(number/10);
		}
	}
}
