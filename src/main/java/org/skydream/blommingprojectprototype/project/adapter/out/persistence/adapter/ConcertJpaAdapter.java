package org.skydream.blommingprojectprototype.project.adapter.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.skydream.blommingprojectprototype.project.adapter.in.web.dto.ConcertWebDto;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.entity.ConcertJpaEntity;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.mapper.ConcertMapper;
import org.skydream.blommingprojectprototype.project.adapter.out.persistence.repository.ConcertSpringDataJpaRepository;
import org.skydream.blommingprojectprototype.project.application.port.out.ConcertPort;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ConcertJpaAdapter implements ConcertPort {

    private final ConcertMapper concertMapper;
    private final ConcertSpringDataJpaRepository concertJpaRepository;

    @Override
    public ConcertJpaEntity save(ConcertWebDto concertWebDto) {
        return concertJpaRepository.save(concertMapper.webDtoToJpaEntity(concertWebDto));
    }
}
