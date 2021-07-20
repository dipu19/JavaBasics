
public class MyHashMap {
 // creating my own Hash map
 // Hash map contains entry and each entry contains key, value and next
	Entry table[] = new Entry[16];
	class Entry{
		String key;
		String value;
		Entry next;
		Entry(String key, String value)
		{
			this.key = key;
			this.value = value;
		}
		public String getKey() {
			return key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	public void putData(String key, String value)
	{
		int hash = key.hashCode()%16;
		System.out.println("hash code"+hash);
		Entry e = table[hash];
		if(e == null)
		{
			Entry newEntry = new Entry(key,value);
			table[hash] = newEntry;
		}
		else
		{
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
	public String getData(String key)
	{
		int hash = key.hashCode()%16;
		Entry e = table[hash];
		if(e.key.equals(key))
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
		MyHashMap hashMap = new MyHashMap();
		hashMap.putData("Dipu", "Male");
		hashMap.putData("Bou", "female");
		System.out.println(hashMap.getData("Bou"));
	}
}
