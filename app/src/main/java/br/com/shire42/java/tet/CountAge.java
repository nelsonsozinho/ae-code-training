package br.com.shire42.java.tet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class CountAge {


    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URI uri = new URI("https://coderbyte.com/api/challenges/json/age-counting");
            URL url = uri.toURL();
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();

                String[] stringPlaces = stripeStringResponseToParts(inputStream);


                int countAge = 0;

                for (String chunk : stringPlaces) {
                    chunk = chunk.trim();
                    if (chunk.startsWith("age")) {
                        String[] value = chunk.split("=");
                        if (value.length == 2) {
                            String numberRepresentation = value[1].trim();

                            if(isNumber(numberRepresentation)) {
                                int age = Integer.parseInt(numberRepresentation);
                                if (age >= 50) {
                                    countAge++;
                                }
                            }


                        }
                    }
                }

                System.out.println(countAge);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe);
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }


    public static boolean isNumber(String str) {
        try {
           Integer.parseInt(str);
           return true;
        } catch(NumberFormatException ex) {
            return false;
        }
    }

    public static String[] stripeStringResponseToParts(InputStream stream) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder builder = new StringBuilder();

        String stringRecord;
        while((stringRecord = bufferReader.readLine()) != null) {
            builder.append(stringRecord);
        }
        return builder.toString().split(",");
    }
}



