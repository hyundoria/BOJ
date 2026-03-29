#include <stdio.h>



int main() {
	
  int n = 0;

  scanf("%d", &n);
  
	for (int i = 0; i < n; i++) {
      
    int cnt[4];
    int k = 0;
    scanf("%d", &k);

    *(cnt) = k/25;
    k %= 25;
    *(cnt+1) = k/10;
    k %= 10;
    *(cnt+2) = k/5;
    k %= 5;
    *(cnt+3) = k;


    printf("%d %d %d %d\n", *(cnt),*(cnt+1),*(cnt+2),*(cnt+3));
  }
    

    return 0;
}