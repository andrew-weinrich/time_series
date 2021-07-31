import java.util.Date;
import java.lang.ArrayIndexOutOfBoundsException;

/*! Performs an aggregation over a period of data in the database. Results may not be consistent.
    May throw a java.lang.ArrayIndexOutOfBoundsException if the start/end times are invalid. */
public class AverageAggregator implements AggregatorInterface {
    public int computeAggregate(int startIndex, int endIndex) throws ArrayIndexOutOfBoundsException {
        int average = 0;
        
        Sample currentSample = null;
        
        
    }
}