import dao.TbOrderDao;
import dto.TbOrderDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.TbOrderService;


/**
 * Created by yuan4j on 2017/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TbOrderTest {

    @Autowired
    private TbOrderDao tbOrderDao;

    @Autowired
    private TbOrderService tbOrderService;

    @Test
    public void insert() {
//        System.out.println("dfsafdsafdsafd");
        TbOrderDto tbOrderDto = new TbOrderDto();
//        tbOrderDto.setBuildDate("a");
//        tbOrderDto.setBillNumber("a");
//        tbOrderDto.setCustomer("a");
//        tbOrderDto.setGoodsName("a");
//        tbOrderDto.setAmount(BigDecimal.valueOf(12));
//        tbOrderDto.setSaleMoney(BigDecimal.valueOf(12.03));
//        System.out.println("asdfasfdsa");

//        TbOrderDto tbOrderDto1 = tbOrderDao.get(Long.valueOf(1));
//        System.out.println(tbOrderDto1.getAmount());
//        tbOrderDao.insert(tbOrderDto);

        try {
            tbOrderService.insert();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
