package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Score.class)
public class Score_1888452284Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__416218672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416218672L))
            info.setReturnValue(748154151);
    }

    @Inject(at = @At("HEAD"), method = "value(I)V", cancellable = true)
    private void value__809083240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-809083240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void display__2021552000(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2021552000L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void display__768899696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-768899696L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_640570398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640570398L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat(Lnet/minecraft/network/chat/numbers/NumberFormat;)V", cancellable = true)
    private void numberFormat_867511134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(867511134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormat__256168808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256168808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/scores/Score$Packed;", cancellable = true)
    private void pack_1562170527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562170527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLocked(Z)V", cancellable = true)
    private void setLocked_905430660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(905430660L))
            info.cancel();
    }


}
