package com.gib.group.cutaway.service;

import com.st.entity.Post;

public interface BotService {

    boolean sendPost(Post post, Long id);

    boolean editPost(Post post);

    boolean removePost(Long id);
}
