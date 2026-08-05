package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRules.class)
public class GameRules101776471Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/Object;", cancellable = true)
    private void get_602552077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602552077L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "copy(Lnet/minecraft/world/flag/FeatureFlagSet;)Lnet/minecraft/world/level/gamerules/GameRules;", cancellable = true)
    private void copy__78315242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78315242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/world/level/gamerules/GameRule;Ljava/lang/Object;Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void set_495782230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(495782230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/world/level/gamerules/GameRule;", cancellable = true)
    private static void bootstrap__1733919523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733919523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/world/level/gamerules/GameRules;Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void setAll_1842294488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842294488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAll(Lnet/minecraft/world/level/gamerules/GameRuleMap;Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void setAll__334359377(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-334359377L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAsString(Lnet/minecraft/world/level/gamerules/GameRule;)Ljava/lang/String;", cancellable = true)
    private void getAsString__613074818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-613074818L))
            info.setReturnValue("LL");
    }

    @Inject(at = @At("HEAD"), method = "codec(Lnet/minecraft/world/flag/FeatureFlagSet;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__644730118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644730118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitGameRuleTypes(Lnet/minecraft/world/level/gamerules/GameRuleTypeVisitor;)V", cancellable = true)
    private void visitGameRuleTypes__1663313183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1663313183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "availableRules()Ljava/util/stream/Stream;", cancellable = true)
    private void availableRules_781729758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781729758L))
            info.setReturnValue(null);
    }


}
