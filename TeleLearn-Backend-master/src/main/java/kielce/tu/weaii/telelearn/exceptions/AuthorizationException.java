package kielce.tu.weaii.telelearn.exceptions;

import lombok.Getter;

@Getter
public class AuthorizationException extends RuntimeException {
    private final Long userId;
    private final Long resourceId;
    private final String resourceName;

    public AuthorizationException(String resourceName, Long userId, Long resourceId) {
        super(String.format("The user does not have rights to this resource - %s", resourceName));
        this.userId = userId;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
    }
}
