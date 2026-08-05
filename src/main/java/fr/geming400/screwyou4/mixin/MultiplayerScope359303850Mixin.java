package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.MinecraftServer.MultiplayerScope.class)
public class MultiplayerScope359303850Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/MinecraftServer$MultiplayerScope;", cancellable = true)
    private static void values_1849578729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849578729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/MinecraftServer$MultiplayerScope;", cancellable = true)
    private static void valueOf_1538284930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538284930L))
            info.setReturnValue(net.minecraft.server.MinecraftServer.MultiplayerScope.OFF);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1539716020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539716020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltip()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTooltip__1821735222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821735222L))
            info.setReturnValue(null);
    }


}
