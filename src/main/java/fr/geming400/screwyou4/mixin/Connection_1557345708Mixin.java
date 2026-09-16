package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.Connection.class)
public class Connection_1557345708Mixin {
        @Inject(at = @At("HEAD"), method = "setReadOnly()V", cancellable = true)
    private void setReadOnly_1234393594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234393594L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect(Ljava/net/InetSocketAddress;Lnet/minecraft/server/network/EventLoopGroupHolder;Lnet/minecraft/network/Connection;)Lio/netty/channel/ChannelFuture;", cancellable = true)
    private static void connect__1076379849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076379849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnect_403530582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(403530582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void disconnect_383760678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(383760678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isConnected()Z", cancellable = true)
    private void isConnected_1692949955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692949955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void send__847439597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-847439597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;Z)V", cancellable = true)
    private void send_1374067388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1374067388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;)V", cancellable = true)
    private void send_303117194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(303117194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRemoteAddress()Ljava/net/SocketAddress;", cancellable = true)
    private void getRemoteAddress_2068629295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068629295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1427662049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1427662049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSending()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void getSending__1042245677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042245677L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
    }

    @Inject(at = @At("HEAD"), method = "handleDisconnection()V", cancellable = true)
    private void handleDisconnection_962483770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(962483770L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initiateServerboundPlayConnection(Ljava/lang/String;ILnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void initiateServerboundPlayConnection_553642654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(553642654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initiateServerboundPlayConnection(Ljava/lang/String;ILnet/minecraft/network/ProtocolInfo;Lnet/minecraft/network/ProtocolInfo;Lnet/minecraft/network/ClientboundPacketListener;Z)V", cancellable = true)
    private void initiateServerboundPlayConnection__111452490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-111452490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLoggableAddress(Z)Ljava/lang/String;", cancellable = true)
    private void getLoggableAddress__781763639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781763639L))
            info.setReturnValue("q??)!43+&\uBC6Dp97[\u4AF5\uA8F9p^\u6704`iQP");
    }

    @Inject(at = @At("HEAD"), method = "getAverageSentPackets()F", cancellable = true)
    private void getAverageSentPackets__178960894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178960894L))
            info.setReturnValue(5.151034E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAverageReceivedPackets()F", cancellable = true)
    private void getAverageReceivedPackets_1828446027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828446027L))
            info.setReturnValue(5.151034E8F);
    }

    @Inject(at = @At("HEAD"), method = "connectToLocalServer(Ljava/net/SocketAddress;)Lnet/minecraft/network/Connection;", cancellable = true)
    private static void connectToLocalServer__516246182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-516246182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setListenerForServerboundHandshake(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void setListenerForServerboundHandshake_2130364621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130364621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureSerialization(Lio/netty/channel/ChannelPipeline;Lnet/minecraft/network/protocol/PacketFlow;ZLnet/minecraft/network/BandwidthDebugMonitor;)V", cancellable = true)
    private static void configureSerialization__1415012643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1415012643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureInMemoryPipeline(Lio/netty/channel/ChannelPipeline;Lnet/minecraft/network/protocol/PacketFlow;)V", cancellable = true)
    private static void configureInMemoryPipeline__535216969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-535216969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configurePacketHandler(Lio/netty/channel/ChannelPipeline;)V", cancellable = true)
    private void configurePacketHandler_684559374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(684559374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runOnceConnected(Ljava/util/function/Consumer;)V", cancellable = true)
    private void runOnceConnected_1511729029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511729029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flushChannel()V", cancellable = true)
    private void flushChannel_419140191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(419140191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromChannel(Lio/netty/channel/Channel;Lnet/minecraft/network/protocol/PacketFlow;Lnet/minecraft/util/debugchart/LocalSampleLogger;)Lnet/minecraft/network/Connection;", cancellable = true)
    private static void fromChannel__861026933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861026933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConnecting()Z", cancellable = true)
    private void isConnecting_1932964128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932964128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getReceiving()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void getReceiving__161454579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161454579L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.SERVERBOUND);
    }

    @Inject(at = @At("HEAD"), method = "setBandwidthLogger(Lnet/minecraft/util/debugchart/LocalSampleLogger;)V", cancellable = true)
    private void setBandwidthLogger_391656762(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(391656762L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIntendedProfileId()Ljava/util/UUID;", cancellable = true)
    private void getIntendedProfileId__897506239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897506239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIntendedProfileId(Ljava/util/UUID;)V", cancellable = true)
    private void setIntendedProfileId_795436571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(795436571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPacketListener()Lnet/minecraft/network/PacketListener;", cancellable = true)
    private void getPacketListener__1715181638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715181638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisconnectionDetails()Lnet/minecraft/network/DisconnectionDetails;", cancellable = true)
    private void getDisconnectionDetails__522369158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522369158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initiateServerboundStatusConnection(Ljava/lang/String;ILnet/minecraft/network/protocol/status/ClientStatusPacketListener;)V", cancellable = true)
    private void initiateServerboundStatusConnection_125921850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(125921850L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMemoryConnection()Z", cancellable = true)
    private void isMemoryConnection__1450860295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450860295L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setupOutboundProtocol(Lnet/minecraft/network/ProtocolInfo;)V", cancellable = true)
    private void setupOutboundProtocol_475102701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(475102701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupInboundProtocol(Lnet/minecraft/network/ProtocolInfo;Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void setupInboundProtocol__1740276644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1740276644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupCompression(IZ)V", cancellable = true)
    private void setupCompression_29193286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(29193286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setEncryptionKey(Ljavax/crypto/Cipher;Ljavax/crypto/Cipher;)V", cancellable = true)
    private void setEncryptionKey_593465060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(593465060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelActive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelActive_1792624094(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1792624094L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exceptionCaught(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Throwable;)V", cancellable = true)
    private void exceptionCaught_21253003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(21253003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelInactive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelInactive_302505305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(302505305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connectToServer(Ljava/net/InetSocketAddress;Lnet/minecraft/server/network/EventLoopGroupHolder;Lnet/minecraft/util/debugchart/LocalSampleLogger;)Lnet/minecraft/network/Connection;", cancellable = true)
    private static void connectToServer__1792192327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792192327L))
            info.setReturnValue(null);
    }


}
