package com.nodey.parser.domain;

import com.nodey.ip.domain.Ip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parser {

    private List<Ip> parserIpList;
}
