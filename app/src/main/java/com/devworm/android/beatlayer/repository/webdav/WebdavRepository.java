package com.devworm.android.beatlayer.repository.webdav;

import com.devworm.android.beatlayer.beat.webdav.WebdavBeatEntity;
import com.devworm.android.beatlayer.repository.AbstractRepository;
import com.devworm.android.beatlayer.repository.RepositoryHandler;

/**
 * Created by SDS on 2015-09-04.
 */
public class WebdavRepository extends AbstractRepository<WebdavBeatEntity> {
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
