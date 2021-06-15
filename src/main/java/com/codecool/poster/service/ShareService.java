package com.codecool.poster.service;

import com.codecool.poster.model.Share;
import com.codecool.poster.model.key.ShareKey;
import com.codecool.poster.repository.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class ShareService {

    @Autowired
    private ShareRepository shareRepository;

    public void saveShare(long personId, long postId) { shareRepository.save(new Share(postId, personId, LocalDateTime.now())); }

    public void deleteShare(long personId, long postId) { shareRepository.deleteById(new ShareKey(postId, personId)); }

    public Collection<Share> findAllByPersonIdIn(Collection<Long> postIds) { return shareRepository.findAllByPostIdIn(postIds); }
}
