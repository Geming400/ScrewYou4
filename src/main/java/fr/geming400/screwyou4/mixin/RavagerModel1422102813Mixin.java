package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.ravager.RavagerModel.class)
public class RavagerModel1422102813Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__481551796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481551796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_2105751358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2105751358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;)V", cancellable = true)
    private void setupAnim__1385626202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1385626202L))
            info.cancel();
    }


}
