import java.util.Date;
import java.lang.ArrayIndexOutOfBoundsException;

/*! Performs an aggregation over a period of data in the database. Results may not be consistent.
    May throw a java.lang.ArrayIndexOutOfBoundsException if the start/end times are invalid. */
public interface AggregatorInterface {
    int computeAggregate(Date start, Date end) throws ArrayIndexOutOfBoundsException;
}