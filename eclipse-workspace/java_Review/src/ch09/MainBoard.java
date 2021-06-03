package ch09;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel adv = new AdvancedLevel();
		player.upgradeLevel(adv);
		player.play(2);
		
		SuperLevel sup = new SuperLevel();
		player.upgradeLevel(sup);
		player.play(3);

	}

}
