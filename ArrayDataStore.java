import java.util.Date;
import java.lang.ArrayIndexOutOfBoundsException;

/*!
    An in-memory datastore that uses an array as a ring buffer.
    Any aggregation will temporarily lock the array
    Currently in development!
*/
public class ArrayDataStore implements DataStore {
    private Sample[] samples;
    private int currentSampleIndex = 0;
    
    private boolean currentlyAggregating = false;
    
    
    public void addSample(Sample sample) {
        
    }
    
    public int aggregate(AggregatorInterface aggregator) {
        return 0;
    }
    
    public int getValue(int sampleIndex) throws ArrayIndexOutOfBoundsException {
        return 0;
    }
}