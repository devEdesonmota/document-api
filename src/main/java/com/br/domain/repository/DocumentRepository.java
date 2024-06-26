package com.br.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.br.domain.model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long>{

}
