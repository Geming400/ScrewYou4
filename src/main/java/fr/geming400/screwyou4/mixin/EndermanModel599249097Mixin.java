package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.enderman.EndermanModel.class)
public class EndermanModel599249097Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1984885976(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984885976L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_1892575419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1892575419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;)V", cancellable = true)
    private void setupAnim__228390128(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-228390128L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__114883067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114883067L))
            info.setReturnValue(null);
    }


}
