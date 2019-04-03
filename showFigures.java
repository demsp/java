import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Random;
/* Класс, который будет рисовать элементы*/
class Canvas extends JComponent{

	int x;
    int y;
    int r;
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }    
    public Canvas() {
        x = 200;
        y = 10;
        r = 10;
    }
	 public Canvas(int xT,int yT, int rT) {
		   x=xT;
	       y=yT;
	       r=rT;
	    }

//	//	//	//	//	//
   /*Метод, перерисовывающий элемент внутри окна
     *при обновлении*/
  public void paintComponent(Graphics g){
	super.paintComponents(g);		
	Graphics2D g2d=(Graphics2D)g;
//	//	//	//
	g2d.setPaint(Color.GREEN);
	g2d.drawRect(200, 200, 80, 20);
	g.fillRect(21, 41, 20, 20);
	g2d.setColor(Color.blue);
	g2d.fillOval(x, y, r, r);
	super.repaint();
  }	
}
//	//	//	//	//
public class showFigures {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Задание заголовка окна*/
		JFrame w=new JFrame("Окно с изображением");
		/*Задание размеров окна*/
		w.setSize(400, 400);
	/* 	Если у окна не будет функции закрытия, 
	 *	при нажатии крестика окно не закроется.*/
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/*	Менеджер определяет
	 *  каким образом в окне расположены объекты.*/
		w.setLayout(new BorderLayout(1,1));
		//		/		/		/		/
		Canvas canv=new Canvas();
		w.add(canv);		
        w.setVisible(true);
        canv.printCircle();//////
        final Canvas canv1=new Canvas(0,50,20);
		w.add(canv1);		
        w.setVisible(true);
        Random rand = new Random();
		System.out.println(rand.nextInt(10));
      //						//					//
       
       java.util.Timer timer2 = new java.util.Timer();
        TimerTask task = new TimerTask() {
          public void run()
          {
        	  canv1.x=100;
        	  System.out.println("x = " ); //Do work!
          }
        };
       
        timer2.schedule( task, 2000 );
        
		
		int delay = 100;
		//JFrame().setVisible(true);
		 ActionListener tmp = new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
		System.out.println("1");
		int i = 0;
		i++;
		//System.out.println(evt);
		}
		};

		Timer t = new Timer(delay, tmp);
		t.setInitialDelay(1000);
		t.start();
		
		System.out.println("123"); 
    
       //					//					//
	}
}
