import java.io.*;


public class Stopwatch
{

  public static void main(String[] args) throws IOException{

    Thread myThread = new Thread(){


    public void run()
    {
      try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter time in minutes: ");
      int n = Integer.parseInt(br.readLine());

      for(int i=0;i<n*60;i++)
      {
        System.out.printf("%d",i+1);
        Thread.sleep(1000);
      }
    }
    catch(Exception e)
    {}
    }
    };
    myThread.start();

  }

}
