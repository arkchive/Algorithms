import sys
sys.setrecursionlimit(10000)

# DFS로 인접한 배추들 방문
def dfs(x, y, field, visited, M, N):
    # 상, 하, 좌, 우 방향
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    visited[y][x] = True

    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < M and 0 <= ny < N and not visited[ny][nx] and field[ny][nx] == 1:
            dfs(nx, ny, field, visited, M, N)


# 테스트 케이스 개수 입력
T = int(input())

for _ in range(T):
    # 테스트 케이스 입력 후 분리
    M, N, K = map(int, input().split())
    field = [[0] * M for _ in range(N)] # 배추밭
    visited = [[False] * M for _ in range(N)] # 방문 여부

    for _ in range(K):
        # 배추 위치 입력 후 분리
        x, y = map(int, input().split())
        field[y][x] = 1

    worm_count = 0 # 배추흰지렁이 마리 수

    for y in range(N):
        for x in range(M):
            if field[y][x] == 1 and not visited[y][x]:
                # 새로운 배추 묶음이 있으면 지렁이 수 증가
                dfs(x, y, field, visited, M, N)
                worm_count += 1
    
    print(worm_count)
