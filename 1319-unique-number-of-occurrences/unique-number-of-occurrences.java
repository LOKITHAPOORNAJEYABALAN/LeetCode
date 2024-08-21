class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
       HashMap<Integer ,Integer> map = new HashMap<Integer,Integer>();
       Set<Integer> set = new HashSet<>();
       for(int ind = 0 ; ind < arr.length ; ind++)
       {
        if(map.containsKey(arr[ind]) == true)
       {
        map.put(arr[ind],(map.get(arr[ind])+1));
       }
       else
       {
        map.put(arr[ind],1);
       }
       }
       for( int x : map.values()) set.add(x);
       return set.size() == map.size();
    }
}