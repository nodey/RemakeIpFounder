package com.nodey.ip.dto.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IpDtoIn {

    @NotNull
    private Integer id;

    @NotNull
    private String ip;

    @NotNull
    private String port;
}
