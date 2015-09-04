package com.devworm.android.beatlayer.repository;

import com.devworm.android.beatlayer.beat.BeatEntity;

/**
 * Created by SDS on 2015-09-03.
 */
public interface Repository<T extends BeatEntity> {
    public String getName();
    public String getType();
    public void load(RepositoryHandler deliver);
    public List<T> getBeatList();
}
