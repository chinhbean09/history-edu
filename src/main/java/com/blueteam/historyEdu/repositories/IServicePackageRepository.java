package com.blueteam.historyEdu.repositories;

import com.blueteam.historyEdu.entities.ServicePackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IServicePackageRepository extends JpaRepository<ServicePackage, Long> {


}
