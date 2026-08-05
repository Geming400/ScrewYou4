package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CarvingContext.class)
public class CarvingContext_1074627317Mixin {
        @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState_1635072059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1635072059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_1084104059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084104059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topMaterial(Ljava/util/function/Function;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/core/BlockPos;Z)Ljava/util/Optional;", cancellable = true)
    private void topMaterial__159025424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159025424L))
            info.setReturnValue(null);
    }


}
