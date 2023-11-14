package edu.wgu.d387_sample_code.rest;

import edu.wgu.d387_sample_code.TimeZoneHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resources")
@CrossOrigin
public class TimeZoneController {

    @RequestMapping("timezone")
    public List<String> timeZ(){
        TimeZoneHandler timeZoneHandler = new TimeZoneHandler();
        return TimeZoneHandler.getTimeZoneHandler();
    }




}
