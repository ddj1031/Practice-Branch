////import java.util.concurrent.ArrayBlockingQueue;
////
////public class Bin extends ArrayBlockingQueue<Item> {
////
////	@Override
////	public boolean add(Item item) {
////		if (!isEmpty()) {
////			Item first = peek();
////			if(!first.getName().equals(item.getName())) {
////				throw new IllegalArgumentException
////				("Invalid item name " + item.getName());
////			}
////		}
////		return super.add(item);
////	}
////	
////	//add the synonym
////	public Item release() {
////		return poll();
////	}
////	
////	
////	public class Bin {
////		
////		private BlockingQueue<Item> items;
////		
////		public Bin(int maxItems) {
////			
////			items = new ArrayBlockingQueue<>(maxItems);
////		}
////		
////		public boolean isEmpty() {
////			return items.isEmpty();
////		}
////		public int getAvailableSlots() {
////			return items.remainingCapacity();
////		}
////		
////		public String getItemName() {
////			if (isEmoty()) {
////				return null;
////			}
////			Item item = items.peek();
////			return item.getName();
////		}
////		
////		public void restock (String name, int amount, int wholesalePrice, int retailPrice) {
////			
////			if (!isEmpty() && !name.equalsIgnoreCase(getItemName())) {
////				throw new IllegalArgumentException
////				(String.format("Cannot restock %s with %s", getItemName(), name));
////			}
////			
////			if (amount > getAvailableSlots()) {
////				throw new IllegalArgumentException
////				(String.format("There are only %d spots left", getAvailbleSlots()));
////			}
////			for (int i = 0; i < amount; i++) {
////				items.add(new Item(name, wholesalePrice, retailPrice));
////			}
////		}
////	}
////	public static void main(String[] args) {
////		
//		
//		
//
//	}
//
//}
