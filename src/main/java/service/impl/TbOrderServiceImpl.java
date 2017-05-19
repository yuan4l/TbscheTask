package service.impl;

import dao.TbOrderDao;
import dto.TbOrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.TbOrderService;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yuan4j on 2017/5/16.
 */
@Service
public class TbOrderServiceImpl implements TbOrderService {

    @Autowired
    private TbOrderDao tbOrderDao;

    public void insert() throws Exception {

        //дьЪ§Он
        for (int i = 1; i <= 8; i++) {
            TbOrderDto tbOrderDto = new TbOrderDto();

            StringBuilder date = new StringBuilder("2017051");
            String buildDate = String.valueOf(date.append(i));
            tbOrderDto.setBuildDate(buildDate);

            tbOrderDto.setSaleMoney(BigDecimal.valueOf(11.1));
            tbOrderDto.setAmount(BigDecimal.valueOf(10.00));
            tbOrderDto.setGoodsName("abc");
            tbOrderDto.setCustomer("wang");

            for (int j = 1; j <= 300; j++) {
                StringBuilder billnum = new StringBuilder("201705000");
                String bill = String.valueOf(billnum.append(j));
                tbOrderDto.setBillNumber(bill);
                tbOrderDao.insert(tbOrderDto);
            }
        }
    }

    public List<TbOrderDto> getTbOrderList(String buildDate) {

        TbOrderDto tbOrderDto = new TbOrderDto();
        tbOrderDto.setBuildDate(buildDate);

        List<TbOrderDto> orderDtoList = tbOrderDao.findList(tbOrderDto);
        return orderDtoList;
    }
}
