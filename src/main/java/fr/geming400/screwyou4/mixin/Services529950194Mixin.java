package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.Services.class)
public class Services529950194Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__378676074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378676074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1300373719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1300373719L))
            info.setReturnValue("MslKv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1087302285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1087302285L))
            info.setReturnValue(-1276593944);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/authlib/yggdrasil/YggdrasilAuthenticationService;Ljava/io/File;)Lnet/minecraft/server/Services;", cancellable = true)
    private static void create__1255998451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255998451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canValidateProfileKeys()Z", cancellable = true)
    private void canValidateProfileKeys__845287502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-845287502L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sessionService()Lcom/mojang/authlib/minecraft/MinecraftSessionService;", cancellable = true)
    private void sessionService__1818415850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818415850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameToIdCache()Lnet/minecraft/server/players/UserNameToIdResolver;", cancellable = true)
    private void nameToIdCache_315010286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315010286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileRepository()Lcom/mojang/authlib/GameProfileRepository;", cancellable = true)
    private void profileRepository_1683368115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683368115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "servicesKeySet()Lcom/mojang/authlib/yggdrasil/ServicesKeySet;", cancellable = true)
    private void servicesKeySet__41061568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-41061568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileResolver()Lnet/minecraft/server/players/ProfileResolver;", cancellable = true)
    private void profileResolver__2057996907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2057996907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileKeySignatureValidator()Lnet/minecraft/util/SignatureValidator;", cancellable = true)
    private void profileKeySignatureValidator__477053197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-477053197L))
            info.setReturnValue(null);
    }


}
