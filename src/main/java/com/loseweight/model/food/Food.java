package com.loseweight.model.food;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(
        name = "lw_food",
        indexes = @Index(
                name = "id",
                columnList = "name"
        )
)
public class Food {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int calo;

    private String description;

    private int total_like;

    private String recommend_level;

    private String code;

    private int prepare_time;

    private int cooking_time;

    private String image;
}
