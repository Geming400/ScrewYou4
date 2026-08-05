package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.PlayerScoreEntry.class)
public class PlayerScoreEntry_56013535Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_94275780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94275780L))
            info.setReturnValue(-93925296);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1441525793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441525793L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1079446441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079446441L))
            info.setReturnValue("GWg삲 /LaUa>9u#80g컏NHK>DaF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_94276276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94276276L))
            info.setReturnValue(-271447185);
    }

    @Inject(at = @At("HEAD"), method = "isHidden()Z", cancellable = true)
    private void isHidden_94292117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(94292117L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner__1079446937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079446937L))
            info.setReturnValue("鞫EX.LC!RHJb੫$kH)磊\"-Y(F");
    }

    @Inject(at = @At("HEAD"), method = "display()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void display__2120895631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120895631L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "formatValue(Lnet/minecraft/network/chat/numbers/NumberFormat;)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void formatValue_1403107769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403107769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormatOverride()Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormatOverride_1020338523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020338523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ownerName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void ownerName__2120895631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120895631L))
            info.setReturnValue(null);
    }


}
