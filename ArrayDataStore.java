import java.util.Date;
import java.lang.ArrayIndexOutOfBoundsException;

/*!
    An in-memory datastore that uses an array as a ring buffer.
    If you are using a very large buffer, you may need to expand 
    the heap size when starting the JVM.
    Any aggregation will temporarily lock the array
    Currently in development!
*/
public class ArrayDataStore implements DataStore {
    private Sample[] samples;
    private int currentSampleIndex = 0;
    private final int = bufferSize;
    
    
    this.readSequence = 0;
        this.writeSequence = -1;
    
    
    
    Thread sampleThread = new Thread(){
         public void run(){
             
         }
     }
      
      
    /*!
        Creates a new data store with a buffer size, and a sampling frequency
    */
    public ArrayDataStore(int size, int secondsInterval) {
        this.samples = new Sample[size];
        this.bufferSize = bufferSize;
        
        this.readSequence = 0;
        this.writeSequence = -1;
    }
    
    
    
    
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