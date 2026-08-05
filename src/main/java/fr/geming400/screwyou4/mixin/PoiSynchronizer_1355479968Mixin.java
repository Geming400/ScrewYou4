package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.TrackingDebugSynchronizer.PoiSynchronizer.class)
public class PoiSynchronizer_1355479968Mixin {
        @Inject(at = @At("HEAD"), method = "onPoiTicketCountChanged(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onPoiTicketCountChanged__31767563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-31767563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPoiRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onPoiRemoved__31767563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-31767563L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPoiAdded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;)V", cancellable = true)
    private void onPoiAdded_1960204177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1960204177L))
            info.cancel();
    }


}
