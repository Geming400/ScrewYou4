package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.PackRepository.class)
public class PackRepository183127427Mixin {
        @Inject(at = @At("HEAD"), method = "reload()V", cancellable = true)
    private void reload_157674045(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(157674045L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAvailable(Ljava/lang/String;)Z", cancellable = true)
    private void isAvailable__1973466203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1973466203L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "openAllSelected()Ljava/util/List;", cancellable = true)
    private void openAllSelected__1555030683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555030683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedIds()Ljava/util/Collection;", cancellable = true)
    private void getSelectedIds_1282342938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282342938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Ljava/util/Collection;)V", cancellable = true)
    private void setSelected__1850845014(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1850845014L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAbleToClearAnyPack()Z", cancellable = true)
    private void isAbleToClearAnyPack_23402915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23402915L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "displayPackList(Ljava/util/Collection;)Ljava/lang/String;", cancellable = true)
    private static void displayPackList_293708332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(293708332L))
            info.setReturnValue("\u95C1#XE2M^G[]xVw\u93C5Ds@z\u8535:U\u60BDc)\u1FA5Ls\u7029ua4z]_I=BVw6yt5\u2ADAIXE7[LDNB\u6893t\u4F1DOzH^K+4bz9tmxrZ{\u5680\uC0ABHdE.\uFF98WG g\\");
    }

    @Inject(at = @At("HEAD"), method = "getSelectedPacks()Ljava/util/Collection;", cancellable = true)
    private void getSelectedPacks__1040720740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040720740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableIds()Ljava/util/Collection;", cancellable = true)
    private void getAvailableIds__260240552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-260240552L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailablePacks()Ljava/util/Collection;", cancellable = true)
    private void getAvailablePacks__1699737510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699737510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRequestedFeatureFlags()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void getRequestedFeatureFlags_867265836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867265836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPack(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/Pack;", cancellable = true)
    private void getPack__534705787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534705787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePack(Ljava/lang/String;)Z", cancellable = true)
    private void removePack_1677594087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677594087L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addPack(Ljava/lang/String;)Z", cancellable = true)
    private void addPack__706387030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706387030L))
            info.setReturnValue(true);
    }


}
