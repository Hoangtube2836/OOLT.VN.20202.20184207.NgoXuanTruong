
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[]=new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
private Mydate dateOrder = new Mydate();

private int qtyOrdered=0;
private static int nbOrders = 0;

public int getQtyOrdered() {
    return qtyOrdered;
}
public void setQtyOrdered(int qtyOrdered) {
    this.qtyOrdered = qtyOrdered;
}

public void addDigitalVideoDisc(DigitalVideoDisc disc){
    int num_disc = getQtyOrdered();
    if(nbOrders < MAX_NUMBERS_ORDERED){
        itemsOrdered[num_disc] = disc;
        setQtyOrdered(num_disc + 1);
        nbOrders+=1;
    }
    else{
        System.out.println("Can't add. The list is full");
    }
}

public DigitalVideoDisc[] removeDigitalVideoDisc(DigitalVideoDisc disc){
    DigitalVideoDisc new_itemsdisc[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int num_disc = getQtyOrdered();
    int j = 0;

    if(num_disc > 0){
        for(int i=0; i<num_disc; i++){
            if(!(itemsOrdered[i].getTitle()).equals(disc.getTitle()))
                new_itemsdisc[j] = itemsOrdered[i];
                j++;
        }
        setQtyOrdered(qtyOrdered - 1);
    }
    else{
        System.out.println("Remove is failed.");
    }

    return new_itemsdisc;
}

public float totalCost(){
    float total = 0;
    int num_disc = getQtyOrdered();

    for(int i = 0; i < num_disc; i++){
        total += itemsOrdered[i].getCost();
    }

    return total;
}

public void printOrder(){
	
    System.out.println("\tOrder");
    System.out.print("Data:\n ");
    dateOrder.printDate();
    System.out.println("Ordered Items: ");

    for(int i=0; i<itemsOrdered.length; i++){
        System.out.println((i+1)+". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory()
                                        + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
    }

    System.out.print("Total cost: ");
    System.out.println(this.totalCost());
}

}
