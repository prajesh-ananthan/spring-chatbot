/**
 * Created by Prajesh AV
 * Date: 2/6/2025
 */

package com.prajeshav.springchatbot.repository;

import com.prajeshav.springchatbot.entities.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Prajesh AV
 * Date: 2/6/2025
 */

@Repository
public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {

//    List<ChatMessage> findBySessionIdOrderByTimestampDesc(String sessionId);
//
//    @Query("SELECT c FROM ChatMessage c WHERE c.sessionId = :sessionId ORDER BY c.timestamp DESC LIMIT :limit")
//    List<ChatMessage> findRecentMessagesBySession(@Param("sessionId") String sessionId, @Param("limit") int limit);

}
