package com.codecool.poster.model.key;

import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
public class ShareKey implements Serializable {

    private long postId;

    private long personId;
}
