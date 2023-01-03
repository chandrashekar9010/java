import java.awt.*;
import java.awt.event.*;
Class MouseListenerdemo extends Frame implements MouseListener
{
Label 1;
MouseListenerdemo()
{
add MouseListener(this);
l=new Label();
l.setBound(20.50,100,20);
add(l);
set size(300,300);
set layout(null);
set visible(true);
}
public void MouseClicked(MouseEvent e)
{
l.set text("Mouse clicked");
}
public void MouseEntered(MouseEvent e)
{
l.set text("Mouse entered");
}
public void MousePressed(MouseEvene)
{
l.set text("Mouse pressed");
}
public void MouseReleased(MouseEvent)
{
l.set text("Mouse released");
public static void main(string args[])
{
new MouseListener();
}
}