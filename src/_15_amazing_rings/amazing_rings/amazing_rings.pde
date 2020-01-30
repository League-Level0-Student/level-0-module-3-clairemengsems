
int speed = 10;
int x = 10;
int speed2 = 10;
int x2 = 490;
void setup() {
  
size(500,500);  

  
  
}

void draw() {

  

background(#ADFCFF);   
for (int i = 50; i > 0; i--) {
noFill();
ellipse(x,250,i*5,i*5);
}  

for (int i = 50; i > 0; i--) {
noFill();
ellipse(x2,250,i*5,i*5);
}  






if (x > width){
 speed = -speed;
}else if (x < 0){
 speed = -speed;
}
x += speed;




if (x2 > width){
 speed2 = -speed2;
}else if (x2 < 0){
 speed2 = -speed2;
}
x2 += speed2;

}  
  
  
  
  
  
  
  
  
