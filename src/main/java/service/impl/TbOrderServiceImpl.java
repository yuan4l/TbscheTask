package service.impl;

import dao.TbOrderCopyDao;
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

    @Autowired
    private TbOrderCopyDao tbOrderCopyDao;

    public void insert() throws Exception {

        //������
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

    public List<TbOrderDto> getTbOrderList(String buildDate) throws Exception {

        List<TbOrderDto> orderDtoList = tbOrderDao.findListByDate(buildDate);
        return orderDtoList;
    }

    public boolean insertTbOrderCopy(TbOrderDto tbOrderDto) {
        int flag = tbOrderCopyDao.insert(tbOrderDto);
        System.out.println("************");
        System.out.println(flag);
        System.out.println("************");
        return flag == 1 ? true : false;
    }
}
