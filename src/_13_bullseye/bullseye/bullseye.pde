void setup(){
size(600,600);
    }

    void draw(){

for (int i = 10; i > 0; i--) {

if (i % 2 == 0) {
fill(#DB4242);     
 }else{
fill(#050505);     
 }
ellipse(300,300,i*50,i*50);
}
    }
                            
