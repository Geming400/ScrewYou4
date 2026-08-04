package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.EntityRenderState.ShadowPiece.class)
public class ShadowPiece_1500814964Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1408640074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408640074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_365354988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365354988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1539077705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539077705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shapeBelow()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void shapeBelow__380854955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380854955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alpha()F", cancellable = true)
    private void alpha_1539074326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539074326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeZ()F", cancellable = true)
    private void relativeZ_1539074326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539074326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeY()F", cancellable = true)
    private void relativeY_1539074326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539074326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativeX()F", cancellable = true)
    private void relativeX_1539074326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539074326L))
            info.setReturnValue(null);
    }


}
