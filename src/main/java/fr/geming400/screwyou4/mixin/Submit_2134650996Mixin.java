package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.feature.MovingBlockFeatureRenderer.Submit.class)
public class Submit_2134650996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1226024727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226024727L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1389892776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389892776L))
            info.setReturnValue("T\u2057kn C29)u\uAB55\"I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1602964210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602964210L))
            info.setReturnValue(-1331399386);
    }

    @Inject(at = @At("HEAD"), method = "pose()Lorg/joml/Matrix4fc;", cancellable = true)
    private void pose_409473826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409473826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "movingBlockRenderState()Lnet/minecraft/client/renderer/block/MovingBlockRenderState;", cancellable = true)
    private void movingBlockRenderState_1577833571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577833571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToCameraSq()F", cancellable = true)
    private void distanceToCameraSq__1364849373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364849373L))
            info.setReturnValue(9.324447E8F);
    }

    @Inject(at = @At("HEAD"), method = "featureType()Lnet/minecraft/client/renderer/feature/FeatureRendererType;", cancellable = true)
    private void featureType_1942227241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942227241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "outlineColor()I", cancellable = true)
    private void outlineColor_845149880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(845149880L))
            info.setReturnValue(1587011029);
    }


}
