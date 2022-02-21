package collections;

import javax.lang.model.element.NestingKind;

public class AB2 {
	
	String song;
	String singer;
	String movie;
	
	
	AB2(){}
	
	AB2(String song,String singer,String movie)
	{
		this.song = song;
		this.singer = singer;
		this.movie = movie;
	}
	
	public String toString() {
		
		return "Song is "+song+" Singer Is "+singer+" Form Movie "+movie;
		
	}

}
