package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.CopperGolemStatueSpecialRenderer.Unbaked.class)
public class Unbaked1522502459Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1036611113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1036611113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1386952578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386952578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_387042484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(387042484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1560765201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1560765201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__165520401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-165520401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/CopperGolemStatueSpecialRenderer;", cancellable = true)
    private void bake_906528125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906528125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__920564094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-920564094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private void pose_1350762718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350762718L))
            info.setReturnValue(null);
    }


}
