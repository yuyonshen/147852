#include<stdio.h>
#include<stdlib.h>
/*int main(){// дһ��������ӡarr��������ݣ���ʹ�������±꣬ʹ��ָ�롣
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
/*2. дһ���������ز����������� 1 �ĸ���(ţ������OJ����)
���磺 15    0000 1111    4 �� 1
����ԭ�ͣ�
int count_one_bits(unsigned int value)
{
	// ���� 1��λ��
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
//1. ����������ʱ������������������������
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