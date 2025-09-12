import math

# 테스트 케이스 개수 입력
T = int(input())

for i in range(T):
    # 테스트 케이스 입력 후 분리
    x1, y1, r1, x2, y2, r2 = list(map(int, input().split()))
    
    # 두 점 사이의 거리 계산
    d = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

    if d == 0: # 두 중심이 같은 경우
        if r1 == r2:
            print(-1) # 무한대인 경우 
        else: 
            print(0) # 만나지 않는 경우
    
    else: 
        if d > r1 + r2 or d < abs(r1 - r2):
            print(0) # 만나지 않는 경우
        elif d == r1 + r2 or d == abs(r1 - r2):
            print(1) # 한 점에서 만나는 경우
        else: 
            print(2) # 두 점에서 만나는 경우3
            