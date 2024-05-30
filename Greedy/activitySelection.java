// activitySelection.java
import java.math.*;
import java.util.*;
class activitySelection {
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39,60},{5,28},{27,40},{50,60}};
//sort on the basis or activity ending time
Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

//select first pair always -> as array is sort on basis of 2nd time hence first pair is always end first
int activitySel = 1;
int activityEndTime = pairs[0][1]; 

//for other pair
for(int i =0; i<pairs.length; i++){
    if(pairs[i][0]>activityEndTime){
    activitySel++;
    activityEndTime = pairs[i][1];
      }
    }
    System.out.println("maximum activity done: " + activitySel);
   }
}