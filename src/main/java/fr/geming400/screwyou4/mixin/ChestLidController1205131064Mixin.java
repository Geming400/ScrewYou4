package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.ChestLidController.class)
public class ChestLidController1205131064Mixin {
        @Inject(at = @At("HEAD"), method = "getOpenness(F)F", cancellable = true)
    private void getOpenness__1365801048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365801048L))
            info.setReturnValue(4.078434E8F);
    }

    @Inject(at = @At("HEAD"), method = "tickLid()V", cancellable = true)
    private void tickLid_2102820993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2102820993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldBeOpen(Z)V", cancellable = true)
    private void shouldBeOpen__1453966667(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1453966667L))
            info.cancel();
    }


}
