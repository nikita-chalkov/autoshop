package main.request;

import lombok.Value;

import java.sql.Date;

@Value
public class RequestPeriod {
    Date start;
    Date end;
}
