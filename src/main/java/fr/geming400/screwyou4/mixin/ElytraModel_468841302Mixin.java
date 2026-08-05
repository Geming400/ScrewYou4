package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.equipment.ElytraModel.class)
public class ElytraModel_468841302Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1854478180(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1854478180L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1762038663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1762038663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createLayer__245290863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245290863L))
            info.setReturnValue(null);
    }


}
