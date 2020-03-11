import processing.core.PApplet;
import processing.core.PImage;

public class Record {
	private int date;
	
	private long price;
	private PApplet app;
	private PImage rec;

	public Record(int date, long price, PApplet app) {
		this. date= date;
	
		this.price=price;
		this.app=app;
		this.rec = app.loadImage("images/historial.png");
	}
	
	public void paint() {
		app.image(rec,0,0,350,650);
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	
}
