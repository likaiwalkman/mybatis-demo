package org.victor.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.victor.model.Flight;
import org.victor.service.FlightsListable;

import java.util.List;

@Controller
@RequestMapping("/flights")
public class Flights {
    private Logger log = Logger.getLogger(Flights.class);
    private FlightsListable flightsListable;

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public List<Flight> flights() {
        log.info("enter into controller");
        return flightsListable.getFlights();
    }
}
