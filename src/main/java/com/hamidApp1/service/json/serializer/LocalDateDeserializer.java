package com.hamidApp1.service.json.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// deserializer is for the input comming from Json from front end
public class LocalDateDeserializer extends JsonDeserializer<LocalDate>{

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/mm/yyyy");

    @Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext desContext) throws IOException, JsonProcessingException {
        return LocalDate.parse(parser.getValueAsString(), FORMATTER);
    }
}
