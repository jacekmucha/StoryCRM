package com.jmdev.storycrm.utils;

public class JSONFormatter {

    public static String useGSON(Object object){
        return new com.google.gson.Gson().toJson(object);
    }


    public static String useJackson(Object object) {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
