package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.players.OldUsersConverter.class)
public class OldUsersConverter_2025957199Mixin {
        @Inject(at = @At("HEAD"), method = "convertMobOwnerIfNecessary(Lnet/minecraft/server/MinecraftServer;Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private static void convertMobOwnerIfNecessary__1773224284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773224284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertUserBanlist(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertUserBanlist_2058558245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058558245L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertWhiteList(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertWhiteList__1977828032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977828032L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertOpsList(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertOpsList__1993427881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993427881L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertPlayers(Lnet/minecraft/server/dedicated/DedicatedServer;)Z", cancellable = true)
    private static void convertPlayers__1017042893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1017042893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertIpBanlist(Lnet/minecraft/server/MinecraftServer;)Z", cancellable = true)
    private static void convertIpBanlist_334689857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334689857L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "areOldUserlistsRemoved()Z", cancellable = true)
    private static void areOldUserlistsRemoved_145250292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145250292L))
            info.setReturnValue(true);
    }


}
