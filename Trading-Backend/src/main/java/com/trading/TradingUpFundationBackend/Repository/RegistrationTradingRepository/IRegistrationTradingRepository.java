package com.trading.TradingUpFundationBackend.Repository.RegistrationTradingRepository;

import com.trading.TradingUpFundationBackend.Commons.Domains.Entity.UserTradingEntity.RegistrationTradingEntity.RegistrationTradingEntity;//Package to use the Entity "Registration"
import org.springframework.data.jpa.repository.JpaRepository;//Package to use the persistence in this interface
import org.springframework.stereotype.Repository;//Package to bring the element from spring "Repository"

@Repository//Annotation to represent this interface like a repository to connect with the database
public interface IRegistrationTradingRepository extends JpaRepository<RegistrationTradingEntity, Integer> {
}
