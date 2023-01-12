package com.catchmind.admin.model.entity;

import com.catchmind.admin.model.config.BaseEntityUpdate;
import lombok.*;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Review extends BaseEntityUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    private String revNick;
    private String revPhoto;
    private Integer revLike = 0;
    private String revContent;
    private Double revScore = 0.5;
//    private String resaBisName;

//    @ManyToOne
//    private Profile profile;      // ?
}
