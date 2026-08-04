package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.BlockOutlineRenderState.class)
public class BlockOutlineRenderState_824388568Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2085066470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2085066470L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__311071408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311071408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_862651309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862651309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1068998312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068998312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void shape__1057281351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057281351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "highContrast()Z", cancellable = true)
    private void highContrast_862667150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862667150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collisionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void collisionShape__1057281351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057281351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interactionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void interactionShape__1057281351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057281351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTranslucent()Z", cancellable = true)
    private void isTranslucent_862667150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862667150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "occlusionShape()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void occlusionShape__1057281351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1057281351L))
            info.setReturnValue(null);
    }


}
