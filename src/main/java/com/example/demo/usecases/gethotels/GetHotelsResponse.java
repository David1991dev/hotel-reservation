package com.example.demo.usecases.gethotels;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class GetHotelsResponse {

    Map<String,List<Long>> hotels;

}
