#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[10];
	int i, j;
	for (i = 0; i < 10; i++){
		printf("a[%d]=", i);
		scanf("%d", &a[i]);
	}
	Celerity(0, 9, a);
	for (i = 0; i < 10; i++){
		printf("%d\t", a[i]);
		if (i == 4){
			putchar('\n');
		}
	}
	system("pause");
	return 0;
}
Celerity(int left, int right, int arr[]){
	int i;
	int j;
	int mid, tmp;
	i = left;
	j = right;
	mid = (left + right) / 2;
	do{
		while ((arr[i] < mid) && (i < right))
			i++;
		while ((arr[j]>mid) && (j>left))
			j--;
		if (i <= j){
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
	} while (i <= j);
	if (left<j)
	Celerity(left, j, arr);
	if (right>i)
		Celerity(i, right, arr);
}