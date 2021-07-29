
import java.util.Date;

/*! This class represent a single timestamped value in a data stream */
public class Sample {
    
    private final int value;
    private final Date time;
    
    public Sample(Date time, int value) {
        this.value = value;
        this.time = time;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public Date getTime() {
        return this.time;
    }
}