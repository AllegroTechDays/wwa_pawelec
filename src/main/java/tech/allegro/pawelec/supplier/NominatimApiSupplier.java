package tech.allegro.pawelec.supplier;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class NominatimApiSupplier {
    public final static String getPlaceSearchResults = "https://nominatim.openstreetmap.org/search/";
    public final static String getJsonFormat = "?format=json";
    public final static String getAddressDetails = "&addressdetails=1";
    public final static String limitResultsToOne = "&limit=1";

    public String getURLWithQuery(String place) throws UnsupportedEncodingException {
        String encodedPlace = URLEncoder.encode(place, "UTF-8");
        StringBuffer buffer = new StringBuffer(getPlaceSearchResults);
        buffer.append(encodedPlace).append(getJsonFormat).append(getAddressDetails).append(limitResultsToOne);
        return buffer.toString();
    }

}
