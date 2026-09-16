package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.DefaultPlayerSkin.class)
public class DefaultPlayerSkin1335430961Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/util/UUID;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void get_879483048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879483048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void get__2000502397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000502397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getDefaultTexture_418712576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(418712576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void getDefaultSkin__1158923186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1158923186L))
            info.setReturnValue(null);
    }


}
