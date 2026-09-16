package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.Timelines.class)
public class Timelines1892222604Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_983596336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983596336L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1632321167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632321167L))
            info.setReturnValue("Qw\u3FEA19[Al]wP,6\u6DAFIx}&\uCF0F[lX-\u2E09cZ\u4FD6\u3C94F0JN\uB405Tdd;N");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1845392601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845392601L))
            info.setReturnValue(-179763572);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__137139213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137139213L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;", cancellable = true)
    private void setup_1557643466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557643466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__1779416152(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1779416152L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/attribute/EnvironmentAttributeSystem;)V", cancellable = true)
    private void teardown_1930938047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1930938047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1336299438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336299438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timelines()Ljava/util/List;", cancellable = true)
    private void timelines_800541710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800541710L))
            info.setReturnValue(null);
    }


}
