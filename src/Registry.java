import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PImage;

public class Registry {
	private String name;
	private String lastName;
	private String email;
	private String password;
	private String confirmation;
	private PApplet app;
	private PImage regist;
	private ControlP5 cp5;
	

	public Registry(String name, String lastName, String email, String password, String confirmation, PApplet app) {
		this.name=name;
		this.lastName= lastName;
		this.email=email;
		this.password=password;
		this.confirmation= confirmation;
		this.app=app;
		regist= app.loadImage("images/register.png");
		this.cp5=new ControlP5(app);
		cp5.addTextfield("Nombre").setPosition(63,135).setSize(220,32).setColorValue(255);
		cp5.addTextfield("Apellido").setPosition(63,201).setSize(220,32).setColorValue(255);
		cp5.addTextfield("Emmail").setPosition(63,262).setSize(220,32).setColorValue(255);
		cp5.addTextfield("Contrasena").setPosition(63,327).setSize(220,32).setColorValue(255);
		cp5.addTextfield("Confirmar").setPosition(63,390).setSize(220,32).setColorValue(255);
		
		cp5.get(Textfield.class,"Nombre").getText();
	}
	
	
	public void paint() {
		app.image(regist,0,0,350,650);
	}
	

	
	public void hideInput(int display) {
		if(display!=1) {
			cp5.hide();
		}
		if(display==1) {
			cp5.show();
		}
	}
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	
}
