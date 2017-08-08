package codeclan.wordcounter;

import java.util.HashMap;

/**
 * Created by derekmiddlemiss on 08/08/2017.
 */

public abstract class WordCounter {

    public static HashMap< String, Integer > textToHash( String text ){

        String[] words = text.split(" ");
        HashMap< String, Integer > results = new HashMap<>();

        for (String word : words ){

            word = word.toLowerCase();

            if ( results.get( word ) == null ){

                results.put( word, 1);

            } else {

                results.put( word, results.get( word ) + 1 );

            }
        }

        return results;
    }

    public static String hashToString( HashMap< String, Integer > hash ){

        String resultString = "";

        for ( String key : hash.keySet() ){
            resultString += "'" + key + "': " + hash.get( key ).toString() + ", ";
        }

        return resultString;
    }



}
