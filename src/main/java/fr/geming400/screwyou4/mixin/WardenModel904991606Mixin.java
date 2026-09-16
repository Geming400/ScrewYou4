package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.warden.WardenModel.class)
public class WardenModel904991606Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__998663003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998663003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBioluminescentLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBioluminescentLayer_199467632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199467632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createHeartLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHeartLayer__210945735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210945735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTendrilsLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createTendrilsLayer_1518100226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518100226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPulsatingSpotsLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createPulsatingSpotsLayer_607551577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607551577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/WardenRenderState;)V", cancellable = true)
    private void setupAnim__381183006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-381183006L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1588640151(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1588640151L))
            info.cancel();
    }


}
