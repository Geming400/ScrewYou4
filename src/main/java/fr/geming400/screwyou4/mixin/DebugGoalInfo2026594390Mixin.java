package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGoalInfo.class)
public class DebugGoalInfo2026594390Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1117968122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1117968122L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1497949381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497949381L))
            info.setReturnValue("=\u203EPKLB ] fG\u0662`\u12F7\u7978guX:5F\uCA6B:;'I6?iPOq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1711020815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711020815L))
            info.setReturnValue(-524744872);
    }

    @Inject(at = @At("HEAD"), method = "goals()Ljava/util/List;", cancellable = true)
    private void goals__742174138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742174138L))
            info.setReturnValue(null);
    }


}
