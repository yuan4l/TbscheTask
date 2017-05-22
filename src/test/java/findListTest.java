import dao.TbOrderCopyDao;
import dao.TbOrderDao;
import dto.TbOrderDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.TbOrderService;

import java.util.List;

/**
 * Created by yuan4j on 2017/5/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class findListTest {

    @Autowired
    TbOrderDao tbOrderDao;
    @Autowired
    private TbOrderService tbOrderService;

    @Autowired
    private TbOrderCopyDao tbOrderCopyDao;

    @Test
    public void findList() {
        TbOrderDto tbOrderDto = new TbOrderDto();
        String buildDate = "20170511";
        tbOrderDto.setBuildDate(buildDate);
//        try {
//            List<TbOrderDto> list =  tbOrderService.getTbOrderList(buildDate);
//            System.out.println(list.size());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        List<TbOrderDto> list = tbOrderDao.findListByDate(buildDate);
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println(list.size());
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");

        for(TbOrderDto tb :list){
            tbOrderService.insertTbOrderCopy(tb);
        }
    }
}
