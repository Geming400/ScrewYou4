package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.PackedClockStates.class)
public class PackedClockStates2085071738Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__824383299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824383299L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_949611763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949611763L))
            info.setReturnValue("'\u754BFU6W\uFAAFDmpm2F|Fp./fQ-kJ9>\u7EC7DG<(seV3gX)\u9D67\u9173g<*&lV\u3D2BBJu+M8/2j\u99A4jpxNE2b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2123334480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2123334480L))
            info.setReturnValue(873260190);
    }

    @Inject(at = @At("HEAD"), method = "clocks()Ljava/util/Map;", cancellable = true)
    private void clocks_80448098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80448098L))
            info.setReturnValue(null);
    }


}
