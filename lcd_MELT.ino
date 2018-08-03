// Подключаем стандартную библиотеку LiquidCrystal
#include <LiquidCrystal.h>
 
// Инициализируем объект-экран, передаём использованные 
// для подключения контакты на Arduino в порядке:
// RS(A0), E, DB4, DB5, DB6, DB7
//  5,     7,  11,  10,  9,   8
//  6(R/W) - Ground
LiquidCrystal lcd(2, 3, 4, 5, 6, 7); 
void setup() 
{
   // устанавливаем размер (количество столбцов и строк) экрана
   lcd.begin(8,2);
 // печатаем первую строку
 //lcd.setCursor(0, 0);
 //lcd.print("Hello wo");
 //lcd.setCursor(0, 1);
 //lcd.print("rd");
}
 
void loop() 
{

lcd.setCursor(0, 0);
//выводим число прошедших секунд с момента запуска программы
lcd.print(millis() / 1000);
}
