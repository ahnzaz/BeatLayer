package com.devworm.android.beatlayer.repository.local;

import com.devworm.android.beatlayer.beat.local.LocalBeatEntity;
import com.devworm.android.beatlayer.repository.AbstractRepository;
import com.devworm.android.beatlayer.repository.RepositoryHandler;

/**
 * Created by SDS on 2015-09-04.
 */
public class LocalRepository extends AbstractRepository<LocalBeatEntity> {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void load(RepositoryHandler deliver) {

    }

    @Override
    public List<T> getBeatList() {
        return null;
    }
}
