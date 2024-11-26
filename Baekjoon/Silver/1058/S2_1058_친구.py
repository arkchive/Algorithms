N = int(input()) # 사람의 수 입력
matrix = [input().strip() for _ in range(N)] # 인접 행렬 입력

max_2_friends = 0 # 가장 유명한 사람의 2-친구의 수

for i in range(N) :
    two_friends = set() # 현재 사람 i의 2-친구 집합

    for j in range(N) :
        if matrix[i][j] == 'Y': # i와 j가 직접 친구
            two_friends.add(j)
            
            for k in range(N) : 
                if matrix[j][k] == 'Y' and k != i: # k가 j의 친구이고, i가 아닌 경우
                    two_friends.add(k) # j의 친구도 i의 2-친구가 될 수 있음

    # 2-친구의 수 업데이트
    max_2_friends = max(max_2_friends, len(two_friends))

print(max_2_friends)