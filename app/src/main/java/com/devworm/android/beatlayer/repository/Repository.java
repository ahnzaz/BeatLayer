package com.devworm.android.beatlayer.repository;

import com.devworm.android.beatlayer.beat.BeatEntity;

import java.util.List;

/**
 * Created by SDS on 2015-09-03.
 */
public interface Repository<T extends BeatEntity> {
    public String getName();
    public RepositoryType getType();
    public void load(RepositoryHandler handler);
    public List<T> getBeatList();
}
