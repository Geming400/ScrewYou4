package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerAbilitiesPacket.class)
public class ServerboundPlayerAbilitiesPacket_1409588554Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1565456143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565456143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1113876690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1113876690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_2046948727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2046948727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isFlying()Z", cancellable = true)
    private void isFlying_2126560839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126560839L))
            info.setReturnValue(true);
    }


}
