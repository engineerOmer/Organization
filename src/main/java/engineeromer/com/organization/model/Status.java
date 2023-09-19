package engineeromer.com.organization.model;

import lombok.Getter;

@Getter
public enum Status {

    ACTIVE(false), PENDING(false), DEACTIVATED(false),
    INVITED(false), PASSIVE(false), DELETED(false),REJECTED(false),ACCEPTED(false);


    private final boolean isActive;
    Status(boolean isActive) {
        this.isActive = isActive;
    }
}
