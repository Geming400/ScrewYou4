package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Column.Ray.class)
public class Ray_480670534Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1251093562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251093562L))
            info.setReturnValue("v}X#K%\u700Aq\u5E40<Z&1WX]ur!8\u0489k|\u29D9.lCD(");
    }

    @Inject(at = @At("HEAD"), method = "getFloor()Ljava/util/OptionalInt;", cancellable = true)
    private void getFloor__1597860060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597860060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCeiling()Ljava/util/OptionalInt;", cancellable = true)
    private void getCeiling_966859347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966859347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()Ljava/util/OptionalInt;", cancellable = true)
    private void getHeight__2039232259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2039232259L))
            info.setReturnValue(null);
    }


}
