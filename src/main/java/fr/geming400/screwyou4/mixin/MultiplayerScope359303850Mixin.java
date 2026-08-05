package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.MinecraftServer.MultiplayerScope.class)
public class MultiplayerScope359303850Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/MinecraftServer$MultiplayerScope;", cancellable = true)
    private static void values_634054343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634054343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/MinecraftServer$MultiplayerScope;", cancellable = true)
    private static void valueOf__1365983318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365983318L))
            info.setReturnValue(net.minecraft.server.MinecraftServer.MultiplayerScope.LAN);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1817605315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817605315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTooltip()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTooltip__1817605315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817605315L))
            info.setReturnValue(null);
    }


}
