package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SegmentedAnglePrecision.class)
public class SegmentedAnglePrecision2074192559Mixin {
        @Inject(at = @At("HEAD"), method = "toDegrees(I)F", cancellable = true)
    private void toDegrees__1006873141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006873141L))
            info.setReturnValue(4.761609E8F);
    }

    @Inject(at = @At("HEAD"), method = "normalize(I)I", cancellable = true)
    private void normalize__1006870258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006870258L))
            info.setReturnValue(-1785690508);
    }

    @Inject(at = @At("HEAD"), method = "getMask()I", cancellable = true)
    private void getMask_2112454805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112454805L))
            info.setReturnValue(710730739);
    }

    @Inject(at = @At("HEAD"), method = "fromDegrees(F)I", cancellable = true)
    private void fromDegrees__1009640821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009640821L))
            info.setReturnValue(1443186324);
    }

    @Inject(at = @At("HEAD"), method = "toDegreesWithTurns(I)F", cancellable = true)
    private void toDegreesWithTurns__1006873141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006873141L))
            info.setReturnValue(4.761609E8F);
    }

    @Inject(at = @At("HEAD"), method = "fromDegreesWithTurns(F)I", cancellable = true)
    private void fromDegreesWithTurns__1009640821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1009640821L))
            info.setReturnValue(1443186324);
    }

    @Inject(at = @At("HEAD"), method = "fromDirection(Lnet/minecraft/core/Direction;)I", cancellable = true)
    private void fromDirection_954253985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(954253985L))
            info.setReturnValue(-1096133682);
    }

    @Inject(at = @At("HEAD"), method = "isSameAxis(II)Z", cancellable = true)
    private void isSameAxis_1078316934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078316934L))
            info.setReturnValue(true);
    }


}
