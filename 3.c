#include <stdio.h>//&&µÄÁ·Ï°Ìâ
#include<stdlib.h>
int main() {
	int i = 0, a = 0, b = 2, c = 3, d = 4;
	i = a++ && ++b && d++;
	printf("a = %d\n b = %d\n c = %d\n d = %d\n", a, b, c, d);
	system("pause");
	return 0;
}
#include <stdio.h>
#include<stdlib.h>
int main() {
	int i = 0, a = 0, b = 2, c = 3, d = 4;
    i = a++||++b ||d++; ? 
printf("a = %d\n b = %d\n c = %d\nd = %d\n", a, b, c, d);
system("pause");
return 0;
}