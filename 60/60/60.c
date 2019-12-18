//共用体也称为联合体
#include<stdio.h>
#include<stdlib.h>
union Dataunion
{
	int ilnt;
	char cchar;
};
int main(){
	union Dataunion Union;
	Union.ilnt = 97;
	printf("ilnt:%d\n", Union.ilnt);
	printf("cchar:%c\n", Union.cchar);
	Union.cchar = 'A';
	printf("ilnt:%d\n", Union.ilnt);
	printf("cchar:%c\n", Union.cchar);
	system("pause");
	return 0;
}