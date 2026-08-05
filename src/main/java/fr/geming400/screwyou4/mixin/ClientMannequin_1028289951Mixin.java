package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.entity.ClientMannequin.class)
public class ClientMannequin_1028289951Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1066564689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066564689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "belowNameDisplay()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void belowNameDisplay__1148619215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1148619215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1620927902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1620927902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "avatarState()Lnet/minecraft/client/entity/ClientAvatarState;", cancellable = true)
    private void avatarState_1773460817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773460817L))
            info.setReturnValue(new net.minecraft.client.entity.ClientAvatarState());
    }

    @Inject(at = @At("HEAD"), method = "registerOverrides(Lnet/minecraft/client/renderer/PlayerSkinRenderCache;)V", cancellable = true)
    private static void registerOverrides__1794593650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794593650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showExtraEars()Z", cancellable = true)
    private void showExtraEars_1066568533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1066568533L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getParrotVariantOnShoulder(Z)Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;", cancellable = true)
    private void getParrotVariantOnShoulder__1484989516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484989516L))
            info.setReturnValue(net.minecraft.world.entity.animal.parrot.Parrot.Variant.RED_BLUE);
    }

    @Inject(at = @At("HEAD"), method = "getSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void getSkin__624030309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624030309L))
            info.setReturnValue(null);
    }


}
