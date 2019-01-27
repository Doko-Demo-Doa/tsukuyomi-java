package com.clipsub.tsukuyomi.repositories;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID>, JpaSpecificationExecutor<T> {
    List<T> findByRecordStatus(String recordStatus);

    T findByIdAndRecordStatus(Long id, String recordStatus);
}
