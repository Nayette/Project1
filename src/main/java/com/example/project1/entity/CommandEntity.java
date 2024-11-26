package com.example.project1.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CommandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCommand;

    private Date dateCommand;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private PersonEntity person;

    public Long getIdCommand() {
        return idCommand;
    }

    public void setIdCommand(Long idCommand) {
        this.idCommand = idCommand;
    }

    public Date getDateCommand() {
        return dateCommand;
    }

    public void setDateCommand(Date dateCommand) {
        this.dateCommand = dateCommand;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
}
