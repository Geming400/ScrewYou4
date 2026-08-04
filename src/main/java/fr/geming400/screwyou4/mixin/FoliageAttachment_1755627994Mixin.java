package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer.FoliageAttachment.class)
public class FoliageAttachment_1755627994Mixin {
        @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__137758886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137758886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radiusOffset()I", cancellable = true)
    private void radiusOffset_1793890239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793890239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doubleTrunk()Z", cancellable = true)
    private void doubleTrunk_1793906576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1793906576L))
            info.setReturnValue(null);
    }


}
