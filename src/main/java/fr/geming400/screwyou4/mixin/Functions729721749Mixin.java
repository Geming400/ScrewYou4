package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Functions.class)
public class Functions729721749Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__178904519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-178904519L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1500145274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500145274L))
            info.setReturnValue("Q0;{|=Q=*Px3Z!\uB77Fz\u6EE2KMW$Ffsm\u96CFG@#\uFF3BtS9rSaW{\u5846Dw_\u59C2XJ-=I<mC\"+alcXBa\u20DAA\u015D-w\u8B67}Lv3>;N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1287073840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1287073840L))
            info.setReturnValue(-366487167);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void setup_1904265296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904265296L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__1299640068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1299640068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/Unit;)V", cancellable = true)
    private void teardown__1561213387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1561213387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown_1353050289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1353050289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1796167003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796167003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardownFunction()Ljava/util/Optional;", cancellable = true)
    private void teardownFunction_1776280383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1776280383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setupFunction()Ljava/util/Optional;", cancellable = true)
    private void setupFunction__835546184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-835546184L))
            info.setReturnValue(null);
    }


}
