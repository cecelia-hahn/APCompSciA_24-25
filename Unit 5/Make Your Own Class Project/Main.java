public class Main
{
	public static void main(String[] args) {
		Snowman fred = new Snowman(3, "hat");
		Snowman bill = new Snowman(2, "scarf");
		Snowman george = new Snowman(4, "gloves");
		
		fred.setSegments(5);
		System.out.println("Fred has "+fred.getSegments()+" segments.");
		
		bill.setAccessory("shoes");
		System.out.println("Bill's accessory is "+bill.getAccessory());
		
		george.melt();
		george.melt();
		System.out.println("George has melted " +george.getInchesMelted() + " inches.");
		
		System.out.println("---------------------------");
		System.out.println("Bill ");
		bill.printSegmentsWithThis();
		System.out.println("Bill's mouth is "+SnowMath.coalMouth(2)+" inches long.");
		System.out.println("Bill's nose is "+SnowMath.noseLength(9) + " inches long.");
		
		System.out.println("------------------------------");
		System.out.println("Fred ");
		fred.printSegmentsWithThis();
		System.out.println("Fred's mouth is "+SnowMath.coalMouth(3)+" inches long.");
		System.out.println("Fred's nose is "+SnowMath.noseLength(6) + " inches long.");
		
		System.out.println("-------------------------------");
		System.out.println("George ");
		george.printSegmentsWithThis();
		System.out.println("George's mouth is "+SnowMath.coalMouth(5)+" inches long.");
		System.out.println("George's nose is "+SnowMath.noseLength(4) + " inches long.");
	}
}
