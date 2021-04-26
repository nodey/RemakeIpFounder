package com.nodey.ip.mapper;

import com.nodey.ip.dto.in.IpDtoIn;
import com.nodey.ip.dto.out.IpDtoOut;
import com.nodey.ip.domain.Ip;
import org.mapstruct.Mapper;

@Mapper
public interface IpDtoMapper {

    Ip ipDtoInToIp(IpDtoIn ipDtoIn);

    IpDtoOut ipToIpDtoOut(Ip ips);
}
