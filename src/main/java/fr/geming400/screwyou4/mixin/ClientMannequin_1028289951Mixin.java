package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.entity.ClientMannequin.class)
public class ClientMannequin_1028289951Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_898606292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(898606292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "belowNameDisplay()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void belowNameDisplay__2042612361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042612361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_1735024298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1735024298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showExtraEars()Z", cancellable = true)
    private void showExtraEars__1824567355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824567355L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void getSkin__2146215730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146215730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getParrotVariantOnShoulder(Z)Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private void getParrotVariantOnShoulder__223433332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223433332L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.GRAY);
    }

    @Inject(at = @At("HEAD"), method = "avatarState()Lnet/minecraft/client/entity/ClientAvatarState;", cancellable = true)
    private void avatarState__1686925415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686925415L))
            info.setReturnValue(new net.minecraft.client.entity.ClientAvatarState());
    }

    @Inject(at = @At("HEAD"), method = "registerOverrides(Lnet/minecraft/client/renderer/PlayerSkinRenderCache;)V", cancellable = true)
    private static void registerOverrides__284490158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-284490158L))
            info.cancel();
    }


}
