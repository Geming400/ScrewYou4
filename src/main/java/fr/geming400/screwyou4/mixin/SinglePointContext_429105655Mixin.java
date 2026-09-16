package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.DensityFunction.SinglePointContext.class)
public class SinglePointContext_429105655Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__479520614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479520614L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1199529179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199529179L))
            info.setReturnValue("\uA588{lXX(J37n2MJybf.se\u972C&\u1ABE\u2C40{F&9[r0\u461A!y\u1DCARA?M%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_986457745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986457745L))
            info.setReturnValue(-40767264);
    }

    @Inject(at = @At("HEAD"), method = "blockY()I", cancellable = true)
    private void blockY_1413361136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413361136L))
            info.setReturnValue(-206681433);
    }

    @Inject(at = @At("HEAD"), method = "blockX()I", cancellable = true)
    private void blockX_1384731985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384731985L))
            info.setReturnValue(1401730993);
    }

    @Inject(at = @At("HEAD"), method = "blockZ()I", cancellable = true)
    private void blockZ_1441990287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441990287L))
            info.setReturnValue(2111666945);
    }


}
