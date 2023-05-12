package main.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseRevenue {
    public ResponseRevenue(Long revenue) {
        this.revenue = revenue;
    }

    private Long revenue;
}
