void fooj(boolean led_f[3]);

int v=0;
boolean led_arr[]={LOW,HIGH,LOW};

void setup() {
  //for (int i = 0; i <=2 ; i = i + 1) {
  //pinMode(ledd[i],OUTPUT);
 //}
  fooj(led_arr);
}

void loop() {
   
   digitalWrite(0, led_arr[0]);   
  digitalWrite(1, led_arr[1]);    
  digitalWrite(2, led_arr[2]);     
 }

 void fooj(boolean led_f[3]){
  for (int i = 0; i <=2 ; i = i + 1) {
  pinMode(led_f[i],OUTPUT);
  }
}
