package utilities;
public class Preparation {
  public static int[][] numbersToSearchFor;
	
	public static int[][] obtainData() {
		int[][] mainArray = new int[20][1000]; //20 arrays inside, each with a size of 1000
		int count = 50;

		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< count; j++) {
				mainArray[i][j] = getRandomNumber();
			}
			count += 50;
		}

		return mainArray;
	}
	
	public static int[][] getNumbersToSearch(int[][] mainArray){
		int[][] numbersToSearch = new int[20][20];

		int count = 50;
		for(int i = 0; i< 20; i++) {
			for(int j = 0; j< 20; j++) {
				int randomNumber = (int)(Math.random()*count);
				numbersToSearch[i][j] = mainArray[i][randomNumber];
				
			}
			count += 50;
		}
		return numbersToSearch;
	}
	
	private static int getRandomNumber() {
		return (int) (Math.random() * 100000);
	}	

}
