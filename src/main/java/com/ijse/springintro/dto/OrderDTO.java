package com.ijse.springintro.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private List<Long> productIds;
}
