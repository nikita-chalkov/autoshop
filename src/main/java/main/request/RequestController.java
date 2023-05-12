package main.request;

import main.history.HistorySaleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RequestController {
    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @RequestMapping(value = {"/getRevenueForPeriod"},method = RequestMethod.POST)
    public ResponseEntity<ResponseRevenue> getRevenueForPeriod(@RequestBody RequestPeriod period){
        return ResponseEntity.ok(requestService.getRevenueForPeriod(period));
    }

    @RequestMapping(value = {"/getHistory"},method = RequestMethod.POST)
    public ResponseEntity<List<HistorySaleDTO>> getHistory(){
        return ResponseEntity.ok(requestService.getHistory());
    }

}

