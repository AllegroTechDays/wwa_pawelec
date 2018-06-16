package tech.allegro.pawelec.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class PlaceMapperTest {

    PlaceMapper mapper = new PlaceMapper();

    @Test
    public void getJSONForSearchingPlace() throws UnsupportedEncodingException {
        String expected = "";
        assertEquals(expected, mapper.getJSONForSearchingPlace("Pałac Kultury i Nauki"));
    }

    @Test
    public void mapJsonToPlaceDtos() {
    }
}