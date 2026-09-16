package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.PackedClockStates.class)
public class PackedClockStates2085071738Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1176445470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176445470L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1439472033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439472033L))
            info.setReturnValue("qp\uB596;ssrsfbBjy?5?R\"_m`9'S_n!=z\uD73C`+KCkL>T\u30B9;d1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1652543467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652543467L))
            info.setReturnValue(-1451645373);
    }

    @Inject(at = @At("HEAD"), method = "clocks()Ljava/util/Map;", cancellable = true)
    private void clocks__151248867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151248867L))
            info.setReturnValue(null);
    }


}
