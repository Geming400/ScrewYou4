package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugGoalInfo.DebugGoal.class)
public class DebugGoal_1567365792Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1918334349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918334349L))
            info.setReturnValue("HK!+<PGsh @=M;&X>O;GZF)!:4/=$");
    }

    @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority__1939219103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939219103L))
            info.setReturnValue(-992804758);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_658739523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658739523L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1957177980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957177980L))
            info.setReturnValue("]K(\u82CCP\uB7A9e\u5D68rL7\u1BA7O3:CBf$6\uB315k,aL\uA3D4jz3,{u3<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2124717882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124717882L))
            info.setReturnValue(687472039);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1593232449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1593232449L))
            info.setReturnValue(true);
    }


}
