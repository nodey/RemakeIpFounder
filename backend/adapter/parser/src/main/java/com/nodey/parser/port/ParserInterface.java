package com.nodey.parser.port;

import com.nodey.ip.domain.Ip;

import java.util.List;

public interface ParserInterface {

    List<Ip> parseNewIps() throws Exception;
}
