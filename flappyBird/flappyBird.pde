int x = 300;
int y = 300;
double birdYVelocity = 0;
double gravity = 0.5;
int a = 400;
int b = 400;
int pipeXPosition = 0;
int pipeYPosition = 0;
int pipeXPosition2 = 0;
int pipeYPosition2 = 0;
void draw(){
  
  background(0,0,100);
  fill(0,100,0);
  ellipse(x,y,70,70);
  y+=(int)birdYVelocity;
  birdYVelocity += gravity;
  if (mousePressed){
    mousePressed();
  }
 fill(0,100,0);
 rect(pipeXPosition,pipeYPosition, 20,1000);
 pipeXPosition -= 3;
 if(pipeXPosition < 0){
   pipeXPosition = 800;
   pipeYPosition = (int) random(100, 400);
 }
 if(intersects(x,y,pipeXPosition, pipeYPosition, 1000)){
   System.exit(0);
 }
 fill(0,100,0);
 rect(pipeXPosition2,pipeYPosition2,20,1000);
 pipeXPosition2 -= 3;
  if(pipeXPosition2 < 0){
   pipeXPosition2 = 800;
   pipeYPosition2 = (int) random(100, 400);
 }
 pipeXPosition = pipeXPosition2;
 pipeYPosition = pipeYPosition2;
 pipeYPosition = pipeYPosition2 - (1000 + 230);
 
}
void setup(){
  size(800,800);
}
void mousePressed(){
  birdYVelocity -= 1;
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
return true;
else 
return false;
}

