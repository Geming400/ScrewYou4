package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.TrackingDebugSynchronizer.VillageSectionSynchronizer.class)
public class VillageSectionSynchronizer_1558689595Mixin {
        @Inject(at = @At("HEAD"), method = "onPoiRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onPoiRemoved_171442064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(171442064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPoiAdded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;)V", cancellable = true)
    private void onPoiAdded__2131553492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131553492L))
            info.cancel();
    }


}
