package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.UUIDUtil.class)
public class UUIDUtil_141250471Mixin {
        @Inject(at = @At("HEAD"), method = "readUUID(Lcom/mojang/serialization/Dynamic;)Ljava/util/UUID;", cancellable = true)
    private static void readUUID_1854987844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854987844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuidFromIntArray([I)Ljava/util/UUID;", cancellable = true)
    private static void uuidFromIntArray_1578497586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578497586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOfflinePlayerUUID(Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private static void createOfflinePlayerUUID_1525263850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525263850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuidToIntArray(Ljava/util/UUID;)[I", cancellable = true)
    private static void uuidToIntArray_1827249015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827249015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOfflineProfile(Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private static void createOfflineProfile__517901106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517901106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuidToByteArray(Ljava/util/UUID;)[B", cancellable = true)
    private static void uuidToByteArray_864369867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(864369867L))
            info.setReturnValue(null);
    }


}
