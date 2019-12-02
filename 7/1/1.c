#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
char *day_name(int n){//Ö¸Õëº¯Êý
	static char *name[] = { "one day", "Monday", "Tuesday", "Wednesday", "Thursday",
		"Friday", "Saturday", "Sunday" };
	return((n<1 || n>7) ? name[0] : name[n]);
}
void main(){
	int i;
	printf("input Day no : \n");
	scanf("%d", &i);
	if (i<0 || i>7){
		exit(1);
	}
	printf("Day no:%2d-->%s\n", i, day_name(i));
	system("pause");
}