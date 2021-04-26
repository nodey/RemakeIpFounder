package com.nodey.ip.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ip {

    private Integer id;

    private String ip;

    private String port;
}
