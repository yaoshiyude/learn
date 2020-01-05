package learnTest.java底层;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2019-12-16 14:48
 **/

public class MonthPassTest {

    public static void main(String[] args) {
        ItemDTO itemDTO = new ItemDTO();
        System.out.println(itemDTO.getNum());
        itemDTO.setNum(1);

        ItemDTO itemDTO1 = itemDTO;
        itemDTO1.setNum(2);

        System.out.println(itemDTO.getNum());
        System.out.println(itemDTO1.getNum());
        MonthPassTest monthPassTest = new MonthPassTest();
        monthPassTest.testMonthPass(itemDTO);
        System.out.println(itemDTO.getNum());
    }

    public void testMonthPass(ItemDTO itemDTO){

        /*itemDTO = new ItemDTO();*/
        itemDTO.setNum(2);
        System.out.println(itemDTO.getNum());
    }
}
