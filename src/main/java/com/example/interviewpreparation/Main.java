package com.example.interviewpreparation;

import java.util.*;
import java.io.*;
import java.net.*;

class Main {  
  public static void main (String[] args) { 
    System.setProperty("http.agent", "Chrome");
    try { 
      URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
      try {
        
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder response = new StringBuilder();
        String responseLine;
        while((responseLine = reader.readLine()) != null) {
          response.append(responseLine);
        }
        reader.close();
        int countOfItems = numberOfIermsWithAge(response.toString(), 50);
        System.out.println(countOfItems);
      } catch(IOException e) {
        e.printStackTrace();
      }

    } catch (MalformedURLException malEx) {
      System.out.println(malEx);
    }
  }   

// assume the repsonse is a json object containg a data key
private static int numberOfIermsWithAge(String response, int ageLimit) {
  int count =0;
  Integer age = 0;
  String[] items = response.split(",");

  for (String item : items) {
    Map<String, String> itemInfo = parseItem(item);
    if (itemInfo.containsKey("age")){
      age = Integer.parseInt(itemInfo.get("age").replaceAll("[^0-9]",""));
      if (age >= ageLimit){
        count++;
      }
    }
  }
  return count;

}
// method to create a map for items in the response
private static Map<String, String> parseItem(String item) {

  Map<String, String> itemInfo = new HashMap<>();
  String[] keyValuePairs = item.split("&");
  for (String kvp: keyValuePairs){
    String[] parts = kvp.split("=");
    if (parts.length == 2) {
      itemInfo.put(parts[0].trim(), parts[1].trim());
    }
  }
  return itemInfo;
}

}
