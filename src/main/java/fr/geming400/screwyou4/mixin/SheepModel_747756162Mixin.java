package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.sheep.SheepModel.class)
public class SheepModel_747756162Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1155898448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155898448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)V", cancellable = true)
    private void setupAnim_1451476852(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1451476852L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim_1431404706(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1431404706L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/SheepRenderState;)V", cancellable = true)
    private void setupAnim__666747029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-666747029L))
            info.cancel();
    }


}
