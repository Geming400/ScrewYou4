package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.rootplacers.AboveRootPlacement.class)
public class AboveRootPlacement_560795396Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1946307654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946307654L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__574664580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574664580L))
            info.setReturnValue(":");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_599058137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599058137L))
            info.setReturnValue(1972327918);
    }

    @Inject(at = @At("HEAD"), method = "aboveRootProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void aboveRootProvider__1371911106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1371911106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aboveRootPlacementChance()F", cancellable = true)
    private void aboveRootPlacementChance_599054758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599054758L))
            info.setReturnValue(8.077089E8F);
    }


}
