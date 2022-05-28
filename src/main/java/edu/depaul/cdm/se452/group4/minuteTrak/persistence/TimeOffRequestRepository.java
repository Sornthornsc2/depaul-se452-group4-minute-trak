package edu.depaul.cdm.se452.group4.minuteTrak.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.depaul.cdm.se452.group4.minuteTrak.model.EmployeeEntity;
import edu.depaul.cdm.se452.group4.minuteTrak.model.TimeOffRequestEntity;

@Repository
public interface TimeOffRequestRepository extends JpaRepository<TimeOffRequestEntity, Long> {

    public List<TimeOffRequestEntity> findAllByEmployee(EmployeeEntity employee);
}
