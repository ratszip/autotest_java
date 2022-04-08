package pic.asser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class PicExist {
	public static boolean checkImgExist(String urlString){
	    URL url;
	    URLConnection urlConnection;
	    try {
	        url = new URL(urlString);
	        urlConnection =  url.openConnection();
	        int status =  ((HttpURLConnection) urlConnection).getResponseCode();
	        if(status==200){
	            return true;
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return false;
	}
}
