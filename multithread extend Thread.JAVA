class Multithead extend Thread
{
void run()
{
try
{
System.out.println("Thread id is"++Thread current Thread.get Id());
}
catch(exeception e)
{
System.out.println(e);
}
}
class multithread demo
{
public static void main(string args[]);
{
multithread obj=new multithread();
for(int i=0;i<2;i++)
{
obj.start();
}
}
}