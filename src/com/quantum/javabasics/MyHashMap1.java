
public class MyHashMap1 {

	Entry table[] = new Entry[16];
	class Entry{
		Integer key;
		String value;
		Entry next;
		Entry(Integer key,String value)
		{
			this.key = key;
			this.value  = value;
		}
		public Integer getKey() {
			return key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	public void put(Integer key,String value)
	{
		int hash = key.hashCode()%16;
		if(table[hash] == null)
		{
			Entry newEntry = new Entry(key,value);
			table[hash] = newEntry;
			
		}
		else
		{
			Entry e = table[hash];
			if(e.key.equals(key))
			{
				e.value = value;
			}
			else
			{
			  while(e.next != null)
			  {
				  e = e.next;
			  }
			  Entry newEntry = new Entry(key,value);
			  e.next = newEntry;
			}
		}
	}
	public String get(Integer key)
	{
		int hash = key.hashCode()%16;
		Entry e = table[hash];
		if(e != null)
		{
			return e.value;
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args)
	{
		MyHashMap1 obj = new MyHashMap1();
		obj.put(1, "dipu");
		obj.put(1, "sipu");
		obj.put(2, "ripu");
		System.out.println(obj.get(2));
	}
}
