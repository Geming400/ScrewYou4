package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugBreezeInfo.class)
public class DebugBreezeInfo1511564254Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1397890783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1397890783L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_376104279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376104279L))
            info.setReturnValue("MDMuLx{`F+XZdR9VX]H>RS'asWz[B(aRxj>pp]C;K⣭xd펷H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1549826996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549826996L))
            info.setReturnValue(-2074173392);
    }

    @Inject(at = @At("HEAD"), method = "jumpTarget()Ljava/util/Optional;", cancellable = true)
    private void jumpTarget_1757025676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757025676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attackTarget()Ljava/util/Optional;", cancellable = true)
    private void attackTarget_1757025676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757025676L))
            info.setReturnValue(null);
    }


}
