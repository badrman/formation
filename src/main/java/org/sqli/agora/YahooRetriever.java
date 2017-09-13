package org.sqli.agora;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {

    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(String zipcode) throws Exception {
        log.info( "Retrieving Weather Data" );
        String url = "https://api.apixu.com/v1/forecast.xml?key=f2072b206cc2466c851113054171209&q="
          +zipcode;
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }
}