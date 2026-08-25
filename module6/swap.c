#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void broken_swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;

    printf("Inside broken_swap: a = %d, b = %d\n", a, b);
}

int main(void) {
    int x = 10;
    int y = 20;

    printf("Before swap: x = %d, y = %d\n", x, y);

    swap(&x, &y);
    printf("After swap: x = %d, y = %d\n", x, y);

    printf("Before broken swap: x = %d, y = %d\n", x, y);
    broken_swap(x, y);
    printf("After broken swap: x = %d, y = %d\n", x, y);

    return 0;
}
