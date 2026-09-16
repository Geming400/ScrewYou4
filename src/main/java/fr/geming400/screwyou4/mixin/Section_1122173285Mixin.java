package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BeaconBeamOwner.Section.class)
public class Section_1122173285Mixin {
        @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__603443891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603443891L))
            info.setReturnValue(-961351163);
    }

    @Inject(at = @At("HEAD"), method = "getColor()I", cancellable = true)
    private void getColor_2061075901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061075901L))
            info.setReturnValue(-725979964);
    }

    @Inject(at = @At("HEAD"), method = "increaseHeight()V", cancellable = true)
    private void increaseHeight_308224942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308224942L))
            info.cancel();
    }


}
