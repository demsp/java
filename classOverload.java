public class Main {
	public static void main (String args[]) {
	 Foo foo1 = new Foo();	
	 Foo foo2 = new Foo(11);
	 foo1.displayInfo();
	 foo2.displayInfo();
	 int result1 = foo1.bar();
	 int result2 = foo2.bar();
	 int result3 = foo1.bar1(200);
	 int result4 = foo2.bar1(200);
	 System.out.println(result1);
	 System.out.println(result2);
	 System.out.println(result3);
	 System.out.println(result4);
	 System.out.println("Hello world!");
	 System.out.println(foo1);		
	 System.out.println(foo2);	
	}
}

class Foo {
   int x;
Foo() {
    x = 10;
  }
  Foo(int _x) {
    x = _x;
  }
  int bar() {
    return x + 100;
  }
 int bar1(int y) {
  return x + y; 
  }
void displayInfo(){
        //System.out.printf("x: %s \ty: %d\n", x, y);
        System.out.println(x);
   }
}
