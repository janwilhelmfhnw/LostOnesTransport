package ch.fhnw.acrm.distanceAPI;


import java.net.URI;
import java.net.http.*;
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

        //download data
        public static void getData(String source, String destination) throws Exception {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(java.net.URI.create("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations=" + destination + "&key=" + API_KEY))
                        .build();
                client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                        .thenApply(HttpResponse::body)
                        .thenAccept(System.out::println);

                System.out.println(client.send(request, HttpResponse.BodyHandlers.ofString()).body());

        }

        public static void main(String[] args) {

                String source = "Banglore";
                String destination = "NewDehli";

                try {
                        getData(source, destination);
                } catch (Exception e) {
                        e.printStackTrace();
                }



        }
}
