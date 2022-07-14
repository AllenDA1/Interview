package com.interview.io.bio;

import java.io.*;
import java.util.Properties;

public class OutputStreamDemo {



    public static void main(String[] args) throws IOException {


        Properties info = new Properties();
        InputStream ins = ClassLoader.getSystemResourceAsStream("file.properties");
        info.load(ins);
        String path = info.getProperty("path");
        File file = new File(path + "\\against1.txt");

        // 写
        OutputStream out = new FileOutputStream(file);
        String text = "开着宾利西装笔挺\n" +
                "\n" +
                "我用我的经历教你怎么Be a king\n" +
                "\n" +
                "在后备箱里藏着武器还有玫瑰花\n" +
                "\n" +
                "我消失在黑暗的尽头像个蝙蝠侠\n" +
                "\n" +
                "手段 太过高明\n" +
                "\n" +
                "刚干完几票大的我还不想消停\n" +
                "\n" +
                "他们都觉得我太过贪心\n" +
                "\n" +
                "但是事实上 我只想 讨你欢心\n" +
                "\n" +
                "我把刀上的血迹擦干净\n" +
                "\n" +
                "刀光剑影像在拍电影\n" +
                "\n" +
                "玻璃碎片撒落了满地\n" +
                "\n" +
                "能够换你回来我什么都愿意\n" +
                "\n" +
                "如果你不在我身边 赚再多也没有用 girl\n" +
                "\n" +
                "失去你比失去全世界还痛 Girl\n" +
                "\n" +
                "你对于我 多重要 你不懂 girl\n" +
                "\n" +
                "你的美是我不想醒的梦 girl\n" +
                "\n" +
                "快脱下你的外套\n" +
                "\n" +
                "我怀里温暖又舒服\n" +
                "\n" +
                "请不要再leave me alone\n" +
                "\n" +
                "我愿和全世界作对\n" +
                "\n" +
                "为你和全世界作对\n" +
                "\n" +
                "我愿和全世界作对\n" +
                "\n" +
                "为你和全世界作对\n" +
                "\n" +
                "It’s just me against the world baby\n" +
                "为你对抗全球\n" +
                "It’s me against the world\n" +
                "阻挡所有风雨\n" +
                "It’s just me against the world baby\n" +
                "与世界为敌\n" +
                "I get nothing to lose\n" +
                "肆无忌惮 背水一战\n" +
                "Cause It’s just me against the world baby\n" +
                "我的环球小姐\n" +
                "me against the world\n" +
                "你我对抗世界\n" +
                "没有人能阻止我带着你逃走\n" +
                "\n" +
                "我们光用眼神就能够交流\n" +
                "\n" +
                "牵着我的手 跟着我的脚步\n" +
                "\n" +
                "我用的我的胸膛把拳头全部都挡住\n" +
                "\n" +
                "一起躲过刽子手追踪\n" +
                "\n" +
                "穿过复杂的迷宫\n" +
                "\n" +
                "拼了命 保护你 对抗狂躁的飓风\n" +
                "\n" +
                "我不能让你再次落单\n" +
                "\n" +
                "爱像病毒一样在我体内扩散\n" +
                "\n" +
                "我是冷血杀手但你是我软肋\n" +
                "\n" +
                "我不管就算他们都说反对\n" +
                "\n" +
                "Dj drop that sh*t\n" +
                "\n" +
                "为了你我可以对抗全世界\n" +
                "\n" +
                "快脱下你的外套\n" +
                "\n" +
                "我怀里温暖又舒服\n" +
                "\n" +
                "请不要再leave me alone\n" +
                "\n" +
                "我愿和全世界作对\n" +
                "\n" +
                "为你和全世界作对\n" +
                "\n" +
                "我愿和全世界作对\n" +
                "\n" +
                "为你和全世界作对\n" +
                "\n" +
                "It’s just me against the world baby\n" +
                "为你对抗全球\n" +
                "It’s me against the world\n" +
                "阻挡所有风雨\n" +
                "It’s just me against the world baby\n" +
                "与世界为敌\n" +
                "I get nothing to lose\n" +
                "肆无忌惮 背水一战\n" +
                "Cause It’s just me against the world baby\n" +
                "我的环球小姐\n" +
                "me against the world\n" +
                "你我对抗世界";

        byte[] bytes = text.getBytes();
        out.write(bytes);
        out.flush();
        out.close();
    }
}
