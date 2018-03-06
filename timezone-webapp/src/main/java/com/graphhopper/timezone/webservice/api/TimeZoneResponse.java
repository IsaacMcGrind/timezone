package com.graphhopper.timezone.webservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;


import javax.validation.constraints.NotNull;

/**
 * Created by schroeder on 01/03/17.
 */
public class TimeZoneResponse {

    @NotNull
    private String timeZoneId;

    private String displayName;

    private LocalTime localTime;

    public TimeZoneResponse(String timeZoneId, LocalTime localTime, String displayName) {
        this.timeZoneId = timeZoneId;
        this.localTime = localTime;
        this.displayName = displayName;
    }

    @JsonProperty("timezone")
    public String getTimeZoneId() {
        return timeZoneId;
    }

    @JsonProperty("timezone_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("local_time")
    public LocalTime getLocalTime() {
        return localTime;
    }

    public String toString() {
        return timeZoneId + " (" + displayName + " : " + localTime.getOffsetString() + ")";
    }
}