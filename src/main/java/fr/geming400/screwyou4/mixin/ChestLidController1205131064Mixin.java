package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ChestLidController.class)
public class ChestLidController1205131064Mixin {
        @Inject(at = @At("HEAD"), method = "shouldBeOpen(Z)V", cancellable = true)
    private void shouldBeOpen__1860219403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1860219403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickLid()V", cancellable = true)
    private void tickLid_1243405803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1243405803L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOpenness(F)F", cancellable = true)
    private void getOpenness__1878705199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878705199L))
            info.setReturnValue(9.673692E8F);
    }


}
