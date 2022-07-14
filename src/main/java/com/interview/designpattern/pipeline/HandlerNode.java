package com.interview.designpattern.pipeline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HandlerNode {

    private Handler handler;

    private HandlerNode next;


    public void exec(MyContext context) {
        Boolean ret = handler.handle(context);

        if (ret) {
            if (next != null) {
                next.exec(context);
            }
        }
    }
}
