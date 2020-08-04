package io.javafullstack.stockmarketapp.companydetailsservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.javafullstack.stockmarketapp.companydetailsservice.dao.entities.CompanyIPOEntity;


@Repository
public interface CompanyIPODetailsRepository extends JpaRepository<CompanyIPOEntity, Integer>{
}
