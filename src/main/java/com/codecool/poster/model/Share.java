package com.codecool.poster.model;

import com.codecool.poster.model.key.ShareKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IdClass(ShareKey.class)
public class Share {

    @Id
    private long postId;

    @Id
    private long personId;

    private LocalDateTime shareDate;
}
