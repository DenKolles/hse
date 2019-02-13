package com.example.demo.Models;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Act extends AbstractRequest{

    public Act(long id, String title, Date dateFrom, Date dateTo, Date dateLastUpdate) {
        super(id, title, dateFrom, dateTo, dateLastUpdate);
    }

    public Act() {
        super();
    }

    @Override
    public String toString() {
        return String.format("Act{}",this.id );
    }

}
