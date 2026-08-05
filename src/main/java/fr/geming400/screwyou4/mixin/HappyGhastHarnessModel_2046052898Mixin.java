package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.ghast.HappyGhastHarnessModel.class)
public class HappyGhastHarnessModel_2046052898Mixin {
        @Inject(at = @At("HEAD"), method = "createHarnessLayer(Z)Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createHarnessLayer_1337118998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337118998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1565265854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1565265854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HappyGhastRenderState;)V", cancellable = true)
    private void setupAnim_1053308777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1053308777L))
            info.cancel();
    }


}
