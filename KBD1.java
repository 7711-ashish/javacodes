import java.io.*;
class KBD1
{
    public static void main(String[] args)
    {
        InputStreamReader isr = null;
        BufferedReader br = null;
        try
        {
            isr= new InputStreamReader(System.in);
            br= new BufferedReader(isr);
        }
        catch(Exception e)
        {

        }
        String str ="";
        System.out.println("Enter Full Name :");
        try
        {
            str = br.readLine();
        }
        catch(Exception e)
        {

        }
        System.out.println("Name:"+str);
    }
}