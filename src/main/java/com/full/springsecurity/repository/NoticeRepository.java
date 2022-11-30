package com.full.springsecurity.repository;

import com.full.springsecurity.entity.Notices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<Notices, Long> {

    @Query(value = "from Notices n where create_date() as createdDate BETWEEN beg_date AND notice_end ",nativeQuery = true)
    List<Notices> findAllActiveNotices();
}
