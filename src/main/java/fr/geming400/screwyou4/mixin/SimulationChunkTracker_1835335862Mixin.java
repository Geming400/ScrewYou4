package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.SimulationChunkTracker.class)
public class SimulationChunkTracker_1835335862Mixin {
        @Inject(at = @At("HEAD"), method = "getLevel(Lnet/minecraft/world/level/ChunkPos;)I", cancellable = true)
    private void getLevel_465482361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465482361L))
            info.setReturnValue(902779539);
    }

    @Inject(at = @At("HEAD"), method = "runAllUpdates()V", cancellable = true)
    private void runAllUpdates_2118430484(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2118430484L))
            info.cancel();
    }


}
