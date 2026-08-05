package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.SetGameRules.class)
public class SetGameRules1211347597Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1698107440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698107440L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_75887622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75887622L))
            info.setReturnValue("PnTMwq\u2DDDOh\u250A\u13C1/eh<$v/mw9|`,\uD41Dck>0<$dSI\uB82A\u8E57TyA*MH\u7391}G9EiBqZb9\u5F1Dv\u8AF7[qI.\uC90D\u2DB1OiXdW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1249610339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249610339L))
            info.setReturnValue(-2045239435);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void setup_1275574042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275574042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__1498428873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1498428873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/gamerules/GameRuleMap;)V", cancellable = true)
    private void teardown_1616082782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616082782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__1606089171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1606089171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1347765975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1347765975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameRulesMap()Lnet/minecraft/world/level/gamerules/GameRuleMap;", cancellable = true)
    private void gameRulesMap_57695049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(57695049L))
            info.setReturnValue(null);
    }


}
