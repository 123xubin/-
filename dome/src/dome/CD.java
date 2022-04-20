package dome;

public class CD extends Item{
	
	private String artist;
	private int numofTracks;
	
	
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title,playingTime,false,comment);
//		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", numofTracks=" + numofTracks + ", toString()=" + super.toString() + "]";
	}


	public static void main(String[] args) {
		CD cd =new CD("a","b",2,2,"...");
		CD cd1 =new CD("a","b",2,2,"...");
		System.out.println(cd.equals(cd1));
//		cd.print();
//		System.out.println(cd.toString());
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc=(CD)obj;
		return artist.equals(cc.artist);
	}

//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println("CD:"+title+":"+artist);
//	}

}
