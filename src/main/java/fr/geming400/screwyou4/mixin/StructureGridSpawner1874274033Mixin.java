package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.StructureGridSpawner.class)
public class StructureGridSpawner1874274033Mixin {
        @Inject(at = @At("HEAD"), method = "onBatchStart(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void onBatchStart_547991118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(547991118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnStructure(Lnet/minecraft/gametest/framework/GameTestInfo;)Ljava/util/Optional;", cancellable = true)
    private void spawnStructure__1200876822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200876822L))
            info.setReturnValue(null);
    }


}
