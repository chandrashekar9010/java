Class custom exeception extends exeception
{
string msg;
custom exeception(string str)
{
msg=str;
public string to string()
{
return("custom msg is"+msg);
}
}
public class user exeception
{
public static void main(string arg[])
try
{
throw now (custom exeception)
("this is user exeception");
}
catch(custom exeception)
{
System.out.println(e);
}
}
}