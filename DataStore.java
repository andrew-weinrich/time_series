import java.util.Date;
import java.lang.ArrayIndexOutOfBoundsException;

/*!
    This interface implements a time-series datastore.
    It could be disk-based, in-memory, distributed, etc.
    All these methods may throw exceptions if the requested
    value is not in the datastore.
*/
public interface DataStore {
    /*! Adds a sample to the datastore */
    void addSample(Sample sample);
    
    /*! Applies an aggregation function */
    int aggregate(AggregatorInterface aggregator);
    
    /*! Returns the nearest value to the requested time, rounded up */
    int getValue(Date time) throws ArrayIndexOutOfBoundsException;
    
    /*! Returns the value at the specific sample interval */
    int getValue(int sampleIndex) throws ArrayIndexOutOfBoundsException;
}