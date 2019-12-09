//√∞≈›∑®≈≈–Ú
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int arr[10];
	int i, j;
	int tmp;
	for (i = 0; i < 10; i++){
		printf("arr[%d] =", i);
		scanf("%d", &arr[i]);
	}
	for (i = 1; i < 10; i++){
		for (j = 9; j >= i; j--){
			if (arr[j]<arr[j - 1]){
				 tmp=arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	for (i = 0; i < 10; i++){
		printf("%d\t", arr[i]);
		if (i == 4){
			printf("\n");
		}
	}
	system("pause");
	return 0;
}*/
//Ωªªª∑®≈≈–Ú
#define   _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int arr[10];
	int i, j;
	int tmp;
	for (i = 0; i < 10; i++){
		printf("arr[%d]=", i);
		scanf("%d",&arr[i]);
	}
	for (i = 0; i < 9; i++){
		for (j = i + 1; j < 10; j++){
			if (arr[i]>arr[j]){
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	for (i = 0; i < 10; i++){
		printf("%d\t", arr[i]);
		if (i == 4){
			printf("\n");
		}
	}
	system("pause");
	return 0;
}