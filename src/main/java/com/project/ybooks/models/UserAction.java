package com.project.ybooks.models;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "UserActions")
public class UserAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String actionType;
    private String actionDescription;
    private LocalDateTime actionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public LocalDateTime getActionDate() {
        return actionDate;
    }

    public void setActionDate(LocalDateTime actionDate) {
        this.actionDate = actionDate;
    }
}
