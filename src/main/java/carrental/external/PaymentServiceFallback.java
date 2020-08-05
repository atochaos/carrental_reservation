
package carrental.external;

public class PaymentServiceFallback implements PaymentService {

    @Override
    public void payment(Payment payment) {
        //do nothing if you want to forgive it

        System.out.println("!!! payment !!! : Circuit breaker has been opened. Fallback returned instead.");
    }

    @Override
    public void paymentCancellation(Payment payment) {
        //do nothing if you want to forgive it

        System.out.println("!!! paymentCancellation !!! : Circuit breaker has been opened. Fallback returned instead.");
    }
}
