package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LevelEventHandler.class)
public class LevelEventHandler452541894Mixin {
        @Inject(at = @At("HEAD"), method = "globalLevelEvent(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void globalLevelEvent_1391534416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391534416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levelEvent(ILnet/minecraft/core/BlockPos;I)V", cancellable = true)
    private void levelEvent__2139048243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2139048243L))
            info.cancel();
    }


}
