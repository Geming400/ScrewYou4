package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.silverfish.SilverfishModel.class)
public class SilverfishModel_671371210Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1232283400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232283400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim__651653133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-651653133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1355019754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1355019754L))
            info.cancel();
    }


}
