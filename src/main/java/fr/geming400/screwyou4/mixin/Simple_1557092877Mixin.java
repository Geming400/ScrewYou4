package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.Model.Simple.class)
public class Simple_1557092877Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/util/Unit;)V", cancellable = true)
    private void setupAnim_1694590553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1694590553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1352237541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1352237541L))
            info.cancel();
    }


}
