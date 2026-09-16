package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SegmentedAnglePrecision.class)
public class SegmentedAnglePrecision2074192559Mixin {
        @Inject(at = @At("HEAD"), method = "toDegrees(I)F", cancellable = true)
    private void toDegrees__1116583689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116583689L))
            info.setReturnValue(7.532639E8F);
    }

    @Inject(at = @At("HEAD"), method = "normalize(I)I", cancellable = true)
    private void normalize_1984201307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984201307L))
            info.setReturnValue(-1140378465);
    }

    @Inject(at = @At("HEAD"), method = "getMask()I", cancellable = true)
    private void getMask_1959747187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959747187L))
            info.setReturnValue(-1319555740);
    }

    @Inject(at = @At("HEAD"), method = "fromDegrees(F)I", cancellable = true)
    private void fromDegrees__823744280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823744280L))
            info.setReturnValue(385397926);
    }

    @Inject(at = @At("HEAD"), method = "fromDegreesWithTurns(F)I", cancellable = true)
    private void fromDegreesWithTurns__1191116002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191116002L))
            info.setReturnValue(-1150541424);
    }

    @Inject(at = @At("HEAD"), method = "toDegreesWithTurns(I)F", cancellable = true)
    private void toDegreesWithTurns__1619209617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619209617L))
            info.setReturnValue(7.532639E8F);
    }

    @Inject(at = @At("HEAD"), method = "fromDirection(Lnet/minecraft/core/Direction;)I", cancellable = true)
    private void fromDirection__1895438452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895438452L))
            info.setReturnValue(-1410992531);
    }

    @Inject(at = @At("HEAD"), method = "isSameAxis(II)Z", cancellable = true)
    private void isSameAxis__1019445771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1019445771L))
            info.setReturnValue(false);
    }


}
