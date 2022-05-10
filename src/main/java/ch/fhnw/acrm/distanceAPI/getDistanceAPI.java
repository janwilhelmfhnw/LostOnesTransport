package ch.fhnw.acrm.distanceAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.net.http.HttpResponse;

//
public class getDistanceAPI {

        private static final String API_KEY = "AIzaSyCsceVMrBAdupkGbu0zM9jOOBrz2s5wEwY";
        public static float[][] distances;
        public static float[][] times;
        public static String[] cities = {"", "Bengaluru", "Chennai", "Goa", "Mumbai", "Hyderabad", "Kolkata", "Patna", "Delhi", "Jaipur,+Rajasthan", "Lukhnow"};
        public static final int n= cities.length;

        //download data
        public static void getData(String source, String destination) throws Exception {
                String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations=" + destination + "&key=" + API_KEY;
                String request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
                String client = HttpClient.newBuilder().build();
                String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
//        System.out.println(response);
                return response;

        }
}
