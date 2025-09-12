import math

# 주어진 점이 원 내부에 있는지 확인하는 함수
def is_inside_circle(x, y, cx, cy, r):
    # 점과 원 중심 사이의 거리 계산
    d = math.sqrt((x-cx) ** 2 + (y-cy) ** 2)

    # 거리가 반지름보다 작으면 원 내부에 있음
    return d < r


# 테스트 케이스 개수 입력
T = int(input())

for _ in range(T):
    # 출발점, 도착점 입력
    x1, y1, x2, y2 = map(int, input().split())
    # 행성계의 개수
    n = int(input())

    # 행성계 진입/이탈 횟수
    count = 0

    # 각 행성계에 대한 처리
    for _ in range(n):
        cx, cy, r = map(int, input().split())

        # 출발점이 원 내부에 있는지 확인
        start = is_inside_circle(x1, y1, cx, cy, r)

        # 도착점이 원 내부에 있는지 확인
        end = is_inside_circle(x2, y2, cx, cy, r)

        # 출발점과 도착점 둘 중 한쪽만 원 내부에 있으면 경계를 통과함
        if start != end:
            count += 1

    print(count)