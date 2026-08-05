package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.GlobalSettingsUniform.class)
public class GlobalSettingsUniform_1185492672Mixin {
        @Inject(at = @At("HEAD"), method = "update(IIDJLnet/minecraft/client/DeltaTracker;ILnet/minecraft/world/phys/Vec3;Z)V", cancellable = true)
    private void update__440375041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-440375041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__929082758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-929082758L))
            info.cancel();
    }


}
