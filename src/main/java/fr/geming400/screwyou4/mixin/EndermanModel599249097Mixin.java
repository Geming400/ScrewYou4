package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.enderman.EndermanModel.class)
public class EndermanModel599249097Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1304405512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304405512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_184163149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(184163149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1282897642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1282897642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EndermanRenderState;)V", cancellable = true)
    private void setupAnim__1936802398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1936802398L))
            info.cancel();
    }


}
