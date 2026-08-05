package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.AllOf.class)
public class AllOf1348312082Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_439685814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(439685814L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2118735607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118735607L))
            info.setReturnValue("gdyD2m[kKEa`i\u5C6Ch_{,YOm-LM&F\uB0A5Z7.@{U Om.FL\u1504<O\uAD88&V\u768DmU\u1CDE\u02CE<5K\"U\uCB9A,T\u0C4C#`*)W\u256A!\uBD46G\"_/Bd X\uC866u6m\uB50A\u374D&\u7992'\u3792\u5D03gy<}!\uC4DB4a:2y0N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1905664173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1905664173L))
            info.setReturnValue(1658603679);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__681049735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681049735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/util/List;", cancellable = true)
    private void setup_1410827598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1410827598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/util/List;)V", cancellable = true)
    private void teardown__1143429693(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1143429693L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown_1971640622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1971640622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "definitions()Ljava/util/List;", cancellable = true)
    private void definitions__1558626366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1558626366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1880209960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880209960L))
            info.setReturnValue(null);
    }


}
