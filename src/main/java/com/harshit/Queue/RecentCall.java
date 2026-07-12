package com.harshit.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCall {

    Queue<Integer> queue;

    public RecentCall() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}
/*
ou have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.



        Example 1:

Input
["RecentCounter", "ping", "ping", "ping", "ping"]
        [[], [1], [100], [3001], [3002]]
Output
[null, 1, 2, 3, 3]

Explanation
RecentCounter recentCounter = new RecentCounter();
recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3*/

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

//Let's understand the question in simple terms.
//
//        ---
//
//        ## What is a "request"?
//
//A request is an event that happens at a specific time.
//
//        Example:
//
//        ```text
//Time (ms)
//
//1
//        100
//        3001
//        3002
//        7000
//        ```
//
//Each call to
//
//```java
//ping(t)
//```
//
//means:
//
//        > "A new request arrived at time `t` milliseconds."
//
//        ---
//
//        ## What should `ping(t)` return?
//
//It should return **how many requests happened in the last 3000 milliseconds**, including the current one.
//
//The time window is:
//
//        ```text
//[t - 3000, t]
//        ```
//
//This range is **inclusive**, meaning both ends are included.
//
//---
//
//        ## Example
//
//Calls:
//
//        ```text
//ping(1)
//ping(100)
//ping(3001)
//ping(3002)
//```
//
//        ---
//
//        ### Call 1
//
//        ```text
//ping(1)
//```
//
//Window:
//
//        ```text
//[-2999, 1]
//        ```
//
//Requests so far:
//
//        ```text
//1
//        ```
//
//Inside the window:
//
//        ```text
//1
//        ```
//
//Answer:
//
//        ```text
//1
//        ```
//
//        ---
//
//        ### Call 2
//
//        ```text
//ping(100)
//```
//
//Window:
//
//        ```text
//[-2900, 100]
//        ```
//
//Requests:
//
//        ```text
//1
//        100
//        ```
//
//Both are inside.
//
//        Answer:
//
//        ```text
//2
//        ```
//
//        ---
//
//        ### Call 3
//
//        ```text
//ping(3001)
//```
//
//Window:
//
//        ```text
//[1, 3001]
//        ```
//
//Requests:
//
//        ```text
//1
//        100
//        3001
//        ```
//
//All three are inside because:
//
//        * `1` ✔ (equal to the left boundary)
//        * `100` ✔
//        * `3001` ✔
//
//Answer:
//
//        ```text
//3
//        ```
//
//        ---
//
//        ### Call 4
//
//        ```text
//ping(3002)
//```
//
//Window:
//
//        ```text
//[2, 3002]
//        ```
//
//Requests so far:
//
//        ```text
//1
//        100
//        3001
//        3002
//        ```
//
//Check each one:
//
//        | Request | Inside [2, 3002]? |
//        | ------- | ----------------- |
//        | 1       | ❌ No (too old)    |
//        | 100     | ✔ Yes             |
//        | 3001    | ✔ Yes             |
//        | 3002    | ✔ Yes             |
//
//Only `1` is outside the window.
//
//Answer:
//
//        ```text
//3
//        ```
//
//        ---
//
//        ## Another Example
//
//Suppose the requests are:
//
//        ```text
//ping(5000)
//ping(6000)
//ping(9000)
//```
//
//        ### `ping(5000)`
//
//Window:
//
//        ```text
//[2000, 5000]
//        ```
//
//Requests:
//
//        ```text
//5000
//        ```
//
//Answer:
//
//        ```text
//1
//        ```
//
//        ---
//
//        ### `ping(6000)`
//
//Window:
//
//        ```text
//[3000, 6000]
//        ```
//
//Requests:
//
//        ```text
//5000
//        6000
//        ```
//
//Both are inside.
//
//        Answer:
//
//        ```text
//2
//        ```
//
//        ---
//
//        ### `ping(9000)`
//
//Window:
//
//        ```text
//[6000, 9000]
//        ```
//
//Requests:
//
//        ```text
//5000
//        6000
//        9000
//        ```
//
//Check them:
//
//        * `5000` ❌ (older than 6000)
//        * `6000` ✔
//        * `9000` ✔
//
//Answer:
//
//        ```text
//2
//        ```
//
//        ---
//
//        ## Why does the problem say `t` is always increasing?
//
//The problem guarantees:
//
//        ```text
//ping(100)
//ping(300)
//ping(500)
//ping(800)
//```
//
//It will **never** be:
//
//        ```text
//ping(500)
//ping(100)
//```
//
//Because requests always arrive in chronological order.
//
//This is why a **Queue** is the perfect data structure:
//
//        * New requests are added at the **back**.
//        * Old requests expire first, so they are removed from the **front**.
//
//That's exactly how a queue works.
