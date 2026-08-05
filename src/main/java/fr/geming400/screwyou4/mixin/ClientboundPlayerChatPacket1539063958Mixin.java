package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerChatPacket.class)
public class ClientboundPlayerChatPacket1539063958Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_294579175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(294579175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1577326204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577326204L))
            info.setReturnValue(-1562872639);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__139961130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139961130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1370391079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370391079L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_403603983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403603983L))
            info.setReturnValue("cC\uF9E3G..+\u0EDC]#\u6E2A\u96DB\uB89AMb?\u3A914B6h0w;J\u07659\u76C8_s &aJY-<Y3(\u2E50xAR\u50286\u019B8 D<#PGBilUu;\u2D11EM8h;.B\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1577326700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577326700L))
            info.setReturnValue(-190088563);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__2077834425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2077834425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1736571492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1736571492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "body()Lnet/minecraft/network/chat/SignedMessageBody$Packed;", cancellable = true)
    private void body_1533879049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533879049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sender()Ljava/util/UUID;", cancellable = true)
    private void sender_1950198441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950198441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filterMask()Lnet/minecraft/network/chat/FilterMask;", cancellable = true)
    private void filterMask_1208768436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1208768436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSkippable()Z", cancellable = true)
    private void isSkippable_1577342541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577342541L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "chatType()Lnet/minecraft/network/chat/ChatType$Bound;", cancellable = true)
    private void chatType__2142744628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142744628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "globalIndex()I", cancellable = true)
    private void globalIndex_1577326204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577326204L))
            info.setReturnValue(-1553351639);
    }

    @Inject(at = @At("HEAD"), method = "unsignedContent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void unsignedContent__637845207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637845207L))
            info.setReturnValue(null);
    }


}
