package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugPathInfo.class)
public class DebugPathInfo_708857880Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__199768389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-199768389L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1479281404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479281404L))
            info.setReturnValue("mK)^jhq'\uB95A\u4039..\u41E7{mR]3 #\uBB685\u2611?@!S\uACEBfie6I.^\u4861Kf=A-=d\uCF1B\u6913iKk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1266209970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1266209970L))
            info.setReturnValue(2075642550);
    }

    @Inject(at = @At("HEAD"), method = "path()Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void path__2032430231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032430231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxNodeDistance()F", cancellable = true)
    private void maxNodeDistance_2136482815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136482815L))
            info.setReturnValue(2.325661E8F);
    }


}
