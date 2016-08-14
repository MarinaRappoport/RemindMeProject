package com.marina.remindme.dto;

/**
 * Created by Marina on 13.08.2016.
 */
public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
