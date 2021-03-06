package com.seachangesimulations.scorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.seachangesimulations.scorp.domain.Phase;

/** JpaRepository - Allows generic versions of standard CRUD database ops to be used.
 * JpaSpecificationExecutor - Allows criteria searches.
 */
@Repository  // Spring Anno => class is a DAO
public interface PhaseRepository extends 
	JpaRepository<Phase, Long>, JpaSpecificationExecutor<Phase> {

}
