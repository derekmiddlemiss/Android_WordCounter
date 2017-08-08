package codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by derekmiddlemiss on 08/08/2017.
 */

public class WordCounterTest {

    String sample;

    @Before
    public void before(){
        sample = "The rain in The Spain";
    }

    @Test
    public void testTextToHash(){
        HashMap< String, Integer > result = WordCounter.textToHash( sample );
        Integer expected = 2;
        assertEquals( expected, result.get( "The" ) );
    }

    @Test
    public void testHashToString(){
        HashMap< String, Integer > hash = WordCounter.textToHash( sample );
        String result = WordCounter.hashToString( hash );
        String expected = "'The': 2, 'rain': 1, 'in': 1, 'Spain': 1, ";
        assertEquals( expected, result );
    }

}
