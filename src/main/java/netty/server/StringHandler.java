package netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author linhao
 * @date 2020/5/16 16:29
 */
public class StringHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {
        System.out.println(s);
        channelHandlerContext.channel().writeAndFlush("hi,netty");
        channelHandlerContext.writeAndFlush("hi");
    }
}
