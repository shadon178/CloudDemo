package io.shadon.cloudservice.common.service.api.response;

import lombok.Getter;

/**
 * @author https://github.com/shadon178
 */
@Getter
public enum ResponseStatus {

    SUCC(0),

    FAIL(1);

    private int value;

    ResponseStatus(int value) {
        this.value = value;
    }

}
