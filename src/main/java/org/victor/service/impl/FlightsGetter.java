package org.victor.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.victor.dao.FlightMapper;
import org.victor.model.Flight;
import org.victor.model.FlightExample;
import org.victor.service.FlightsListable;

import java.util.List;

@Service
public class FlightsGetter implements FlightsListable{
    private Logger log = Logger.getLogger(FlightsGetter.class);
    @Autowired
    private FlightMapper flightMapper;


    public List<Flight> getFlights() {
        return flightMapper.selectByExample(new FlightExample());
    }
}
