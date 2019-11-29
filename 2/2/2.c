#include <stdio.h>
#include<stdlib.h>
void swap(int * pa, int * pb)//练习数与数之间的交换
{
	int tmp;

	tmp = *pa;
	*pa = *pb;
	*pb = tmp;
}

void test(int * pa, int * pb)
{
	int  *ptmp;

	ptmp = pa;
	pa = pb;
	pb = ptmp;
}

int main()
{
	int a = 5, b = 6;
	test(&a, &b);
	printf("%d %d\n", a, b);
	swap(&a, &b);
	printf("%d %d\n", a, b);
	system("pause");
	return 0;
}