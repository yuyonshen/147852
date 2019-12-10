#include<stdio.h>//×Ö·û´®µÄ·´×ª
#include<stdlib.h>
int main(){
	char arr1[11] = { "yuzhenghan" };
	char arr2[11];
	int i;
	int size = sizeof(arr1);
	for (i = 0; i < 10; i++){
		arr2[size-2 - i] = arr1[i];
	}
	printf("%s",arr2);
	system("pause");
	return 0;
}