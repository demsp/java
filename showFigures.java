import java.awt.*;

import javax.swing.*;
/* Класс, который будет рисовать элементы*/
class Canvas extends JComponent{
/*Метод, перерисовывающий элемент внутри окна
 *при обновлении*/
	int x;
    int y;
    int r;
	 //public Canvas(int xT,int yT) {
		 public Canvas() {
	        x = 90;
	        y = 90;
	//       x=xT;
	 //      y=yT;
	    }

	/////					///				//
  public void paintComponent(Graphics g){
	super.paintComponents(g);		
	Graphics2D g2d=(Graphics2D)g;
	//			//			//			//
	g2d.setPaint(Color.GREEN);
	g2d.drawRect(x, y, 80, 20);
	g.fillRect(21, 41, 20, 20);
	g2d.setColor(Color.blue);
	g2d.fillOval(200, 50, 50, 20);
	super.repaint();
  }	
}
//			/			/			/
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
	}
}
