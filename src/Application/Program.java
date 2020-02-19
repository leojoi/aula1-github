package Application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
<<<<<<< HEAD
=======
		
		System.out.println("bom..dia");
	
>>>>>>> 2c51972830e622f2590f565ae98e9d27a87782d7

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;

		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);
	}
}