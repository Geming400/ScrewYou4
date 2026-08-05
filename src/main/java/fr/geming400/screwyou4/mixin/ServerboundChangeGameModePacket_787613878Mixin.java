package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChangeGameModePacket.class)
public class ServerboundChangeGameModePacket_787613878Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void mode__607832421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607832421L))
            info.setReturnValue(net.minecraft.world.level.GameType.ADVENTURE);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__891411211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891411211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2121841160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121841160L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__347846098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347846098L))
            info.setReturnValue("䄈!zledl^Xov.=[炟ma<@qⱡgE37Xda^JXࠌah鴉뤩");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_825876619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825876619L))
            info.setReturnValue(1751325742);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1465682790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1465682790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1081008117(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1081008117L))
            info.cancel();
    }


}
