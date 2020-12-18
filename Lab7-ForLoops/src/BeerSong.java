public class BeerSong {
	public static void main(String[] args) {
		for(int counter=100; counter>=1; counter--){
			if (counter>1){
				if (counter>2){
					System.out.println(counter+" BOTTLES OF BEER ON THE WALL,\n"+counter+" BOTTLES OF BEER.\nTAKE ONE DOWN, PASS IT AROUND,\n"+(counter-1)+" BOTTLES OF BEER ON THE WALL.\n");
				}
				else{
					System.out.println(counter+" BOTTLES OF BEER ON THE WALL,\n"+counter+" BOTTLES OF BEER.\nTAKE ONE DOWN, PASS IT AROUND,\n1 BOTTLE OF BEER ON THE WALL.\n");
				}
				}else
			{
				System.out.println(counter+" BOTTLE OF BEER ON THE WALL,\n"+counter+" BOTTLE OF BEER.\nTAKE ONE DOWN, PASS IT AROUND,\nNO MORE BOTTLES OF BEER ON THE WALL.\n");
			}
		}
	}
}