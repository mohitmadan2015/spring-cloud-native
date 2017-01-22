package com.payments.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Mohit on 1/22/2017.
 */
@Entity
public class WebhookEvent {

    @Id
    @GeneratedValue
    private long Id;

    private String eventName;

    private String callBackURL;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getCallBackURL() {
        return callBackURL;
    }

    public void setCallBackURL(String callBackURL) {
        this.callBackURL = callBackURL;
    }

    @Override
    public String toString() {
        return "WebhookEvent{" +
                "Id=" + Id +
                ", eventName='" + eventName + '\'' +
                ", callBackURL='" + callBackURL + '\'' +
                '}';
    }

}
