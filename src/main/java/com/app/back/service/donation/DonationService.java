package com.app.back.service.donation;

import com.app.back.domain.donation.DonationDTO;
import com.app.back.domain.donation.DonationVO;
import com.app.back.domain.post.Pagination;

import java.util.List;
import java.util.Optional;

public interface DonationService {
    public void write(DonationDTO donationDTO);
    public Optional<DonationDTO> getById(Long id);
    public List<DonationDTO> getList(Pagination pagination);
    public int getTotal();
    public void update(DonationDTO donationDTO);
    public void delete(Long id);
}
