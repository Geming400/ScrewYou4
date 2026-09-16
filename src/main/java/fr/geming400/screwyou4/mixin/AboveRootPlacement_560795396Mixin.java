package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.rootplacers.AboveRootPlacement.class)
public class AboveRootPlacement_560795396Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__347830873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347830873L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1331218920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331218920L))
            info.setReturnValue("MbxNy3J6C=$\"Q\u9D3Bnv/,'*!/>[ps]u\u2919ur}@C%UCT3I\"YY|Z\u99D39:|UUk0J\"gtct77H:]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1118147486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1118147486L))
            info.setReturnValue(603176379);
    }

    @Inject(at = @At("HEAD"), method = "aboveRootProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void aboveRootProvider_1838857582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1838857582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aboveRootPlacementChance()F", cancellable = true)
    private void aboveRootPlacementChance_354409356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(354409356L))
            info.setReturnValue(2.34446E7F);
    }


}
