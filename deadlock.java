deadlock.demo.java
public class deadlock demo
{
public static void main (string args[])
{
final string r1="resource 1";
final string r2="resource 2";
//t1 tries to lock r1 and r2
thead t1=new thread()

{
public void run()
{
synchronized(r1)
{
System.out.println("t1 locks r1");
synchronized (r2)
{
System.out.println("t1 locks r2");
}
}
]
};
//t2 tries to lock r1 and r2
thread t2=new thread()
{
public void run()
{
synchronized(r1)
{
System.out.println("t2 locks r1");
synchronized(r2)
{
System.out.println("t2 locks r2");
}
}
}
};
t1.start();
t2.start();
}
9}