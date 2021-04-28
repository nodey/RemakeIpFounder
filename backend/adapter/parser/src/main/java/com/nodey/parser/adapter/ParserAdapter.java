package com.nodey.parser.adapter;

import com.nodey.ip.domain.Ip;
import com.nodey.parser.port.ParserInterface;
import com.nodey.parser.port.out.ParserPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
class ParserAdapter implements ParserPort {

    private final ParserInterface parser;

    @Override
    public List<Ip> getIpsFromParser() throws Exception {
        return parser.parseNewIps();
    }
}
