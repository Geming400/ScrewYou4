package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.statue.CopperGolemStatueModel.class)
public class CopperGolemStatueModel1540126406Mixin {
        @Inject(at = @At("HEAD"), method = "setupAnim(Lnet/minecraft/util/Unit;)V", cancellable = true)
    private void setupAnim_1677624083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1677624083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setupAnim(Ljava/lang/Object;)V", cancellable = true)
    private void setupAnim__1369204011(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1369204011L))
            info.cancel();
    }


}
