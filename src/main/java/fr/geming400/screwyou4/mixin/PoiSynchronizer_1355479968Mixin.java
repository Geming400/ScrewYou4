package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.TrackingDebugSynchronizer.PoiSynchronizer.class)
public class PoiSynchronizer_1355479968Mixin {
        @Inject(at = @At("HEAD"), method = "onPoiTicketCountChanged(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onPoiTicketCountChanged__444527599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-444527599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPoiRemoved(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onPoiRemoved_2048852906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2048852906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPoiAdded(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;)V", cancellable = true)
    private void onPoiAdded_933247526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(933247526L))
            info.cancel();
    }


}
