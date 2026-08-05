package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.LlamaSpit.class)
public class LlamaSpit499712495Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_370028837(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(370028837L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_1511373212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1511373212L))
            info.cancel();
    }


}
