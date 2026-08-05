package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetTestBlockPacket.class)
public class ServerboundSetTestBlockPacket_812526498Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private void mode_700434385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(700434385L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.TestBlockMode.START);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__866498591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866498591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2096928540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096928540L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__322933478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322933478L))
            info.setReturnValue("!'Y<QV63H7l먝ަ0(=)3!`]E%c!쭏韮偠뤮!RA|%=x<$Iwy衘jၛ[ 9VC0㧚^<73");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_850789239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850789239L))
            info.setReturnValue(-1442142072);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void position__1080860382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080860382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/lang/String;", cancellable = true)
    private void message__322933974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322933974L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1056095497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1056095497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1490595410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1490595410L))
            info.cancel();
    }


}
