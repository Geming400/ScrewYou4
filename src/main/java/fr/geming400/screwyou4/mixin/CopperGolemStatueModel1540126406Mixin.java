package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.statue.CopperGolemStatueModel.class)
public class CopperGolemStatueModel1540126406Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/util/Unit;)V", cancellable = true)
    private void setupAnim_2004150465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2004150465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__2071192345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071192345L))
            info.cancel();
    }


}
