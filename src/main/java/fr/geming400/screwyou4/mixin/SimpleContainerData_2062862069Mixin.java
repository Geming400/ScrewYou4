package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.SimpleContainerData.class)
public class SimpleContainerData_2062862069Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get_1593947177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593947177L))
            info.setReturnValue(1513876093);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set__1918972379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1918972379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount_676943137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676943137L))
            info.setReturnValue(358616667);
    }


}
