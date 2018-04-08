package com.rich.services;

import com.rich.Metrics.MetricsTimer;
import com.rich.Metrics.TimeType;
import org.springframework.stereotype.Component;

@Component
public class TestService implements ITestService {
//    @MetricsTimer ( timeTyper= TimeType.TowMinute)
    @Override
    public void method(){
        System.out.println("+++++++++++++++++Test Service ++++++++++++++++++++++");
    }
}
