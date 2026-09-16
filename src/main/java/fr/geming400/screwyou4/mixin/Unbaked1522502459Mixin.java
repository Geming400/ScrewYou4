package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.CopperGolemStatueSpecialRenderer.Unbaked.class)
public class Unbaked1522502459Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_127251805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127251805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_613876191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613876191L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2002041312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2002041312L))
            info.setReturnValue("WD`kI\u834BK+R\u78FFP+A[nH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2079854550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2079854550L))
            info.setReturnValue(-13353283);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1599662456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599662456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/CopperGolemStatueSpecialRenderer;", cancellable = true)
    private void bake__107666794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107666794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private void pose_1418560109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418560109L))
            info.setReturnValue(net.minecraft.world.level.block.CopperGolemStatueBlock.Pose.STAR);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__1941263203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941263203L))
            info.setReturnValue(null);
    }


}
