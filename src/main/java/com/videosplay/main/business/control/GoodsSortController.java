package com.videosplay.main.business.control;

import com.videosplay.main.business.model.GoodsSort;
import com.videosplay.main.business.model.GoodsSortList;
import com.videosplay.main.test.business.ResonseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path="/api")
public class GoodsSortController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @CrossOrigin
    @PostMapping("/goodssort")
    public ResonseData<List<GoodsSortList>> getGoodsSortInfos(){

        ResonseData<List<GoodsSortList>> resonseData = new ResonseData<List<GoodsSortList>>();
        try {
            List<GoodsSortList> goodsSort= new ArrayList<GoodsSortList>();
            RowMapper<GoodsSort> personMapper = new BeanPropertyRowMapper<GoodsSort>(GoodsSort.class);
            List<GoodsSort> allInfos = jdbcTemplate.query("select * from goods_sort", personMapper);


            List<GoodsSort> parentSort = allInfos.stream().filter(item-> (item.getSortParentType() == 0)).collect(Collectors.<GoodsSort>toList());
            List<GoodsSort> itemSort = allInfos.stream().filter(item-> (item.getSortParentType() != 0)).collect(Collectors.<GoodsSort>toList());

            for (GoodsSort item : parentSort) {
                GoodsSortList listData = new GoodsSortList(item);
                listData.setItems(itemSort.stream().filter(a-> (a.getSortParentType() == item.getSortType())).collect(Collectors.<GoodsSort>toList()));
                goodsSort.add(listData);
            }

            resonseData.setData(goodsSort);
            resonseData.setCode(200);
            resonseData.setMessage("success");
        }catch (Exception e){
            resonseData.setData(new ArrayList<>());
            resonseData.setCode(400);
            resonseData.setMessage("error");
        }
        return  resonseData;
    }
}