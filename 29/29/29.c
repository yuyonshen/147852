/*#include<stdio.h>
int main(){
	char *Char = "i love chine";
	puts("i love chine");
	puts(Char);
	Char = "i love chine";
	puts(Char);
	system("pause");
	return 0;
}*/
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(){
	char a;
	char b;
	puts("������һ����ĸ");
	scanf("%c", &a);
	b = a - 32;
	printf("b=%c\n", b);//��д��ĸ
	printf("%d\n", b);//ASCII�е�λ��
	system("pause");
	return 0;
}*/
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int main(){
	int num;
	int yue = 2000;
	int shang;
	int ti;
	printf("�����������Ʒ����");
	scanf("%d", &shang);
	ti = shang * 15;
	num =2000 + ti;
	 printf("num = %d\n", num);
	 system("pause");
	return 0;
}