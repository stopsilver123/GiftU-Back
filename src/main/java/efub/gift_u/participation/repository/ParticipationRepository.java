package efub.gift_u.participation.repository;


import efub.gift_u.funding.domain.Funding;
import efub.gift_u.funding.domain.FundingStatus;
import efub.gift_u.participation.domain.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ParticipationRepository extends  JpaRepository<Participation , Long>{
   
    List<Participation> findByFunding(Funding funding);

    @Query("SELECT p.funding FROM Participation p WHERE p.user.id = :userId")
    List<Funding> findAllFundingByUserId(@Param("userId") Long userId);

    @Query("SELECT p.funding FROM Participation p WHERE p.user.id = :userId and p.funding.status = :status")
    List<Funding> findAllFundingByUserIdAndStatus(@Param("userId") Long userId, @Param("status") FundingStatus status);

}
