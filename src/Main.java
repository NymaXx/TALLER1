import processing.core.PApplet;

import processing.core.PImage;
import java.util.ArrayList;

import controlP5.*;

public class Main extends PApplet {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	private ControlP5 cp5;
	int screen;
	Login login;
	Registry registry;
	Record record;
	Payment pay;
	ArrayList <User> listUsers;
	PImage i1, i2, i3,i4,i5,i6,i7,i8;
	
	
	
		public void settings() {
			size(350,650);
			
			
		}
		
		public void setup() {
			cp5 = new ControlP5(this);
			login = new Login(null, null,this);
			registry = new Registry(null, null,null,null,null,this);
			record = new Record(0, 02, this);
			pay = new Payment(null, 0,0,0, this);
			
			screen=0;
			i1 = loadImage("images/home.png");
			i2 = loadImage("images/compare.png");
			i3 = loadImage("images/menu.png");
			i4 = loadImage("images/car1.png");
			i5 = loadImage("images/car2.png");
			i6 = loadImage("images/car3.png");
			i7  = loadImage("images/mod.png");
			i8 = loadImage("images/about.png");
			
			
			listUsers = new ArrayList<User>();
			
			}
		
			
		
		
		
		
		
		
		public void draw() {
			background(0);
		
			
			switch(screen) {
			
			case 0: //login
				login.paint();
				
			
				
				break;
				
			case 1: //registro
				registry.paint();
				
				break;
				
			case 2: //home
				image(i1,-17,0,367,650);
				break;
				
			case 3: //menu hamburguesa
				image(i3,0,0,350,650);
				break;
			
			case 4: //historial
				record.paint();
				break;
				
			case 5: // carro1
				image(i4,0,0,350,650);
				break;
				
			case 6: //carro 2
				image(i5,0,0,350,650);
				break;
				
			case 7: //carro 3
			image(i6,-17,0,390,650);
				break;
				
			case 8: //comparar
				image(i2,0,0,350,650);
				break;
				
			case 9: //pagar
				pay.paint();
				break;
				
			case 10: //modal de pago
				pay.paint();
				image(i7,0,170,350,350);
				break;
				
			case 11: //about tesla
				image(i8,0,0,350,650);
				break;
			}
			
			
			fill(0);
			text(""+ mouseX , mouseX, mouseY);
			text(""+ mouseY , mouseX + 25, mouseY);
			hide();
		}
		
		
		
		
		
		public void mousePressed() {
			

			switch(screen) {
			case 0: //login
				if(mouseX >= 142 && mouseX <= 201 && mouseY >= 438 && mouseY <= 
				510) { //&& cp5.get(Textfield.class,"email").getText().contains("paula")) {
						screen =2;
				}
				
				if(mouseX >= 128 && mouseX <= 216 && mouseY >= 532 && mouseY <= 
				550) {
					screen= 1;
				}
				
				break;
				
			case 1: //registro
				if(mouseX >= 145 && mouseX <= 201 && mouseY >= 465 && mouseY <= 
				531) {
					screen= 0;
				}
				break;
				
			case 2: //home
				if(mouseX >= 23 && mouseX <= 274 && mouseY >= 74 && mouseY <= 274) {
					screen= 5 ;
				}
				
				if(mouseX >= 82 && mouseX <= 330 && mouseY >= 268 && mouseY <= 414) {
					screen = 6;
				}
				
				if(mouseX >= 23 && mouseX <= 274 && mouseY >= 462 && mouseY <= 635) {
					screen = 7;
				}
				
				if(mouseX >= 10 && mouseX <=67 && mouseY >= 0 && mouseY <= 64) {
					screen= 3;
				}
				
				break;
				
			case 3: //menu hamburguesa
				if(mouseX >= 0 && mouseX <=282 && mouseY >= 183 && mouseY <= 228) {
					screen= 2;
				}
				
				if(mouseX >= 0 && mouseX <=282 && mouseY >= 228 && mouseY <=273) {
					screen= 9;
				}
				
				if(mouseX >= 0 && mouseX <=282 && mouseY >=273 && mouseY <= 320) {
					screen= 4;
				}
				
				if(mouseX >= 0 && mouseX <=282 && mouseY >= 320 && mouseY <= 367) {
					screen= 11;
				}
				
				if(mouseX >= 0 && mouseX <=282 && mouseY >=368 && mouseY <= 411) {
					screen= 0;
				}
				
				if(mouseX >= 283&& mouseX <=350 && mouseY >=0 && mouseY <= 650) {
					screen= 2;
				}
				break;
			
			case 4: //historial
				if(mouseX >= 0 && mouseX <=53 && mouseY >=0 && mouseY <= 64) {
					screen= 3;
				}
				
				break;
				
			case 5: // carro1
				if(mouseX >= 10 && mouseX <=67 && mouseY >= 0 && mouseY <= 64) {
					screen= 3;
				}
				
				if(mouseX >= 37 && mouseX <=101 && mouseY >= 454 && mouseY <= 521) {
					screen = 8 ;
				}
				
				if(mouseX >= 249 && mouseX <=310 && mouseY >= 454 && mouseY <= 521) {
					screen= 9 ;
				}
				
				if(mouseX >= 144 && mouseX <=203 && mouseY >= 553 && mouseY <= 620) {
					screen= 2;
				}
				break;
				
			case 6: //carro 2
				if(mouseX >= 0 && mouseX <=53 && mouseY >=0 && mouseY <= 64) {
					screen= 3;
				}
				
				if(mouseX >= 250 && mouseX <=311 && mouseY >=475 && mouseY <= 544) {
					screen= 9;
				}
				
				if(mouseX >= 146 && mouseX <=206 && mouseY >=550 && mouseY <= 618) {
					screen= 2;
				}
				break;
				
			case 7: //carro 3
				if(mouseX >= 0 && mouseX <=53 && mouseY >=0 && mouseY <= 64) {
					screen= 3;
				}
				
				if(mouseX >= 241 && mouseX <=295 && mouseY >=454 && mouseY <= 523) {
					screen= 9;
				}
				
				if(mouseX >= 143 && mouseX <=201 && mouseY >=550 && mouseY <= 616) {
					screen= 2;
				}
				break;
				
			case 8: //comparar
				if(mouseX >= 0 && mouseX <=53 && mouseY >=0 && mouseY <= 64) {
					screen= 3;
				}
				
				if(mouseX >= 150 && mouseX <=211 && mouseY >=566 && mouseY <= 633) {
					screen= 5;
				}
				
				break;
				
			case 9: //pagar
				if(mouseX >= 0 && mouseX <=53 && mouseY >=0 && mouseY <= 64) {
					screen= 3;
				}
				
				if(mouseX >= 143 && mouseX <=201 && mouseY >=552 && mouseY <= 619) {
					screen= 10;
				}
				
				break;
				
			case 10: //modal de pago
				if(mouseX >= 146 && mouseX <=205 && mouseY >=391 && mouseY <= 467) {
					screen= 4;
				}
				
				break;
				
			case 11: //about tesla
				if(mouseX >= 0 && mouseX <=53 && mouseY >=0 && mouseY <= 64) {
					screen= 3;
				}
				
				if(mouseX >= 145 && mouseX <=206 && mouseY >=548 && mouseY <= 617) {
					screen= 2;
				}
				break;
			}
		}
		
		public void hide() {
			login.hideInput(screen);
			registry.hideInput(screen);
			pay.hideInput(screen);
		}
	
		
}
