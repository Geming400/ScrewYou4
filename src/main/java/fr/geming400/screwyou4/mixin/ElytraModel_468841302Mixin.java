package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.equipment.ElytraModel.class)
public class ElytraModel_468841302Mixin {
        @Inject(at = @At("HEAD"), method = "createLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createLayer__1191285882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191285882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1152489846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1152489846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", cancellable = true)
    private void setupAnim_53626393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(53626393L))
            info.cancel();
    }


}
