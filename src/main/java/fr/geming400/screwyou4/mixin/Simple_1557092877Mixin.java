package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.Model.Simple.class)
public class Simple_1557092877Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/util/Unit;)V", cancellable = true)
    private void setupAnim_2021116935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021116935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2054225875(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2054225875L))
            info.cancel();
    }


}
