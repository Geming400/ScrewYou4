package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetExperiencePacket.class)
public class ClientboundSetExperiencePacket271252867Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1407772221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407772221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_468760401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(468760401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_949321780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(949321780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalExperience()I", cancellable = true)
    private void getTotalExperience_309515113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309515113L))
            info.setReturnValue(1114708106);
    }

    @Inject(at = @At("HEAD"), method = "getExperienceProgress()F", cancellable = true)
    private void getExperienceProgress_309512230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309512230L))
            info.setReturnValue(7.589391E8F);
    }

    @Inject(at = @At("HEAD"), method = "getExperienceLevel()I", cancellable = true)
    private void getExperienceLevel_309515113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(309515113L))
            info.setReturnValue(1114708106);
    }


}
