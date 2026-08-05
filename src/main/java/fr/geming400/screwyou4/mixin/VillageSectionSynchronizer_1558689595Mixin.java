package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.TrackingDebugSynchronizer.VillageSectionSynchronizer.class)
public class VillageSectionSynchronizer_1558689595Mixin {
        @Inject(at = @At("HEAD"), method = "onPoiRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onPoiRemoved__2042904763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2042904763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPoiAdded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;)V", cancellable = true)
    private void onPoiAdded_1136457153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1136457153L))
            info.cancel();
    }


}
