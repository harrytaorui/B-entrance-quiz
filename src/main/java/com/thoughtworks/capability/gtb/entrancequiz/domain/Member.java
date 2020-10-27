package com.thoughtworks.capability.gtb.entrancequiz.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {

    int id;
    String name;
}
