package net.hydrogen2oxygen.se;

import java.util.HashMap;
import java.util.Map;

public class Environment {

    private String name;
    private Map<String, String> data = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
