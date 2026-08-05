package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.BeaconMenu.class)
public class BeaconMenu1403573717Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed_2068767395(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2068767395L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevels()I", cancellable = true)
    private void getLevels__906220938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906220938L))
            info.setReturnValue(-1348216633);
    }

    @Inject(at = @At("HEAD"), method = "setData(II)V", cancellable = true)
    private void setData__855203076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-855203076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_80744913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(80744913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decodeEffect(I)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void decodeEffect_154856225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(154856225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateEffects(Ljava/util/Optional;Ljava/util/Optional;)Z", cancellable = true)
    private void updateEffects_1148911889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1148911889L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "encodeEffect(Lnet/minecraft/core/Holder;)I", cancellable = true)
    private static void encodeEffect__507274295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507274295L))
            info.setReturnValue(-441583195);
    }

    @Inject(at = @At("HEAD"), method = "getPrimaryEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getPrimaryEffect__1253386316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253386316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSecondaryEffect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getSecondaryEffect_723144194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723144194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__630337453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630337453L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasPayment()Z", cancellable = true)
    private void hasPayment_2008341760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008341760L))
            info.setReturnValue(true);
    }


}
