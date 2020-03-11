import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;


public class Login {
	private String Email;
	private String pasword;
	private PImage log;
	private PApplet app;
	private ControlP5 cp5;
	

	public  Login(String Email, String password, PApplet app) {
		this.Email=Email;
		this.pasword= password;
		this.app=app;
		this.cp5=new ControlP5(app);
		
		log=app.loadImage("images/login.png");
		cp5.addTextfield("email").setPosition(71,294).setSize(210,25).setColorValue(255);
		cp5.addTextfield("password").setPosition(71,354).setSize(210,25).setColorValue(255);
		
	}


	public void paint() {
		app.image(log,0,0,350,650);
		
	}
	
	public void hideInput(int display) {
		if(display!=0) {
			cp5.hide();
			System.out.println(display);
		}
		if(display==0) {
			cp5.show();
		}
	}
	

	

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
}
