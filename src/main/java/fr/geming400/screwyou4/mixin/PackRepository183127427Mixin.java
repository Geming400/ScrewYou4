package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.PackRepository.class)
public class PackRepository183127427Mixin {
        @Inject(at = @At("HEAD"), method = "reload()V", cancellable = true)
    private void reload_221402166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(221402166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAvailable(Ljava/lang/String;)Z", cancellable = true)
    private void isAvailable_1335492420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335492420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPack(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/Pack;", cancellable = true)
    private void getPack__459039050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459039050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPack(Ljava/lang/String;)Z", cancellable = true)
    private void addPack_1335492420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335492420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "removePack(Ljava/lang/String;)Z", cancellable = true)
    private void removePack_1335492420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335492420L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Ljava/util/Collection;)V", cancellable = true)
    private void setSelected_1634448359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1634448359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "openAllSelected()Ljava/util/List;", cancellable = true)
    private void openAllSelected_1809464243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809464243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedIds()Ljava/util/Collection;", cancellable = true)
    private void getSelectedIds__1630520845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630520845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAbleToClearAnyPack()Z", cancellable = true)
    private void isAbleToClearAnyPack_221406010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221406010L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "displayPackList(Ljava/util/Collection;)Ljava/lang/String;", cancellable = true)
    private static void displayPackList_1474979443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474979443L))
            info.setReturnValue("v|몰n矵0Z7n2X50{:-+a᱈>䩮5}d9V鷞[䎶Kngc+M쑲MuSFmyh1uq-9.5ɺ[*4⋹T:x4㦲mJhF4DBJL");
    }

    @Inject(at = @At("HEAD"), method = "getSelectedPacks()Ljava/util/Collection;", cancellable = true)
    private void getSelectedPacks__1630520845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630520845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRequestedFeatureFlags()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void getRequestedFeatureFlags_847947925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847947925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailablePacks()Ljava/util/Collection;", cancellable = true)
    private void getAvailablePacks__1630520845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630520845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailableIds()Ljava/util/Collection;", cancellable = true)
    private void getAvailableIds__1630520845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630520845L))
            info.setReturnValue(null);
    }


}
