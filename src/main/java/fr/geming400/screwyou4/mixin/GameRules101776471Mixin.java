package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRules.class)
public class GameRules101776471Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void get__203820361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203820361L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "copy(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/level/gamerules/GameRules;", cancellable = true)
    private void copy_1083804449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1083804449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void set_30269176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(30269176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/level/gamerules/GameRule;", cancellable = true)
    private static void bootstrap_1306281227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306281227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/world/level/gamerules/GameRules;Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void setAll__33882695(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-33882695L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/world/level/gamerules/GameRuleMap;Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void setAll_545632080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(545632080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAsString(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/String;", cancellable = true)
    private void getAsString_1096494245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096494245L))
            info.setReturnValue("\"c,$k%\u911E?O@E%^ZNH\u60CD2X=/i4%vbH!wa3G;%8dIt0HAjc=z;0fx\uFA89A\"e]HZ)\u791CfG?.8E)32$}+gaf{:\u4A66VL%MP_,C[66WAt@2)l.");
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/world/flag/FeatureFlagSet;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1151483728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1151483728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitGameRuleTypes(Lnet/minecraft/world/level/gamerules/GameRuleTypeVisitor;)V", cancellable = true)
    private void visitGameRuleTypes_2091184993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091184993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "availableRules()Ljava/util/stream/Stream;", cancellable = true)
    private void availableRules__108929844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108929844L))
            info.setReturnValue(null);
    }


}
