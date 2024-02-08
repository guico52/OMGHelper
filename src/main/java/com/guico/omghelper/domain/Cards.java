package com.guico.omghelper.domain;


import java.io.Serializable;
import lombok.Data;

/**
 *
 * @TableName cards
 */
@Data
public class Cards implements Serializable {

    private Long id;

    /**
     *
     */
    private String question;

    /**
     *
     */
    private String answer;
}
