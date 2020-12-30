import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Shape extends JFrame implements ActionListener

{

JButton b1,b2,b3,b4,b5,b6;

JLabel l1;

int op;

int x1,y1,x2,y2;

Shape()

{

   l1=new JLabel("");

   b1=new JButton ("Circle");

   b2=new JButton("Rectangle");

   b3=new JButton("Line");

   b4=new JButton("Diagonal");

   b5=new JButton("Ellipse");

   b6=new JButton("Parabola");

  l1.setBounds(50,10,200,40);

   b1.setBounds(50, 50, 100, 50);

   b2.setBounds(150, 50, 100, 50); 

  b3.setBounds(250, 50, 100, 50);

   b4.setBounds(350, 50, 100, 50);

   b5.setBounds(50, 150, 100, 50);

      b6.setBounds(150,150, 100, 50);

 

   b1.addActionListener(this);

  b2.addActionListener(this);

  b3.addActionListener(this);

b4.addActionListener(this);

  b5.addActionListener(this);

  b6.addActionListener(this);

   setSize(500,500);

   this.setLocation(100, 100);

   setLayout(null);

   this.add(b1);

  this.add(b2);

   this.add(b3);

   this.add(b4);

   this.add(b5);

   this.add(b6);

   this.add(l1);

   setVisible(true);

  this.setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

   public void actionPerformed(ActionEvent e)

   {

   if(e.getActionCommand().equals("Circle"))

   {

      Circle c=new Circle(this);

      }

   else if(e.getActionCommand().equals("Rectangle"))

   {

    Rec r=new Rec(this);

     }

    else if(e.getActionCommand().equals("Line"))

{

    Line l=new Line(this);

  

   }

   else if(e.getActionCommand().equals("Ellipse"))

   {

    Ellipse el=new Ellipse(this);

     }

                else if(e.getActionCommand().equals("Parabola"))

   {

      Parabola Pb=new Parabola(this);

     }

                

   else

   {

   diagonal d=new diagonal(this);

   }

   }

    public static void main(String[] args)

{

   new Shape();

   }

}

 

class Rec extends JFrame implements ActionListener

{

Container c;

JLabel l,b,cc;

JSpinner s1,s2;

SpinnerModel v1,v2;

JButton f;

 

 

JComboBox p;

Rec(Shape s)

{

c=getContentPane();

f=new JButton("Draw");

l=new JLabel("SELECT LENGTH OF RECTANGLE");

b=new JLabel("SELECT BREADTH OF RECTANGLE");

cc=new JLabel("COLOR");

String clr[]={"RED","YELLOW","BLUE","ORANGE","PINK","CYAN","MAGENTA","BLACK","WHITE"};

v1=new SpinnerNumberModel(100,50,400,10);

v2=new SpinnerNumberModel(100,50,400,10);

s1=new JSpinner(v1);

s2=new JSpinner(v2);

p= new JComboBox<String>(clr);

l.setBounds(25,25,300,50);

s1.setBounds(300,25,100,50);

b.setBounds(25,75,300,50);

s2.setBounds(300,75,100,50);

f.setBounds(250,150,100,50);

cc.setBounds(450,100,50,50);

p.setBounds(550,100,100,50);

   f.addActionListener(this);

  

c.add(l);

c.add(s1);

c.add(b);

c.add(s2);

c.add(f);

c.add(p);

c.add(cc);

setSize(800,800);

setLayout(null);

setVisible(true);

}

 

public void actionPerformed(ActionEvent e)

   {

   if(e.getActionCommand().equals("Draw"))

   {

      int len=(Integer)s1.getValue();

int br=(Integer)s2.getValue();

      Graphics g=getGraphics();

        

        setVisible(true);

             

       String Valuee = (String)p.getSelectedItem();

                 switch(Valuee)

                 {

                              case "RED": g.setColor(Color.RED);break;

                              case "YELLOW": g.setColor(Color.YELLOW);break;

                              case "BLUE":  g.setColor(Color.BLUE);break;

                              case "ORANGE":g.setColor(Color.ORANGE);break;

                              case "PINK": g.setColor(Color.PINK);break;

                              case "CYAN": g.setColor(Color.CYAN);break;

                              case "MAGENTA": g.setColor(Color.MAGENTA);break;

                              case "BLACK": g.setColor(Color.BLACK);break;

                           case "WHITE": g.setColor(Color.WHITE);break; 

                 }

                          

                

                 

       g.fillRect(250,400,br,len);

    }

}

}

class Line extends JFrame implements ActionListener

{

Container c;

JLabel l,cc;

JSpinner spinner;

SpinnerModel value;

JButton f;

JComboBox p;

Line(Shape s)

{

c=getContentPane();

f=new JButton("Draw");

l=new JLabel("SELECT LENGTH OF LINE");

cc=new JLabel("COLOR");

String clr[]={"RED","YELLOW","BLUE","ORANGE","PINK","CYAN","MAGENTA","BLACK","WHITE"};

value=new SpinnerNumberModel(100,50,400,10);

spinner=new JSpinner(value);

p= new JComboBox<String>(clr);

l.setBounds(50,50,300,50);

spinner.setBounds(300,50,100,50);

cc.setBounds(450,100,50,50);

p.setBounds(550,100,100,50);

f.setBounds(250,100,100,50);

   f.addActionListener(this);

c.add(l);

c.add(spinner);

c.add(f);

c.add(p);

c.add(cc);

setSize(800,800);

setLayout(null);

setVisible(true);

 

}

public void actionPerformed(ActionEvent e)

   {

   if(e.getActionCommand().equals("Draw"))

   {

      int li=(Integer)spinner.getValue();

      Graphics g=getGraphics();

        

        setVisible(true);
        
       String Valuee = (String)p.getSelectedItem();

                 switch(Valuee)

                 {

                              case "RED": g.setColor(Color.RED);break;

                              case "YELLOW": g.setColor(Color.YELLOW);break;

                              case "BLUE":  g.setColor(Color.BLUE);break;

                              case "ORANGE":g.setColor(Color.ORANGE);break;

                              case "PINK": g.setColor(Color.PINK);break;

                              case "CYAN": g.setColor(Color.CYAN);break;

                              case "MAGENTA": g.setColor(Color.MAGENTA);break;

                              case "BLACK": g.setColor(Color.BLACK);break;

                           case "WHITE": g.setColor(Color.WHITE);break; 

                 }
      

     g.drawLine(200,250, 200+li, 250);

    }

}

}

  class Circle extends JFrame implements ActionListener

{

Container c;

JLabel l,cc;

JSpinner spinner;

JComboBox p;

SpinnerModel value;

JButton f;

Circle(Shape s)

{

c=getContentPane();

f=new JButton("Draw");

l=new JLabel("SELECT RADIUS OF CIRCLE");

cc=new JLabel("COLOR");

String clr[]={"RED","YELLOW","BLUE","ORANGE","PINK","CYAN","MAGENTA","BLACK","WHITE"};

value=new SpinnerNumberModel(100,50,400,10);

spinner=new JSpinner(value);

p= new JComboBox<String>(clr);

l.setBounds(50,50,300,50);

spinner.setBounds(300,50,100,50);

cc.setBounds(450,100,50,50);

p.setBounds(550,100,100,50);

f.setBounds(250,100,100,50);

   f.addActionListener(this);

c.add(l);

c.add(spinner);

c.add(f);


c.add(p);

c.add(cc);

setSize(800,800);

setLayout(null);

setVisible(true);

 

}

public void actionPerformed(ActionEvent e)

   {

   if(e.getActionCommand().equals("Draw"))

   {

      int r=(Integer)spinner.getValue();

      Graphics g=getGraphics();

        

        setVisible(true);
 String Valuee = (String)p.getSelectedItem();

                 switch(Valuee)

                 {

                              case "RED": g.setColor(Color.RED);break;

                              case "YELLOW": g.setColor(Color.YELLOW);break;

                              case "BLUE":  g.setColor(Color.BLUE);break;

                              case "ORANGE":g.setColor(Color.ORANGE);break;

                              case "PINK": g.setColor(Color.PINK);break;

                              case "CYAN": g.setColor(Color.CYAN);break;

                              case "MAGENTA": g.setColor(Color.MAGENTA);break;

                              case "BLACK": g.setColor(Color.BLACK);break;

                           case "WHITE": g.setColor(Color.WHITE);break; 

                 }

  g.fillOval(250,250,r,r);

    }

}

}

class diagonal extends JFrame implements ActionListener

 

{

 

Container c;

 

JLabel l,b,cc;

 

JSpinner s1,s2;

JComboBox p;

 

SpinnerModel v1,v2;

 

JButton f;

 

diagonal(Shape s)

 

{

 

c=getContentPane();

 

f=new JButton("Draw");

 

l=new JLabel("SELECT LENGTH OF RECTANGLE");

 

b=new JLabel("SELECT BREADTH OF RECTANGLE");
cc=new JLabel("COLOR");

String clr[]={"RED","YELLOW","BLUE","ORANGE","PINK","CYAN","MAGENTA","BLACK","WHITE"};

 

v1=new SpinnerNumberModel(100,50,400,10);

 

v2=new SpinnerNumberModel(100,50,400,10);

 

s1=new JSpinner(v1);

 

s2=new JSpinner(v2);

p= new JComboBox<String>(clr);

 

 

l.setBounds(25,25,300,50);

 

s1.setBounds(300,25,100,50);

 

b.setBounds(25,75,300,50);

 

s2.setBounds(300,75,100,50);

 

f.setBounds(250,150,100,50);

 

   f.addActionListener(this);

cc.setBounds(450,100,50,50);

p.setBounds(550,100,100,50);

 

c.add(l);

 

c.add(s1);

 

c.add(b);

 

c.add(s2);

c.add(p);

c.add(cc);
 

c.add(f);

 

setSize(800,800);

 

setLayout(null);

 

setVisible(true);

 

 

}

 

public void actionPerformed(ActionEvent e)

 

   {

 

   if(e.getActionCommand().equals("Draw"))

 

   {

 

      int len=(Integer)s1.getValue();

 

                int br=(Integer)s2.getValue();

 

      Graphics g=getGraphics();

 

      

 

        setVisible(true);
 String Valuee = (String)p.getSelectedItem();

                 switch(Valuee)

                 {

                              case "RED": g.setColor(Color.RED);break;

                              case "YELLOW": g.setColor(Color.YELLOW);break;

                              case "BLUE":  g.setColor(Color.BLUE);break;

                              case "ORANGE":g.setColor(Color.ORANGE);break;

                              case "PINK": g.setColor(Color.PINK);break;

                              case "CYAN": g.setColor(Color.CYAN);break;

                              case "MAGENTA": g.setColor(Color.MAGENTA);break;

                              case "BLACK": g.setColor(Color.BLACK);break;

                           case "WHITE": g.setColor(Color.WHITE);break; 

                 }



 

       g.drawRect(250,400,br,len);

 

  g.drawLine(250,400, 250+br, 400+len);

  g.drawLine(250+br,400, 250, 400+len);

 

    }

 

}

 

}

class Ellipse extends JFrame implements ActionListener

{

Container c;

JLabel l,b,cc;
JComboBox p;
JSpinner s1,s2;

SpinnerModel v1,v2;

JButton f;

Ellipse(Shape s)

{

c=getContentPane();

f=new JButton("Draw");

l=new JLabel("SELECT Minor Axis OF Ellipse");

b=new JLabel("SELECT Major Axis OF Ellipse");
cc=new JLabel("COLOR");

String clr[]={"RED","YELLOW","BLUE","ORANGE","PINK","CYAN","MAGENTA","BLACK","WHITE"};


v1=new SpinnerNumberModel(100,50,400,10);

v2=new SpinnerNumberModel(100,50,400,10);

s1=new JSpinner(v1);

s2=new JSpinner(v2);

 p= new JComboBox<String>(clr);

l.setBounds(25,25,300,50);

s1.setBounds(300,25,100,50);

b.setBounds(25,75,300,50);

s2.setBounds(300,75,100,50);
cc.setBounds(450,100,50,50);

p.setBounds(550,100,100,50);


f.setBounds(250,150,100,50);

   f.addActionListener(this);

c.add(l);

c.add(s1);

c.add(b);

c.add(s2);
c.add(p);

c.add(cc);

c.add(f);

setSize(800,800);

setLayout(null);

setVisible(true);

 

}

public void actionPerformed(ActionEvent e)

   {

   if(e.getActionCommand().equals("Draw"))

   {

      int len=(Integer)s1.getValue();

int br=(Integer)s2.getValue();

      Graphics g=getGraphics();

        

        setVisible(true);
String Valuee = (String)p.getSelectedItem();

                 switch(Valuee)

                 {

                              case "RED": g.setColor(Color.RED);break;

                              case "YELLOW": g.setColor(Color.YELLOW);break;

                              case "BLUE":  g.setColor(Color.BLUE);break;

                              case "ORANGE":g.setColor(Color.ORANGE);break;

                              case "PINK": g.setColor(Color.PINK);break;

                              case "CYAN": g.setColor(Color.CYAN);break;

                              case "MAGENTA": g.setColor(Color.MAGENTA);break;

                              case "BLACK": g.setColor(Color.BLACK);break;

                           case "WHITE": g.setColor(Color.WHITE);break; 

                 }


       g.fillOval(250,400,br,len);

    }

}

 

}

class Parabola extends JFrame implements ActionListener

{

Container c;

JLabel l,cc;
JComboBox p;

JSpinner spinner;

SpinnerModel value;

JButton f;

Parabola(Shape s)

{

c=getContentPane();

f=new JButton("Draw");

l=new JLabel("SELECT a");
cc=new JLabel("COLOR");

String clr[]={"RED","YELLOW","BLUE","ORANGE","PINK","CYAN","MAGENTA","BLACK","WHITE"};
value=new SpinnerNumberModel(100,50,400,10);

spinner=new JSpinner(value);

l.setBounds(50,50,300,50);

spinner.setBounds(300,50,100,50);

f.setBounds(250,100,100,50);

   f.addActionListener(this);
 p= new JComboBox<String>(clr);

c.add(l);

c.add(spinner);
c.add(f);
cc.setBounds(450,100,50,50);
p.setBounds(550,100,100,50);
c.add(p);
c.add(cc);
setSize(1400,1400);
setLayout(null);
setVisible(true);
}

public void actionPerformed(ActionEvent e)

   {

   if(e.getActionCommand().equals("Draw"))

   {

      int li=(Integer)spinner.getValue();

      Graphics g=getGraphics();

         int x,y,x1,x2;

        setVisible(true);

      String Valuee = (String)p.getSelectedItem();

                 switch(Valuee)

                 {

                              case "RED": g.setColor(Color.RED);break;

                              case "YELLOW": g.setColor(Color.YELLOW);break;

                              case "BLUE":  g.setColor(Color.BLUE);break;

                              case "ORANGE":g.setColor(Color.ORANGE);break;

                              case "PINK": g.setColor(Color.PINK);break;

                              case "CYAN": g.setColor(Color.CYAN);break;

                              case "MAGENTA": g.setColor(Color.MAGENTA);break;

                              case "BLACK": g.setColor(Color.BLACK);break;

                           case "WHITE": g.setColor(Color.WHITE);break; 

                 }



                 for(y=700;y>=250;y--)

                 {

                           x=((int)Math.sqrt(4*li*(700-y)));

        x1=700-x;

        x2=700+x;             

        g.drawLine(x1,y,x1,y);

        g.drawLine(x2,y,x2,y);     

                 }

   

    }

}

}
