package com.nodey.parser.dto.in;

import com.nodey.ip.domain.Ip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParserDtoIn {

    @NotNull
    private List<Ip> parserIpList;
}
