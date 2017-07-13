void fooj(boolean led_f[3],int vvv_f);

int vvv=0;
boolean led_arr[]={HIGH,HIGH,HIGH};

void setup() {
   Serial.begin(9600);
  //for (int i = 0; i <=2 ; i = i + 1) {
  //pinMode(ledd[i],OUTPUT);
 //}
  fooj(led_arr,vvv);
}

void loop() {
   
   digitalWrite(0, led_arr[0]);   
  digitalWrite(1, led_arr[1]);    
  digitalWrite(2, led_arr[2]);     
 }

 void fooj(boolean led_f[3],int vvv_f){
 // Serial.print(vvv_f);
  //for (int i = 0; i <=2 ; i = i + 1) {
  //pinMode(led_f[i],OUTPUT);  }

  if (vvv_f<=2){
    pinMode(led_f[vvv_f],OUTPUT);
    Serial.print(vvv_f);
    vvv_f=vvv_f+1;
    fooj(led_f,vvv_f);
    }

}
