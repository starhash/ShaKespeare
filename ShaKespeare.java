import java.io.*;
import java.util.*;
public class ShaKespeare
{
    public static boolean isUpperCase(String s)
    {
        char[] c=s.toCharArray();
        for(char k:c) if(k < 'A'||k>'Z') return false;
        return true;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("AYLI.txt"));
        FileWriter fw = new FileWriter("AYLInew.txt");
        String temp,text="";
        ArrayList<String> lines = new ArrayList<String>();
        while((temp=br.readLine())!=null)
        {
            lines.add(temp);
        }
        for(int i=0;i<lines.size();i++)
        {
           double d = Math.random();
           if(isUpperCase(lines.get(i))&&d>0.95&&!lines.get(i).contains("ACT"))
           {
               int j = i+1;
               while(j<lines.size()&&!isUpperCase(lines.get(j)))
               {
                   lines.remove(j);
               }
               lines.add(i+1,"K BRO!"+System.lineSeparator());
           }
        }
        for(String s:lines) fw.append(s+System.lineSeparator());
        fw.close();
    }
}