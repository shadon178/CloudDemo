package io.shadon.cloudservice.common.service.api.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author https://github.com/shadon178
 */
@Data
@Builder
public class CommonResponse<T> {

    private ResponseStatus status;

    private String message;

    private String error;

    private T data;

    public CommonResponse(ResponseStatus status, String message, String error, T data) {
        this.status = status;
        this.message = message;
        this.error = error;
        this.data = data;
    }

    public CommonResponse(T data) {
        this(ResponseStatus.SUCC, null, null, data);
    }

    public CommonResponse() {
        this(ResponseStatus.SUCC, null, null, null);
    }

}
