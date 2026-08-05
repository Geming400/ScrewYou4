package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundContainerButtonClickPacket.class)
public class ServerboundContainerButtonClickPacket1667507898Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1823375488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823375488L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_758881630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(758881630L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1857035873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857035873L))
            info.setReturnValue("(*\u346EgLn,e9xa\u161DD!APK%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2070107307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070107307L))
            info.setReturnValue(1432618185);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1371796035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1371796035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1990099224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1990099224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerId()I", cancellable = true)
    private void containerId_757092516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757092516L))
            info.setReturnValue(1521444774);
    }

    @Inject(at = @At("HEAD"), method = "buttonId()I", cancellable = true)
    private void buttonId_228998355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228998355L))
            info.setReturnValue(1554874501);
    }


}
