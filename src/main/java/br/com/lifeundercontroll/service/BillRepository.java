package br.com.lifeundercontroll.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lifeundercontroll.entity.BillEntity;

@Repository
public interface BillRepository extends CrudRepository<BillEntity, Long> {

}
