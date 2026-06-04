- name: create-leetcode-lesson
  description: Tạo khung (skeleton) bài giải LeetCode mới và unit test vào dự án để người dùng tự thực hiện lời giải.
  categories: [leetcode, unit-test, kotlin]
  goals:
    - "Tạo file class solution với khung TODO riêng biệt cho bài toán LeetCode"
    - "Cập nhật file ExampleUnitTest.kt với các test case mới (commented out hoặc để fail)"
  parameters:
    ProblemName: string (Tên bài toán, ví dụ: TwoSum)
  instructions: |
    1. **Tạo Skeleton File**: Tạo một file Kotlin mới cho class solution tại `app/src/test/java/com/phat/democompose/{ProblemName}.kt`.
       - Class name phải trùng với `{ProblemName}`.
       - Chỉ tạo khung hàm với `TODO("Implement solution")`, không được viết code giải thuật.
       - Template:
         ```kotlin
         package com.phat.democompose

         /**
          * LeetCode: {ProblemName}
          */
         class {ProblemName} {
             fun solution([Parameters]): [ReturnType] {
                 // Người dùng sẽ tự viết logic ở đây
                 TODO("Implement solution")
             }
         }
         ```

    2. **Thêm Unit Test**: Mở file `app/src/test/java/com/phat/democompose/ExampleUnitTest.kt` và thêm một hàm `@Test` mới vào class `ExampleUnitTest`.
       - Cần ít nhất 3 test cases mẫu.
       - Template:
         ```kotlin
         @Test
         fun test{ProblemName}() {
             val solver = {ProblemName}()
             // assertEquals(expected, solver.solution(input))
         }
         ```

  examples:
    - "tạo khung bài tập leetcode TwoSum"
    - "create leetcode skeleton ContainDuplicate2"
    - "Làm khung bài leetcode MissingNumber"
