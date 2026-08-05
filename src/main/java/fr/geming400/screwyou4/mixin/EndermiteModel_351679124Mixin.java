package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.endermite.EndermiteModel.class)
public class EndermiteModel_351679124Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1551975486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551975486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim__971345219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-971345219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1035327668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1035327668L))
            info.cancel();
    }


}
