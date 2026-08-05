package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.OldUsersConverter.class)
public class OldUsersConverter_2025957199Mixin {
        @Inject(at = @At("HEAD"), method = "convertIpBanlist(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertIpBanlist__526770764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526770764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "areOldUserlistsRemoved()Z", cancellable = true)
    private static void areOldUserlistsRemoved_2064236029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064236029L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertUserBanlist(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertUserBanlist__526770764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526770764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertOpsList(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertOpsList__526770764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526770764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertWhiteList(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertWhiteList__526770764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526770764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertPlayers(Lnet/minecraft/server/dedicated/DedicatedServer;)Z", cancellable = true)
    private static void convertPlayers__936062126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936062126L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertMobOwnerIfNecessary(Lnet/minecraft/server/MinecraftServer;Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private static void convertMobOwnerIfNecessary_248468536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(248468536L))
            info.setReturnValue(null);
    }


}
