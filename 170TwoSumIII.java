//Design and implement a TwoSum class. It should support the following operations: add and find.
//add - Add the number to an internal data structure.
//find - Find if there exists any pair of numbers which sum is equal to the value.

class TwoSum {
    //Read Heavy
    private Set<Integer> sum;
    private Set<Integer> num;
    
    /** Initialize your data structure here. */
    public TwoSum() {
        sum = new HashSet<Integer>();
        num = new HashSet<Integer>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(num.contains(number)){
            sum.add(number*2);
        }else{
            Iterator<Integer> itr = num.iterator();
            while(itr.hasNext()){
                sum.add(number+itr.next());
            }
            num.add(number);
        }        
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        return(sum.contains(value));
    }
}
class TwoSumII{
    //Write Heavy
    private Map<Integer, Integer> map;
  
    /** Initialize your data structure here. */
    public TwoSum() {
        map = new HashMap<Integer, Integer>();       
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(map.containsKey(number)){
          map.put(number, map.get(number)+1);
        }else{
          map.put(number, 1);
        }
    }
  
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(Integer i : map.keySet()){
          int num1 = i;
          int num2 = value-i;
          if(num1 == num2){
            if(map.get(num1) >=2) return true;
          }else{
            if(map.containsKey(num2)) return true;
          }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
