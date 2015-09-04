package com.devworm.android.beatlayer.repository;

import com.devworm.android.beatlayer.beat.BeatEntity;

/**
 * Created by SDS on 2015-09-04.
 */
public interface RepositoryHandler {
    public void onLoadStart();
    public void onLoading(BeatEntity beat);
    public void onLoaded(List<BeatEntity> beatList);
}