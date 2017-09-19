
import java.io.IOException;

    import java.net.URL;

    import java.util.Scanner;



    /**

     * Retrieve contents from a URL and return them as a string.

     *

     * @param url url to retrieve contents from

     * @return the contents from the url as a string, or an empty string on error

     */
public class a {


    public static String urlToString(final String url) {

        Scanner urlScanner;

        try {

            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");

        } catch (IOException e) {

            return "";

        }

        String contents = urlScanner.useDelimiter("\\A").next();

        urlScanner.close();

        return contents;

    }

    public static void main(String[] args) {
      String website=a.urlToString("http://erdani.com/tdpl/hamlet.txt");
      int count=0;
      for(int a=0;a<website.length();a=a+1){
       if(website.charAt(a)==' '){
         count++;
       }
      }
      System.out.println(count);
      int countprince=0;
      for(int b=0;b<website.length()-6;b=b+1) {
       String w=website.substring(b,b+6);
       if(w.equals("prince")) {
         countprince++;
       }


      }
      System.out.println(countprince);
      }
    }

