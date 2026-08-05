package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.panda.PandaModel.class)
public class PandaModel1722153313Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__181501296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181501296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/PandaRenderState;)V", cancellable = true)
    private void setupAnim_1402350794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1402350794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim__1869093292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1869093292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1889165438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1889165438L))
            info.cancel();
    }


}
