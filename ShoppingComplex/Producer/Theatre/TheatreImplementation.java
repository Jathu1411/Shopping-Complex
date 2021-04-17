package Theatre;


public class TheatreImplementation implements Theatre_Interface{
	public int ticketPayment(int ticket) {
		// TODO Auto-generated method stub
				if(ticket == 1){
					System.out.println("Ticket type is  Full");
					return Theatre_Interface.full;
				}
				else {
					System.out.println("Ticket type is half");
					return Theatre_Interface.half;
				}
				
	}

	@Override
	public void listTicket() {
		// TODO Auto-generated method stub
		System.out.println(" 1 : Size small "+Theatre_Interface.full+".00 lkr");
		System.out.println(" 2 : Size medium "+Theatre_Interface.half+".00 lkr");
		
	}



}
