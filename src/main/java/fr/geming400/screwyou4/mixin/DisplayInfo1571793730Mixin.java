package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.DisplayInfo.class)
public class DisplayInfo1571793730Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden()Z", cancellable = true)
    private void isHidden_1610072313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610072313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/advancements/AdvancementType;", cancellable = true)
    private void getType_1367334654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367334654L))
            info.setReturnValue(net.minecraft.advancements.AdvancementType.GOAL);
    }

    @Inject(at = @At("HEAD"), method = "getY()F", cancellable = true)
    private void getY_1610053093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610053093L))
            info.setReturnValue(4.254343E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__605115435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605115435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()F", cancellable = true)
    private void getX_1610053093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610053093L))
            info.setReturnValue(4.254343E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBackground()Ljava/util/Optional;", cancellable = true)
    private void getBackground_1817255152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817255152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldAnnounceChat()Z", cancellable = true)
    private void shouldAnnounceChat_1610072313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610072313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldShowToast()Z", cancellable = true)
    private void shouldShowToast_1610072313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1610072313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle__605115435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605115435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLocation(FF)V", cancellable = true)
    private void setLocation_487256245(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(487256245L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIcon()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getIcon__969286260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969286260L))
            info.setReturnValue(null);
    }


}
