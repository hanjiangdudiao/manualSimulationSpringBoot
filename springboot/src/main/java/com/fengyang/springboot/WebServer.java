package com.fengyang.springboot;

import org.springframework.web.context.WebApplicationContext;

public interface WebServer {

    public void start(WebApplicationContext applicationContext);
}
