package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.silverfish.SilverfishModel.class)
public class SilverfishModel_671371210Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_485318881(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(485318881L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2057008088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2057008088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__42760955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-42760955L))
            info.setReturnValue(null);
    }


}
