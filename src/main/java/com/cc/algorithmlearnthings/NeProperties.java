package com.cc.algorithmlearnthings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author chencheng
 * @date 2019/3/31
 */
@Component
public class NeProperties {

    @Value("${com.cc.title}")
    private String title;

    @Value("${com.cc.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
