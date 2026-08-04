package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.endermite.EndermiteModel.class)
public class EndermiteModel_351679124Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__362453041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362453041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)V", cancellable = true)
    private void setupAnim_165626795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(165626795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1737316002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1737316002L))
            info.cancel();
    }


}
