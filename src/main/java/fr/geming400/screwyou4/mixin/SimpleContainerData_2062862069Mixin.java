package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.SimpleContainerData.class)
public class SimpleContainerData_2062862069Mixin {
        @Inject(at = @At("HEAD"), method = "get(I)I", cancellable = true)
    private void get__1018200749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018200749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(II)V", cancellable = true)
    private void set_1066982599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066982599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCount()I", cancellable = true)
    private void getCount_2101124314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101124314L))
            info.setReturnValue(null);
    }


}
