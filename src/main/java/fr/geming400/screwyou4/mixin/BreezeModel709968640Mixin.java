package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.breeze.BreezeModel.class)
public class BreezeModel709968640Mixin {
        @Inject(at = @At("HEAD"), method = "head()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void head__1275623675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1275623675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rods()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void rods_696481753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696481753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyes()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void eyes_731712579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(731712579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wind()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void wind_1774301149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1774301149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1393617185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1393617185L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;)V", cancellable = true)
    private void setupAnim__11991198(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-11991198L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWindLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createWindLayer__1638456311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1638456311L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1193685969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193685969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEyesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyesLayer__505523857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505523857L))
            info.setReturnValue(null);
    }


}
