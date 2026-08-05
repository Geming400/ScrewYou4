package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer.FoliageAttachment.class)
public class FoliageAttachment_1755627994Mixin {
        @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__525148282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-525148282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTrunk()Z", cancellable = true)
    private void doubleTrunk_498897165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498897165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "radiusOffset()I", cancellable = true)
    private void radiusOffset__1388567782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388567782L))
            info.setReturnValue(-1036339532);
    }


}
