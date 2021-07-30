/*!
    This interface implements a value that flucatuates over time.
    Stock prices, EKG readings, etc.

*/
public interface SamplerInterface {
    /*! returns the current value of whichever datasource it is sampling */
    Sample getSample();
}