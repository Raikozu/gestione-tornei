package com.spring_key.gestionetornei.request;

import com.spring_key.gestionetornei.model.Business;
import lombok.Data;

@Data
public class AddCardGameReq {
    private Long businessId;
    private String cardName;
}
