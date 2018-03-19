package com.rich.services;

import com.rich.Metrics.MetricsTimer;
import com.rich.Metrics.TimeType;
import org.springframework.stereotype.Component;

@Component
public class TestService {
    @MetricsTimer ( timeTyper= TimeType.TowMinute)
    public void method(){
        System.out.println("测试服务类");
    }
}
