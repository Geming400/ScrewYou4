package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.SetDifficulty.class)
public class SetDifficulty523914551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1909426810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909426810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__611545424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-611545424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_562177293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562177293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup_2109105377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109105377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void setup__1228797080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228797080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown_2001445079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2001445079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void teardown_482117086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482117086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2035199021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035199021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty__547838119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547838119L))
            info.setReturnValue(null);
    }


}
