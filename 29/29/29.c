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
	puts("请输入一个字母");
	scanf("%c", &a);
	b = a - 32;
	printf("b=%c\n", b);//大写字母
	printf("%d\n", b);//ASCII中的位置
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
	printf("请输入你的商品数：");
	scanf("%d", &shang);
	ti = shang * 15;
	num =2000 + ti;
	 printf("num = %d\n", num);
	 system("pause");
	return 0;
}