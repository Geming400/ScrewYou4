package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Column.Ray.class)
public class Ray_480670534Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__654789938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-654789938L))
            info.setReturnValue("坮WU8J;뙙裸I|e?떵v3g(lKnty<HUWiN琚<nY");
    }

    @Inject(at = @At("HEAD"), method = "getHeight()Ljava/util/OptionalInt;", cancellable = true)
    private void getHeight__1689901254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689901254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloor()Ljava/util/OptionalInt;", cancellable = true)
    private void getFloor__1689901254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689901254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCeiling()Ljava/util/OptionalInt;", cancellable = true)
    private void getCeiling__1689901254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689901254L))
            info.setReturnValue(null);
    }


}
