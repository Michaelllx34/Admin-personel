package com.catchmind.admin.model.config;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass()         // 괄호 없어야?
@EntityListeners(AuditingEntityListener.class)
public class BaseEntityUpdate {
    @CreatedDate
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime updateDate;
}

