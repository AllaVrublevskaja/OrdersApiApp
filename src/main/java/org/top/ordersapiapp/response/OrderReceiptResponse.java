package org.top.ordersapiapp.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderReceiptResponse {
    private String description;
    private List<Receipt> products;
    private double summa;
}
