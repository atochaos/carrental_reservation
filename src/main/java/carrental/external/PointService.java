
package carrental.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="point", url="http://point:8080")
//@FeignClient(name="point", url="http://localhost:8086", fallback = PointServiceFallback.class)
public interface PointService {

    @RequestMapping(method= RequestMethod.POST, path="/points")
    public void pointUpdate(@RequestBody Point point);

}