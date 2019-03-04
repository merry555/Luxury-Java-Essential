package Example;
//main()을 가진 Song클래스를 작성하라.
//Song 클래스는 노래 제목 title 필드, 생성자, getTitle()메소드로 구성된다
public class _01 {
	public static void main(String[] args) {
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("강남스타일");
		System.out.println("내 노래는 "+mySong.getTitle());
		System.out.println("너 노래는 "+yourSong.getTitle());
	}
}

class Song {
	String title;
	
	public Song (String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return title;
	}
}
