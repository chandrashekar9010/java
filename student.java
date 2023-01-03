import java.io.*;
class student implements java.io.serialise
{
string names
public static void main(string args[])
{
student s=new student();
s.name="mecs";
try
{
file input stream file out=new file input stream("s.txt");
object output stream out=new object output stream("file out");
out.write object(s);
out.close()
fileout.close();
System.out.println("file serialised");
}
catch("exeception e)
{
System.out.println(e);
}
}
}