package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.BeaconMenu.class)
public class BeaconMenu1403573717Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1950791933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1950791933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevels()I", cancellable = true)
    private void getLevels_1441835963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441835963L))
            info.setReturnValue(1378909915);
    }

    @Inject(at = @At("HEAD"), method = "decodeEffect(I)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void decodeEffect__1450796542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1450796542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encodeEffect(Lnet/minecraft/core/Holder;)I", cancellable = true)
    private static void encodeEffect__1344930686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344930686L))
            info.setReturnValue(1914313327);
    }

    @Inject(at = @At("HEAD"), method = "getSecondaryEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSecondaryEffect__1342517807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342517807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPrimaryEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getPrimaryEffect__1342517807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342517807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateEffects(Ljava/util/Optional;Ljava/util/Optional;)Z", cancellable = true)
    private void updateEffects_2004186218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004186218L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setData(II)V", cancellable = true)
    private void setData_407694248(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(407694248L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1950788089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950788089L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasPayment()Z", cancellable = true)
    private void hasPayment_1441852300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441852300L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__2017697829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2017697829L))
            info.setReturnValue(null);
    }


}
