package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.DisplayInfo.class)
public class DisplayInfo1571793730Mixin {
        @Inject(at = @At("HEAD"), method = "isHidden()Z", cancellable = true)
    private void isHidden__735069691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735069691L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/advancements/AdvancementType;", cancellable = true)
    private void getType__1053444434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053444434L))
            info.setReturnValue(net.minecraft.advancements.AdvancementType.CHALLENGE);
    }

    @Inject(at = @At("HEAD"), method = "getY()F", cancellable = true)
    private void getY__1819739134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1819739134L))
            info.setReturnValue(3.422134E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription_1127849755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127849755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()F", cancellable = true)
    private void getX__1848368285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848368285L))
            info.setReturnValue(3.422134E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTitle_1976470007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976470007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLocation(FF)V", cancellable = true)
    private void setLocation__853043554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-853043554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIcon()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void getIcon_2044283003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044283003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackground()Ljava/util/Optional;", cancellable = true)
    private void getBackground_1524497940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524497940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldShowToast()Z", cancellable = true)
    private void shouldShowToast_1525954210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525954210L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldAnnounceChat()Z", cancellable = true)
    private void shouldAnnounceChat_1177476293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1177476293L))
            info.setReturnValue(false);
    }


}
