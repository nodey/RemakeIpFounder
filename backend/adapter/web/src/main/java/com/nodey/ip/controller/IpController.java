package com.nodey.ip.controller;

import com.nodey.ip.dto.out.IpDtoOut;
import com.nodey.ip.port.in.IpUseCase;
import com.nodey.ip.mapper.IpDtoMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ip")
@RequiredArgsConstructor
class IpController {

    private final IpUseCase useCase;
    private final IpDtoMapper mapper;

    @SneakyThrows
    @GetMapping
    public IpDtoOut getAccessIp(){
        return mapper.ipToIpDtoOut(useCase.getAccessIpList());
    }

}
