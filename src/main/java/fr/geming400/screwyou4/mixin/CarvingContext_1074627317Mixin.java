package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.carver.CarvingContext.class)
public class CarvingContext_1074627317Mixin {
        @Inject(at = @At("HEAD"), method = "registryAccess()Lnet/minecraft/core/RegistryAccess;", cancellable = true)
    private void registryAccess_19734106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19734106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomState()Lnet/minecraft/world/level/levelgen/RandomState;", cancellable = true)
    private void randomState__1409179959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1409179959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "topMaterial(Ljava/util/function/Function;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/core/BlockPos;Z)Ljava/util/Optional;", cancellable = true)
    private void topMaterial__89711476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89711476L))
            info.setReturnValue(null);
    }


}
