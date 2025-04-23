package com.spring_key.gestionetornei.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
@Data
public class AddFormatReq {
    private Long cardgameId;
    private String name;
}
