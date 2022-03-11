package com.northdata.schema.adapter;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, OffsetDateTime> {

    @Override
    public OffsetDateTime unmarshal(String v) throws Exception {
        return OffsetDateTime.parse(v.trim(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }

    @Override
    public String marshal(OffsetDateTime v) throws Exception {
        if (v != null) {
            return v.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } else {
            return null;
        }
    }
}
