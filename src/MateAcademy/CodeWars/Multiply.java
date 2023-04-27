package MateAcademy.CodeWars;

public class Multiply {
        public static int grow(int[] x){
            int result = x[0];
            for (int i = 1; i < x.length; i++) {
                result*=x[i];
            }

            return result;
        }
    }


    // another vatiant  :
/*
  int prod = 1;
    for (int m: x) prod *=m;
    return prod;

  }

}
 */


    /*
    This method takes an integer array x as input and returns the product of all elements in the array.
    We initialize a variable product to 1, which is the identity element for multiplication.
     We then iterate through the elements of the array x,
      and multiply each element with product. Finally, we return the product obtained.
     */


/*
int r = 1;
    for (int n : x) r *= n;
    return r;
  }

}
 */