package com.infosys.openhack.piedpiper.iotdataproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by aditya.khajuria on 2/13/2018.
 */
@Data
@AllArgsConstructor
public class Event {

    private String eventId;
    private String eventDt;
}
