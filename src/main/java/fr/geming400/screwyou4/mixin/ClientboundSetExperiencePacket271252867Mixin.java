package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetExperiencePacket.class)
public class ClientboundSetExperiencePacket271252867Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_427120457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(427120457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1320224727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1320224727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__24458996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-24458996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExperienceProgress()F", cancellable = true)
    private void getExperienceProgress_1190704281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190704281L))
            info.setReturnValue(5.331025E8F);
    }

    @Inject(at = @At("HEAD"), method = "getExperienceLevel()I", cancellable = true)
    private void getExperienceLevel_2050260965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2050260965L))
            info.setReturnValue(12698413);
    }

    @Inject(at = @At("HEAD"), method = "getTotalExperience()I", cancellable = true)
    private void getTotalExperience__334301999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-334301999L))
            info.setReturnValue(-1690122250);
    }


}
