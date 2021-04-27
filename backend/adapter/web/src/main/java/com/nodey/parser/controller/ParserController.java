package com.nodey.parser.controller;

import com.nodey.ip.domain.Ip;
import com.nodey.parser.port.in.ParserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/parser")
@RequiredArgsConstructor
public class ParserController {

    private final ParserUseCase useCase;

    @GetMapping
    public List<Ip> parseAllIp() throws Exception {
        return useCase.getParserIpList();
    }
}
