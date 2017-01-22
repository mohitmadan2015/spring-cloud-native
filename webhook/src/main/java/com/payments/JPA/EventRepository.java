package com.payments.JPA;

import java.util.List;
import com.payments.model.WebhookEvent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;
/**
 * Created by Mohit on 1/22/2017.
 */
@RepositoryRestResource(collectionResourceRel = "WebhookEvent", path = "WebhookEvent")
public interface EventRepository extends PagingAndSortingRepository<WebhookEvent, Long> {

    List<WebhookEvent> findByEventName(@Param("eventName") String eventName);

}
