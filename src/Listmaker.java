import java.util.ArrayList;
import java.util.Scanner;

public class Listmaker
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        final String menu = "A- add, D- delete, P-print, Q =Quit";
        boolean done = false;
        String cmd = "";

        do
        {
            displayList();
            cmd = SafeInput.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            switch(cmd)
            {
                case "A":
                    break;
                case "D":
                    break;
                case "P":
                    break;
                case "Q":
                    System.exit(0);
                    break;



            }
            System.out.println("cmd is " +cmd);
        }
        while(!done);
    }

    private static void displayList()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        if(list.size() !=0)
        {


            for(int i =0; i < list.size(); i++)
            {
                System.out.printf("%3d%35s", i+1, list.get(i) );
            }
        }
        else
            System.out.println("+++ List is empty +++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}


