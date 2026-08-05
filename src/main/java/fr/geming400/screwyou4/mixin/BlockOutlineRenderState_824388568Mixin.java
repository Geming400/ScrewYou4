package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.BlockOutlineRenderState.class)
public class BlockOutlineRenderState_824388568Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__84237701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84237701L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1594812092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1594812092L))
            info.setReturnValue("s41}'n@Z'$ux/AD#)wp%|_&@!3Ia\u28B3CHn\u2004\uCD81`bTT:frf%d[\u9B7Ey.MRhp:1-rl_/R");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1381740658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381740658L))
            info.setReturnValue(1737429171);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1456387708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456387708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void shape__175090598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-175090598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highContrast()Z", cancellable = true)
    private void highContrast__1062549174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062549174L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "occlusionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void occlusionShape__42427187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42427187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collisionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void collisionShape_1662253128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662253128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTranslucent()Z", cancellable = true)
    private void isTranslucent__427905249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427905249L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "interactionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void interactionShape__1268581016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268581016L))
            info.setReturnValue(null);
    }


}
