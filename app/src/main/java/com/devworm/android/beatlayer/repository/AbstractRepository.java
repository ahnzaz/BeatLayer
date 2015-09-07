package com.devworm.android.beatlayer.repository;

import com.devworm.android.beatlayer.beat.BeatEntity;

/**
 * Created by SDS on 2015-09-04.
 */
public abstract class AbstractRepository<T extends BeatEntity> implements Repository<T>{

    protected List<T> beatList;
}
