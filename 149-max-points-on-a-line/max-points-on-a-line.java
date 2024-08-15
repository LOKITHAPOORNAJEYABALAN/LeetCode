class Solution
{
public int maxPoints(int[][] arr) {
Map<Double,Integer> map=new HashMap<>();
int n=arr.length;
int max=0;
double slope=0;
for(int i=0;i<n-max-1;i++){ // i=0 to n can be decreased to i=0 to n-max-1
int imax=0;
for(int j=i+1;j<n;j++){
if(arr[j][0]-arr[i][0]==0) slope=100000001;
else if(arr[j][1]-arr[i][1]==0){
slope=0;
}
else{
slope=(double)(arr[j][1]-arr[i][1])/(double)(arr[j][0]-arr[i][0]);
}
map.put(slope,map.getOrDefault(slope,0)+1);
imax=Math.max(imax,map.get(slope));
}
max=Math.max(max,imax);
map.clear();
}
return max+1;
}
}