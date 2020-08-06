
package carrental.external;

public class PointServiceFallback implements PointService {

    @Override
    public void pointUpdate(Point point) {
        //do nothing if you want to forgive it

        System.out.println("!!! point !!! : Circuit breaker has been opened. Fallback returned instead.");
    }


}
