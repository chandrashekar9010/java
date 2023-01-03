

import java.io.*;
public class copy   file demo
{
public static void main(string args[])
{
FileInputstream in=null;
FileOutputstream out=null;
}
try
{
in=newFileInputstream("input.txt");
Out=newFileOutputstream("output.txt");
int c;
while((c=in.read())!=1)
{
out.write(c);
}
}
catch(Exeception e)
{
System.out.println(e);
}
}