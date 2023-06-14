package com.cybage.databaseConnection;

import com.cybage.controller.BankServiceController;
import org.apache.coyote.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.zalando.logbook.Logbook;

import static org.apache.logging.log4j.LogManager.getLogger;
import static org.apache.logging.log4j.Logger.*;
import static org.zalando.logbook.Conditions.*;
import org.zalando.logbook.*;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Component

public class LogFormat{

    private String response;

    public LogFormat() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    private String request;



    //Logbook logbook = Logbook.create();
   String path = response;


    Logbook logbook = Logbook.builder()

            .pathFilter(new PathFilter() {
                @Override
                public String filter(String path) {
                    System.out.println(path);
                    return path;

                }
            }).build();







//    Logbook logbook = Logbook.builder()
//            .sink(new DefaultSink(
//                    new JsonHttpLogFormatter(),
//                    new Slf4jHttpLogWriter(LoggerFactory.getLogger("http.access"))
//            ))
//            .build();

}
