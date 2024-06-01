package org.kevin.dto;

import lombok.*;

@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class WebResponse<T> {
    private int status;
    private String message;
    private T data;
}