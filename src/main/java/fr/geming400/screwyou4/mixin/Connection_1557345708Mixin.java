package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.Connection.class)
public class Connection_1557345708Mixin {
        @Inject(at = @At("HEAD"), method = "setReadOnly()V", cancellable = true)
    private void setReadOnly_1595620446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595620446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connect(Ljava/net/InetSocketAddress;Lnet/minecraft/server/network/EventLoopGroupHolder;Lnet/minecraft/network/Connection;)Lio/netty/channel/ChannelFuture;", cancellable = true)
    private static void connect_654311905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654311905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void disconnect__343833230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-343833230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "disconnect(Lnet/minecraft/network/DisconnectionDetails;)V", cancellable = true)
    private void disconnect__530524606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-530524606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isConnected()Z", cancellable = true)
    private void isConnected_1595624290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595624290L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;)V", cancellable = true)
    private void send__2076788734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2076788734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/network/protocol/Packet;)V", cancellable = true)
    private void send_1713010059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1713010059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "send(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;Z)V", cancellable = true)
    private void send_611427652(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(611427652L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRemoteAddress()Ljava/net/SocketAddress;", cancellable = true)
    private void getRemoteAddress_1655479831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655479831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1595620446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595620446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connectToServer(Ljava/net/InetSocketAddress;Lnet/minecraft/server/network/EventLoopGroupHolder;Lnet/minecraft/util/debugchart/LocalSampleLogger;)Lnet/minecraft/network/Connection;", cancellable = true)
    private static void connectToServer_896342545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(896342545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLoggableAddress(Z)Ljava/lang/String;", cancellable = true)
    private void getLoggableAddress__150742422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150742422L))
            info.setReturnValue("[\u2B5FrE\u35686hA,z\u4E33&+\uA113I?+A7WkVEc\u57A8Q_E?FM0S\"V;KN<6k+>-");
    }

    @Inject(at = @At("HEAD"), method = "getAverageReceivedPackets()F", cancellable = true)
    private void getAverageReceivedPackets_1595605070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595605070L))
            info.setReturnValue(2.203127E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAverageSentPackets()F", cancellable = true)
    private void getAverageSentPackets_1595605070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595605070L))
            info.setReturnValue(2.203127E8F);
    }

    @Inject(at = @At("HEAD"), method = "channelInactive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelInactive__1141008089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1141008089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "channelActive(Lio/netty/channel/ChannelHandlerContext;)V", cancellable = true)
    private void channelActive__1141008089(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1141008089L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "exceptionCaught(Lio/netty/channel/ChannelHandlerContext;Ljava/lang/Throwable;)V", cancellable = true)
    private void exceptionCaught__473665376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-473665376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupInboundProtocol(Lnet/minecraft/network/ProtocolInfo;Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void setupInboundProtocol_661060560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(661060560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupOutboundProtocol(Lnet/minecraft/network/ProtocolInfo;)V", cancellable = true)
    private void setupOutboundProtocol__284836206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-284836206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMemoryConnection()Z", cancellable = true)
    private void isMemoryConnection_1595624290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595624290L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setEncryptionKey(Ljavax/crypto/Cipher;Ljavax/crypto/Cipher;)V", cancellable = true)
    private void setEncryptionKey_2024297662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2024297662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupCompression(IZ)V", cancellable = true)
    private void setupCompression_577166095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(577166095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleDisconnection()V", cancellable = true)
    private void handleDisconnection_1595620446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595620446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "connectToLocalServer(Ljava/net/SocketAddress;)Lnet/minecraft/network/Connection;", cancellable = true)
    private static void connectToLocalServer__671207727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-671207727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initiateServerboundStatusConnection(Ljava/lang/String;ILnet/minecraft/network/protocol/status/ClientStatusPacketListener;)V", cancellable = true)
    private void initiateServerboundStatusConnection__1058803608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1058803608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initiateServerboundPlayConnection(Ljava/lang/String;ILnet/minecraft/network/ProtocolInfo;Lnet/minecraft/network/ProtocolInfo;Lnet/minecraft/network/ClientboundPacketListener;Z)V", cancellable = true)
    private void initiateServerboundPlayConnection__1389294046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1389294046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "initiateServerboundPlayConnection(Ljava/lang/String;ILnet/minecraft/network/protocol/login/ClientLoginPacketListener;)V", cancellable = true)
    private void initiateServerboundPlayConnection__1251952374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1251952374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setListenerForServerboundHandshake(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void setListenerForServerboundHandshake__2059681636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2059681636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getReceiving()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void getReceiving__34395273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34395273L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }

    @Inject(at = @At("HEAD"), method = "fromChannel(Lio/netty/channel/Channel;Lnet/minecraft/network/protocol/PacketFlow;Lnet/minecraft/util/debugchart/LocalSampleLogger;)Lnet/minecraft/network/Connection;", cancellable = true)
    private static void fromChannel_1497148178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497148178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPacketListener()Lnet/minecraft/network/PacketListener;", cancellable = true)
    private void getPacketListener_160773096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160773096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntendedProfileId()Ljava/util/UUID;", cancellable = true)
    private void getIntendedProfileId_1968480190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968480190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBandwidthLogger(Lnet/minecraft/util/debugchart/LocalSampleLogger;)V", cancellable = true)
    private void setBandwidthLogger__6034021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-6034021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isConnecting()Z", cancellable = true)
    private void isConnecting_1595624290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595624290L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "configureInMemoryPipeline(Lio/netty/channel/ChannelPipeline;Lnet/minecraft/network/protocol/PacketFlow;)V", cancellable = true)
    private static void configureInMemoryPipeline__988374551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-988374551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setIntendedProfileId(Ljava/util/UUID;)V", cancellable = true)
    private void setIntendedProfileId_1199789618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199789618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configurePacketHandler(Lio/netty/channel/ChannelPipeline;)V", cancellable = true)
    private void configurePacketHandler_1322952682(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1322952682L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisconnectionDetails()Lnet/minecraft/network/DisconnectionDetails;", cancellable = true)
    private void getDisconnectionDetails__354257842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354257842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "runOnceConnected(Ljava/util/function/Consumer;)V", cancellable = true)
    private void runOnceConnected__2056605176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2056605176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flushChannel()V", cancellable = true)
    private void flushChannel_1595620446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1595620446L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "configureSerialization(Lio/netty/channel/ChannelPipeline;Lnet/minecraft/network/protocol/PacketFlow;ZLnet/minecraft/network/BandwidthDebugMonitor;)V", cancellable = true)
    private static void configureSerialization__1231544269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1231544269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSending()Lnet/minecraft/network/protocol/PacketFlow;", cancellable = true)
    private void getSending__34395273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34395273L))
            info.setReturnValue(net.minecraft.network.protocol.PacketFlow.CLIENTBOUND);
    }


}
