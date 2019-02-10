public class FileRecord implements Comparable<FileRecord> {
	public enum Sex {MALE, FEMALE} //Enumerated type to categorize between Male and Female
	
	private int recordID;
	private String patientName;
	private Sex sex;
	private char type;
	

	//Constructors
	public FileRecord(int recordID, String patientName, Sex sex, char patientType) {
		this.recordID = recordID;
		this.patientName = patientName;
		this.sex = sex;
		type = patientType;
	}
	
	public FileRecord(FileRecord otherFile) {
		recordID = otherFile.getID();
		patientName = otherFile.getPName();
		sex = otherFile.getSex();
		type = otherFile.getType();
	}
	
	@Override
	public int compareTo(FileRecord oFile) {
		return this.recordID - oFile.getID();
	}

	//Getters
	public Sex getSex() {
		return sex;
	}

	public char getType() {
		return type;
	}

	public String getPName() {
		return patientName;
	}

	public int getID() {
		return recordID;
	}
	
	//Equals method for comparing if another object is the same as this instance
	public boolean equals(Object obj) {
		if(!(obj instanceof FileRecord))
			return false;
		FileRecord other = (FileRecord) obj;
		return this.recordID == other.getID() &&
				this.patientName.equals(other.getPName()) &&
				this.sex == other.getSex() && this.type == other.getType();
	}
	
	/**
	 * A method to return a copy of the given array
	 * @param shelve - Original Array
	 * @return - Copy of shelve
	 */
	public static FileRecord[] copyOf(FileRecord[] shelve) {
		FileRecord[] copy = new FileRecord[shelve.length];
		for(int i = 0; i < shelve.length; i++) {
			copy[i] = shelve[i];
		}
		return copy;
	}
	
	/**
	 * Linear Algorithm to find the index of a given target.
	 * @param shelve - Target List
	 * @param target - Target Element
	 * @return - Index of Target Element (-1 if not found)
	 */
	public static int linearSearch(FileRecord[] shelve, FileRecord target) {
		return linHelper(shelve, 0, new FileRecord(target) {
			@SuppressWarnings("unused")
			public boolean equals(FileRecord otherRecord) {
				return this.getID() == otherRecord.getID();
			}
		});
	}
	
	/**
	 * Linear search helper
	 * @param shelve - Array to find target in
	 * @param index - index of current object we are comparing the target with 
	 * @param target - The object we want to find in the array
	 * @return index of what was found (-1 if not found)
	 */
	private static int linHelper(FileRecord[] shelve, int index, FileRecord target) {
		if(index >= shelve.length) {
			return -1;
		}
		if(target.equals(shelve[index])) {
			return index;
		}
		return linHelper(shelve, index+1, target);
	}
	
	
	/**
	 * Binary Algorithm to find the index of a given target.
	 * @param arr - Target List
	 * @param target - Target Element
	 * @return - Index of Target Element (-1 if not found)
	 */
	public static int binarySearch(FileRecord[] shelve, FileRecord target) {
		
		return binHelper(shelve, target, 0, shelve.length-1);
		
	}

	public static int binHelper(FileRecord[] shelve, FileRecord target, int left, int right) 
	{
		int mid = ((right - left)/2) + left;
		
		if(right <= 0 || right < left)
			return -1;
		
		if(target.equals(shelve[mid]))
			return mid;
		
		if(target.compareTo(shelve[mid]) > 0)
		{
			left = mid + 1;
			return binHelper(shelve, target, left, right);
		}
		if(target.compareTo(shelve[mid]) < 0)
		{
			right = mid - 1;
			return binHelper(shelve, target, left, right);
		}
		
		return -1;
		//return 
	}
	
	/**
	 * Iterative bubble sort for an array
	 * @param shelve array to be sorted.
	 */
	public static void bubbleSort(FileRecord[] shelve) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int index = 1; index < shelve.length; index++) {
				if(shelve[index-1].compareTo(shelve[index]) >= 0) {
					swap(shelve, index-1, index);
					isSorted = false;
				}
			}
		}		
	}

	private static void swap(FileRecord[] shelve, int a, int b) {
		FileRecord temp = shelve[a];
		shelve[a] = shelve[b];
		shelve[b] = temp;
	}

	/**
	 * Recursive Insertion Sort for an array
	 * @param shelve - Array to be sorted
	 */
	public static void insertionSort(FileRecord[] shelve) {
		insHelper(shelve, 1);
	}

	/**
	 * A helper method for the insertion sort's recursive algorithm
	 * @param shelve - Array to be sorted
	 * @param tailIndex - Index of the right part of the array that is yet to be sorted.
	 */
	private static void insHelper(FileRecord[] shelve, int tailIndex) {
		if(tailIndex >= shelve.length) {return;}
		for(int i = tailIndex-1; i >= 0; i--) {
			if(shelve[i+1].compareTo(shelve[i]) >= 0) {
				break;
			}
			swap(shelve, i, i+1);
		}
		insHelper(shelve, tailIndex+1);
	}

	/**
	 * Recursive Insertion Sort for an array
	 * @param shelve - Array to be sorted
	 */
	public static void selectionSort(FileRecord[] shelve) {
		selHelper(shelve, 0, shelve[0].getID());
	}
	
	private static void selHelper(FileRecord[] shelve, int left, int target)
	{
		//if(target < shelve[left].getID())
			
	}
	
	private static int minFinder(FileRecord[] shelve, int index, int minIndex, int min)
	{
		//if(min < shelve[index].getID())
			//minIndex = minFinder(shelve, index+1, minIndex);
		
		if(min > shelve[index].getID())
		{
			minIndex = shelve[index].getID();
		}
		return 0;
	}
}
