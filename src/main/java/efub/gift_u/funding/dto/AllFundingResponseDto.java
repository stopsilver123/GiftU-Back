package efub.gift_u.funding.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class AllFundingResponseDto {
    private List<IndividualFundingResponseDto> fundings;
}