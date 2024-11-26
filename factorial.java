public class factorial {

          private int fact;
          public factorial() {
             fact=1;
          }
          public int getFact(int num) {

              for (int i = num; i > 0; i--) {
                  fact=fact*i;
              }
              return fact;
          }



}
