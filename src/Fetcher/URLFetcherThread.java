package Fetcher;
import java.io.BufferedReader;
import java.net.URL;
public class URLFetcherThread implements Runnable {
    private String Name;
    public URLFetcherThread(String name){

        this.Name = name;
    }
    @Override
    public void run() {
        System.out.println("Fetching URL");

        String line=Thread.currentThread().getName();

        try{
            URL urlObject=new URL(Name);
            BufferedReader file = new BufferedReader(new java.io.InputStreamReader(urlObject.openStream()));
            String line1;
            while((line1 = file.readLine()) != null){
                System.out.println("Thread  " + "  " + line +" line from URL : "+line1);

            }
        } catch (java.net.MalformedURLException e) {
            System.err.println("Invalid URL: " + Name);
        } catch (java.io.IOException e) {
            System.err.println("Error reading URL: " + e.getMessage());
        }

    }
    public String getName(){
        return Name;
    }
}
 class main{
    public static void main(String[] args){
        System.out.println("Main thread continues processing........... ");
        URLFetcherThread urlFetcherThread = new URLFetcherThread("https://www.google.com/");
        URLFetcherThread urlFetcherThread1 = new URLFetcherThread("https://www.facebook.com/");
        Thread thread = new Thread(urlFetcherThread);
        Thread thread1 = new Thread(urlFetcherThread1);
        thread.start();
        thread.setName("FetcherThread-1");
       try{
           thread.join();
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }
        thread1.start();
       thread1.setName("FetcherThread-2");
       try{
           thread1.join();
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }
    }
}