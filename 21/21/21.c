#include<stdio.h>
#include<stdlib.h>
/*int main(){// 写一个函数打印arr数组的内容，不使用数组下标，使用指针。
	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int i = 0;
	int *p = arr;
	for (i = 0; i < 10; i++){
		printf("%d ", *(p + i));
	}
	system("pause");
	return 0;
}

int main()
{
	int a = 0x11223344;
	char *pc = (char*)&a;
	*pc = 0;
	printf("%x\n", a);
	system("pause");
	return 0;
}

int main()
{
	int arr[] = { 1, 2, 3, 4, 5 };
	short *p = (short*)arr;
	int i = 0;
	for (i = 0; i<4; i++)
	{
		*(p + i) = 0;
	}
	for (i = 0; i<5; i++)
	{
		printf("%d ", arr[i]);
	}
	system("pause");
	return 0;
}
#include<stdio.h>
int i;
int main()
{
	i--;
	if (i > sizeof(i))
	{
		printf(">\n");
	}
	else
	{
		printf("<\n");
	}
	system("pause");
	return 0;
}*/
/*2. 写一个函数返回参数二进制中 1 的个数(牛客网的OJ链接)
例如： 15    0000 1111    4 个 1
程序原型：
int count_one_bits(unsigned int value)
{
	// 返回 1的位数
}
int number(int a,int b){
	int count = 0;
	for (int i = 0; i < 8; i++){
		if (a&b == 1){
			count++;
			b <- i++;
		}
	}
	return count;
}
int main(){
	int a = 15;
	int b = 1;
	number(15, 1);
	printf("%d", number(15, 1));
	system("pause");
	return 0;
}*/
//1. 不允许创建临时变量，交换两个整数的内容
#include<stdio.h>
int main(){
	int a = 20;
	int b = 30;
	a = a^b; 
	b = a^b;
	a = a^b;
	printf("a=%d\n", a);
	printf("b=%d\n", b);
	system("pause");
	return 0;
}