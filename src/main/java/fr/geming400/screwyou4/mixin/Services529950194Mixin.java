package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.Services.class)
public class Services529950194Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1915462453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915462453L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__605509781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605509781L))
            info.setReturnValue("H#,N?Z=|dQഢO7O/_pVrUVY;n5=P>+?jd\"2(Qaqkjo`3P)j<a6;)(Q+%#_Z`u8x");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_568212936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568212936L))
            info.setReturnValue(1068209429);
    }

    @Inject(at = @At("HEAD"), method = "create(Lcom/mojang/authlib/yggdrasil/YggdrasilAuthenticationService;Ljava/io/File;)Lnet/minecraft/server/Services;", cancellable = true)
    private static void create_1737856017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737856017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nameToIdCache()Lnet/minecraft/server/players/UserNameToIdResolver;", cancellable = true)
    private void nameToIdCache_1601817583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1601817583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileResolver()Lnet/minecraft/server/players/ProfileResolver;", cancellable = true)
    private void profileResolver_1028617862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028617862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileKeySignatureValidator()Lnet/minecraft/util/SignatureValidator;", cancellable = true)
    private void profileKeySignatureValidator_2019902723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019902723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canValidateProfileKeys()Z", cancellable = true)
    private void canValidateProfileKeys_568228777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568228777L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sessionService()Lcom/mojang/authlib/minecraft/MinecraftSessionService;", cancellable = true)
    private void sessionService_595108503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595108503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "servicesKeySet()Lcom/mojang/authlib/yggdrasil/ServicesKeySet;", cancellable = true)
    private void servicesKeySet_1660563617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660563617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileRepository()Lcom/mojang/authlib/GameProfileRepository;", cancellable = true)
    private void profileRepository_976773152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976773152L))
            info.setReturnValue(null);
    }


}
