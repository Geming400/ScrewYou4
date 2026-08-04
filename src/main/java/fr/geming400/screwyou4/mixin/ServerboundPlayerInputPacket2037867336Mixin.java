package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerInputPacket.class)
public class ServerboundPlayerInputPacket2037867336Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_358842248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358842248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__871587701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871587701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_902407361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902407361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2076130078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076130078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/entity/player/Input;", cancellable = true)
    private void input__789949131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-789949131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1579031047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1579031047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_169245342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169245342L))
            info.cancel();
    }


}
