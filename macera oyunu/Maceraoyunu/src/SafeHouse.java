
public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player,"Guvenli ev");
		
	}
public boolean getLocation() {
	
	player.setrHealty(player.getrHealty());
System.out.println("Iyilestiniz");
System.out.println("Suan guvenli evdesiniz");
System.out.println("Caniniz :"+ player.getrHealty());


return true;
}

}
