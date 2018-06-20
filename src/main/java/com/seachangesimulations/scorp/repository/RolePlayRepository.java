package com.seachangesimulations.scorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.seachangesimulations.scorp.domain.RolePlay;

/** JpaRepository - Allows generic versions of standard CRUD database ops to be used.
 * JpaSpecificationExecutor - Allows criteria searches.
 */
@Repository  // Class is a DAO (Spring Anno)
public interface RolePlayRepository extends 
	JpaRepository<RolePlay, Long>, JpaSpecificationExecutor<RolePlay> {

}
