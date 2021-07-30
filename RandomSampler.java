
import java.lang.Math;
import java.util.Date;


/*! A simple implementation of a Sampler that just returns a random number */
public class RandomSampler implements SamplerInterface {
    public Sample getSample() {
        Date currentTime = new Date();
        int value = (int)(Math.random());
        return new Sample(currentTime, value);
    }
}
