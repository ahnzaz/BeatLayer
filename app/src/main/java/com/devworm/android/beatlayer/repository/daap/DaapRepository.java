package com.devworm.android.beatlayer.repository.daap;

import com.devworm.android.beatlayer.beat.daap.DaapBeatEntity;
import com.devworm.android.beatlayer.repository.AbstractRepository;
import com.devworm.android.beatlayer.repository.RepositoryHandler;
import com.devworm.android.beatlayer.repository.RepositoryType;

/**
 * Created by SDS on 2015-09-04.
 */
public class DaapRepository extends AbstractRepository<DaapBeatEntity> {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public RepositoryType getType() {
        return null;
    }

    @Override
    public void load(RepositoryHandler handler) {

    }

    @Override
    public List<T> getBeatList() {
        return null;
    }
}
