N = int(input()) # 사람의 수 입력
info = list(map(int, input().split())) # 각 사람의 "자기보다 큰 사람 수" 정보

# 결과를 저장할 리스트
result = [0] * N

# 키가 작은 사람(1부터 N까지)부터 배치
for i in range(1, N+1):
    count = info[i-1] # 왼쪽에 있는 자신보다 큰 사람의 수
    position = 0

    # 왼쪽부터 빈 자리를 찾아서 배치
    for j in range(N):
        if result[j] == 0: # 빈 자리 발견
            if count == 0: # 왼쪽에 큰 사람이 count만큼 이미 배치가 되었다면
                result[j] = i
                break
            count -= 1 # 아직 더 큰 사람이 필요한 경우 감소

print(' '.join(map(str, result)))