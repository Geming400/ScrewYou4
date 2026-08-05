package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.StructureGridSpawner.class)
public class StructureGridSpawner1874274033Mixin {
        @Inject(at = @At("HEAD"), method = "spawnStructure(Lnet/minecraft/gametest/framework/GameTestInfo;)Ljava/util/Optional;", cancellable = true)
    private void spawnStructure_725882402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725882402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onBatchStart(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void onBatchStart_895864693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(895864693L))
            info.cancel();
    }


}
