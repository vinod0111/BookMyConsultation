package com.bookmyconsultation.appointmentservice.service;

import java.io.IOException;

public interface KafkaService {

    public void produceMessage(String topicName, String key, String value) throws IOException;

}
