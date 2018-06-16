package tech.allegro.pawelec.supplier;

import lombok.extern.java.Log;
import tech.allegro.pawelec.InvalidUrl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Log
public class NominatimApiSupplier {
    public final static String getPlaceSearchResults = "https://nominatim.openstreetmap.org/search/";
    public final static String getJsonFormat = "?format=json";
    public final static String getAddressDetails = "&addressdetails=0";
    public final static String limitResultsToOne = "&limit=1";

    public String getURLWithQuery(String place) {
        String encodedPlace = getEncodeUrl(place);
        StringBuffer buffer = new StringBuffer(getPlaceSearchResults);
        buffer
                .append(encodedPlace)
                .append(getJsonFormat)
                .append(getAddressDetails)
                .append(limitResultsToOne);
        return buffer.toString();
    }

    private String getEncodeUrl(String place) {
        try {
            return URLEncoder.encode(place, "UTF-8");
        }  catch (UnsupportedEncodingException e) {
            throw new InvalidUrl("Invalid url");
        }
    }

}
