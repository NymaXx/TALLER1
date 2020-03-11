import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class Payment {
	private String name;
	private long cardNumber;
	private int cardCode;
	private int cardDate;
	private PApplet app;
	private PImage pay;
	private ControlP5 cp5;

	public Payment(String name, long cardNumber, int cardCode, int cardDate, PApplet app) {
		this.name=name;
		this.cardNumber= cardNumber;
		this.cardCode= cardCode;
		this.cardDate= cardDate;
		this.app=app;
		this.pay= app.loadImage("images/pay.png");
		this.cp5=new ControlP5(app);
		
		cp5.addTextfield("Nombre").setPosition(63,135).setSize(220,32).setColorValue(255);
		cp5.addTextfield("NumeroDeTarjeta").setPosition(63,201).setSize(220,32).setColorValue(255);
		cp5.addTextfield("FechaDeVencimiento").setPosition(63,262).setSize(220,32).setColorValue(255);
		cp5.addTextfield("CVC").setPosition(63,327).setSize(220,32).setColorValue(255);
		cp5.addTextfield("Pais/Provincia").setPosition(63,390).setSize(220,32).setColorValue(255);
		cp5.addTextfield("Direccion").setPosition(63,452).setSize(220,32).setColorValue(255);
	}
	public void paint() {
		app.image(pay,0,0,350,650);
	}
	
	public void hideInput(int display) {
		if(display!=9) {
			cp5.hide();
		}
		if(display==9) {
			cp5.show();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCardCode() {
		return cardCode;
	}

	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}

	public int getCardDate() {
		return cardDate;
	}

	public void setCardDate(int cardDate) {
		this.cardDate = cardDate;
	}
	
}
