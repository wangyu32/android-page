package cn.yhq.page.sample;

import cn.yhq.page.sample.entity.AlbumInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Yanghuiqiang on 2016/10/12.
 */

public interface API {

    @GET("search-ajaxsearch-searchall")
    Call<AlbumInfo> getAlbumInfo(@Query("kw") String keyword, @Query("pz") int pageSize, @Query("pi") int pageIndex);

}
