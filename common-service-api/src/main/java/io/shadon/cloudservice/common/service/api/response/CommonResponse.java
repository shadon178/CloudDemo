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

}
