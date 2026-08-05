package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.DefaultPlayerSkin.class)
public class DefaultPlayerSkin1335430961Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/util/UUID;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void get__779454766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779454766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void get_1019464621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1019464621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private static void getDefaultSkin__316889050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316889050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getDefaultTexture__1107635344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107635344L))
            info.setReturnValue(null);
    }


}
