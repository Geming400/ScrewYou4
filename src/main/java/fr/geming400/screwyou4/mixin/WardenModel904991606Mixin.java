package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.warden.WardenModel.class)
public class WardenModel904991606Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_190859442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190859442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTendrilsLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createTendrilsLayer_190859442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190859442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBioluminescentLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBioluminescentLayer_190859442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190859442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHeartLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHeartLayer_190859442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190859442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPulsatingSpotsLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createPulsatingSpotsLayer_190859442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190859442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2004338811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2004338811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/WardenRenderState;)V", cancellable = true)
    private void setupAnim_755789008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(755789008L))
            info.cancel();
    }


}
