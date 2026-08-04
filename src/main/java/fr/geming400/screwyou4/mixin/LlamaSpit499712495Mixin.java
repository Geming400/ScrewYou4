package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.LlamaSpit.class)
public class LlamaSpit499712495Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_537987234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(537987234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__689076195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-689076195L))
            info.cancel();
    }


}
