package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerChatPacket.class)
public class ClientboundPlayerChatPacket1539063958Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_1271118383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271118383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index__2061786902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061786902L))
            info.setReturnValue(-1084983550);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1694931548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694931548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_630437690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630437690L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1985479813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985479813L))
            info.setReturnValue("g\u2C5E+Vv.\u15ECV6\u13CD|n\u3652Wgof_C<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2096416049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096416049L))
            info.setReturnValue(1528308675);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1243352095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1243352095L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__52413636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-52413636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "body()Lnet/minecraft/network/chat/SignedMessageBody$Packed;", cancellable = true)
    private void body_2066590631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066590631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalIndex()I", cancellable = true)
    private void globalIndex__1639149331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639149331L))
            info.setReturnValue(438827953);
    }

    @Inject(at = @At("HEAD"), method = "unsignedContent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void unsignedContent_2100028397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100028397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatType()Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private void chatType_1550742234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1550742234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_1203593548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203593548L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "filterMask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void filterMask_1936564912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936564912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sender()Ljava/util/UUID;", cancellable = true)
    private void sender_1658296414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658296414L))
            info.setReturnValue(null);
    }


}
