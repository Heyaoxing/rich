package com.rich.Metrics;

import java.lang.annotation.*;

@Target ({ElementType.METHOD,ElementType.PARAMETER})
@Retention ( RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MetricsTimer {
    TimeType timeTyper() default TimeType.OneMinute;
}
