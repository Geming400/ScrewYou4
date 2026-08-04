package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndSpikeFeature.EndSpike.class)
public class EndSpike_1432008350Mixin {
        @Inject(at = @At("HEAD"), method = "isCenterWithinChunk(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isCenterWithinChunk_1600778792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600778792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_1470270595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470270595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenterX()I", cancellable = true)
    private void getCenterX_1470270595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470270595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCenterZ()I", cancellable = true)
    private void getCenterZ_1470270595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470270595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRadius()I", cancellable = true)
    private void getRadius_1470270595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470270595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isGuarded()Z", cancellable = true)
    private void isGuarded_1470286932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470286932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTopBoundingBox()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getTopBoundingBox_11350997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11350997L))
            info.setReturnValue(null);
    }


}
