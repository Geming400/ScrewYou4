package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.UUIDUtil.class)
public class UUIDUtil_141250471Mixin {
        @Inject(at = @At("HEAD"), method = "createOfflinePlayerUUID(Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private static void createOfflinePlayerUUID__1769191065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769191065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUUID(Lcom/mojang/serialization/Dynamic;)Ljava/util/UUID;", cancellable = true)
    private static void readUUID_1948441267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948441267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuidToIntArray(Ljava/util/UUID;)[I", cancellable = true)
    private static void uuidToIntArray_1941238295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941238295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuidFromIntArray([I)Ljava/util/UUID;", cancellable = true)
    private static void uuidFromIntArray_2081278627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081278627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuidToByteArray(Ljava/util/UUID;)[B", cancellable = true)
    private static void uuidToByteArray_1941231568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941231568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOfflineProfile(Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private static void createOfflineProfile_281415660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281415660L))
            info.setReturnValue(null);
    }


}
