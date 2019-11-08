package com.eslearn.demo.escurd;

import com.eslearn.demo.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
}
