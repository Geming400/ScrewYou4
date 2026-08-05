package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.breeze.BreezeModel.class)
public class BreezeModel709968640Mixin {
        @Inject(at = @At("HEAD"), method = "head()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void head__2059775771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059775771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEyesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyesLayer__4163524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4163524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__4163524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4163524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWindLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createWindLayer__4163524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4163524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wind()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void wind__2059775771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059775771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2095605519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2095605519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;)V", cancellable = true)
    private void setupAnim_1124980816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1124980816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "eyes()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void eyes__2059775771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059775771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rods()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void rods__2059775771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059775771L))
            info.setReturnValue(null);
    }


}
