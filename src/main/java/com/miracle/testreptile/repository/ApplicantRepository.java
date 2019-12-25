package com.miracle.testreptile.repository;

import com.miracle.testreptile.domain.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Miracle
 * @date 2019/12/24 14:04
 */

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
}
