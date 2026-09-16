package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueInput.UnexpectedNonNumberProblem.class)
public class UnexpectedNonNumberProblem_520835253Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1330102408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1330102408L))
            info.setReturnValue("?xg\u9BF6%hD\"\uF9A9)r-\u4B78XWx0lC-ZC\uAC82khpxF!;>3NCD!]A\u2966m%I>G\u763E>W;{iY]4F4 G'KK%qS\uFEABB\u9280|,JwPgzv?&`pY\uCA3E e{Tq&We1u");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__387791016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387791016L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1291258777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291258777L))
            info.setReturnValue("@C8c8FYk`\">,XrX+<[\uC2BB(Ptk\u9E96\u944CUXi,\uC92C;h\uB3FF}H\"qVw.jgDl8<\u1A3F[IrY{_:DR6?ldG&w3D,5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1078187343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078187343L))
            info.setReturnValue(1699789493);
    }

    @Inject(at = @At("HEAD"), method = "actual()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void actual__2024148231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2024148231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__653152455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653152455L))
            info.setReturnValue("");
    }


}
