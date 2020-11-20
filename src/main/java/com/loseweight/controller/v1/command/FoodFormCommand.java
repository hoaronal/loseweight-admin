package com.loseweight.controller.v1.command;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.File;

@Data
@Accessors(chain = true)
public class FoodFormCommand {
    @NotBlank
    private String name;

    private String description;

    private int total_like;

    private int calo;

    private String code;

    private String recommend_level;

    private int prepare_time;

    private int cooking_time;

    private String image;
}
