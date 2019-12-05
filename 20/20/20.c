#include<stdio.h>
#include<stdlib.h>
/*int main(){
	int a = 0x11223344;
	char *pc = (char*)&a;
	*pc = 0;
	printf("%x\n", a);
	system("pause");
	return 0;
}
int main(){
	int a, b, c;
	a = 5;
	c = ++a;
	b = ++c, c++, ++a, a++;
	b += a++ + c;
	printf("a=%d\nb=%d\nc=%d\n", a, b, c);
	system("pause");
	return 0;	
}
void jiaohuan(int *a,int *b){
	int tmp;
	tmp = *a;
	*a = *b;
	*b = tmp;
	printf("a=%d\nb=%d\n", *a,*b);
}
int  main(){
	int a = 10;
	int b = 20;
	jiaohuan(&a, &b);	
	system("pause");
	return 0;
}*/
int main(){
	int a = 15;
	int b = 1;
	int tmp = 0;
	for (int i = 0; i < 8; i++){
		if (a&b == 1){
			tmp++;
			b < -i++;
		}
	}
	printf("%d\n", tmp);
	system("pause");
	return 0;
}