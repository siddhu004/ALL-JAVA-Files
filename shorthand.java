import java.awt.*;
import java.awt.event.*;

class shorthand
{
    public static void main(String Arg[])
    {
        Frame fobj=new Frame("Marvellous");
        fobj.setSize(500,500);
        fobj.setVisible(true);

        Button bobj = new Button("ok");
        fobj.add(bobj);
        bobj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("button pressed");
            }
        });
    }
}