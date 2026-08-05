package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.chest.ChestModel.class)
public class ChestModel7996294Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Float;)V", cancellable = true)
    private void setupAnim__818747384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-818747384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1393633173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1393633173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSingleBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSingleBodyLayer__706135870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706135870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDoubleBodyRightLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createDoubleBodyRightLayer__706135870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706135870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDoubleBodyLeftLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createDoubleBodyLeftLayer__706135870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706135870L))
            info.setReturnValue(null);
    }


}
