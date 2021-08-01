import java.util.Date;

/*!
    This implementation gets the current Bitcoin value from CoinBase.
*/
public class CoinBaseSampler implements SamplerInterface {
    private static String defaultCoinBaseApiUrl = "https://api.coinbase.com/v2/prices/spot?currency=USD"
    
    private final String url;
    
    
    public CoinBaseSampler(String coinBbaseUrl) {
        if (coinBbaseUrl == null)
            url = defaultCoinBaseApiUrl;
        else
            url = 
    }
    
    
    public Sample getSample() {
        
    }
}