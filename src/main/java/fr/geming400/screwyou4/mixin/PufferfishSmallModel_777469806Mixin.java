package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.fish.PufferfishSmallModel.class)
public class PufferfishSmallModel_777469806Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1126184804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1126184804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1461118350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461118350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim__545554537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-545554537L))
            info.cancel();
    }


}
