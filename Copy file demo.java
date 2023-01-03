import java.io.*;
public class Copy file demo
{
FileInputstream in=null;
FileOutputstream out=null;
}
try
{
in=newFileInputstream("input.txt");
out=newFileOutputstream("out.txt");
int c;
while((c=in.read())!=-1);
{
out.write(c);
}
}
catch(Exeception e)
{
System.out.println(e);
}
}