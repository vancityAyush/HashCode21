import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

class Street
{
    int start,end,time;
    String name;
}
class City
{
    int simulationTime,intersections,streets,cars,carScore;
    Cars cArs;
    ArrayList<Street> sTreet;
}
class Cars
{
    int cardinality;
    String[] path;
    Cars(int c)
    {
        cardinality=c;
        path=new String[c];
    }
    void path(String[] x)
    {
        for(int i=1,j=0;i<cardinality;i++,j++)
            path[i]=x[j];
    }
}

public class input extends City {
    BufferedReader fr;
    String path="";

    ArrayList<String> tokens(String a)//converts a line with multiple numbers to a int array[]
    {

        int i, n = 1;
        char c;
        ArrayList<String> ar = new ArrayList<>();
        Scanner sc = new Scanner(a);
        for (i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            if (c == ' ')
                n++;
        }
        for (i = 0; i < n; i++)
            ar.add(sc.next());
        return ar;
    }
    void firstLine(ArrayList<String> ex)
    {
        simulationTime=Integer.parseInt(ex.get(0));
        intersections=Integer.parseInt(ex.get(1));
        streets=Integer.parseInt(ex.get(2));
        cars=Integer.parseInt(ex.get(3));
        carScore=Integer.parseInt(ex.get(4));
    }
    Street streets(ArrayList<String> ex)
    {
        Street t=new Street();
        t.start=Integer.parseInt(ex.get(0));
        t.end=Integer.parseInt(ex.get(1));
        t.name=ex.get(2);
        t.time=Integer.parseInt(ex.get(3));
        return t;
    }
    void makeEntry()
    {
        String tmp;
        Cars tep;
        ArrayList<String> cartmp;
        try
        {
            firstLine(tokens(fr.readLine()));
            for(int i=0;i<streets;i++)
                sTreet.add(streets(tokens(fr.readLine())));
            for(int i=0;i<streets;i++) {
                tep=new Cars(cars);
                cartmp=tke(tokens(fr.readLine()));
                cArs=tep.path();
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    void loadFile() //to load the file.
    {
        try {
            fr = new BufferedReader(new FileReader(new File(path.getFile())));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("File not found !");
        }

    }



}

