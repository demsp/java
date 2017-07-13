int ledd[]={0,1,2};
void setup() {
  for (int i = 0; i <=2 ; i = i + 1) {
  pinMode(ledd[i],OUTPUT);
}
}

void loop() {
   for (int i = 0; i <=2 ; i = i + 1) {
   digitalWrite(ledd[i], HIGH);   
   delay(1000);
   }
   for (int i = 0; i <=2 ; i = i + 1) {
   digitalWrite(ledd[i], LOW);   
   delay(1000);
   }
 }
