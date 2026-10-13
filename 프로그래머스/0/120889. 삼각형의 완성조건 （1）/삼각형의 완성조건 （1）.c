#include <stddef.h>

int solution(int sides[], size_t sides_len) {
    int answer = 0;

    // 버블 정렬 - 오름차순
    for (int i = 0; i < sides_len - 1; i++) {
        for (int j = 0; j < sides_len - 1 - i; j++) {

            if (sides[j] > sides[j + 1]) {
                int temp = sides[j];
                sides[j] = sides[j + 1];
                sides[j + 1] = temp;
            }
        }
    }

    // 정렬 후:
    // sides[0] = 가장 작은 값
    // sides[1] = 중간 값
    // sides[2] = 가장 큰 값

    if (sides[2] < sides[0] + sides[1]) {
        answer = 1;
    } else {
        answer = 2;
    }

    return answer;
}