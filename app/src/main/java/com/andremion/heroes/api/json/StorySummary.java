package com.andremion.heroes.api.json;

public class StorySummary {

    public String resourceURI;
    public String name;

    public long getId() {
        String id = Util.getLastPathSegment(resourceURI);
        try {
            return Long.parseLong(id);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
