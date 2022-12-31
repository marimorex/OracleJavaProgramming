package oracle_course_test;

import java.util.HashSet;

public class CointTestDriver {

	public static void main(String[] args) {
		HashSet<Coin> bagOfCoins = new HashSet<Coin>();
		
		Coin coin1 = new Coin(1);		
		Coin coin2 = new Coin(2);		
		Coin coin5 = new Coin(5);		
		Coin coin10 = new Coin(10);		
		Coin coin20 = new Coin(20);		
		Coin coin50 = new Coin(50);		
		Coin coin100 = new Coin(100);
		
		bagOfCoins.add(coin1);
		bagOfCoins.add(coin2);
		bagOfCoins.add(coin5);
		bagOfCoins.add(coin10);
		bagOfCoins.add(coin20);
		bagOfCoins.add(coin50);
		bagOfCoins.add(coin10);
		
		findCoin(bagOfCoins, coin10);
		findCoin(bagOfCoins, coin100);
		displayBagDetails(bagOfCoins);
		displayBagContent(bagOfCoins);
		bagOfCoins.clear();
		displayBagContent(bagOfCoins);
	}
	
	public static void findCoin(HashSet<Coin> bag, Coin coin) {
		if(bag.contains(coin)) System.out.println("There is a coin" + coin.getDenomination() + " in the bag.");
		else System.out.println("There is no coin" + coin.getDenomination() + " in the bag.");
	}
	
	public static void displayBagDetails(HashSet<Coin> bagOfCoins) {
		if(bagOfCoins.isEmpty()) System.out.println("The bag is empty");
		else System.out.println("The bag has " + bagOfCoins.size() + " Coins");
	}
	
	public static void displayBagContent(HashSet<Coin> bagOfCoins) {
		for (Coin coin : bagOfCoins) {
			System.out.println(coin.getDenomination());
		}	
	}

}
