package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Score.class)
public class Score_1888452284Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_1926714529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926714529L))
            info.setReturnValue(1069963754);
    }

    @Inject(at = @At("HEAD"), method = "value(I)V", cancellable = true)
    private void value__1192598041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1192598041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void display__12726654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-12726654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void display__288456882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-288456882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isLocked()Z", cancellable = true)
    private void isLocked_1926730866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926730866L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat(Lnet/minecraft/network/chat/numbers/NumberFormat;)V", cancellable = true)
    private void numberFormat__1539408194(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1539408194L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormat__1442190024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442190024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/scores/Score$Packed;", cancellable = true)
    private void pack__1209196008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209196008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLocked(Z)V", cancellable = true)
    private void setLocked__1176898184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1176898184L))
            info.cancel();
    }


}
