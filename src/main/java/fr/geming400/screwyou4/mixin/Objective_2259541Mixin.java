package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Objective.class)
public class Objective_2259541Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1886587362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886587362L))
            info.setReturnValue("\u51E4{KS|+tM6");
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_1182671710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1182671710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormat__2142361551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142361551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNumberFormat(Lnet/minecraft/network/chat/numbers/NumberFormat;)V", cancellable = true)
    private void setNumberFormat_806043385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806043385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/scores/Objective$Packed;", cancellable = true)
    private void pack_40752031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40752031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormatOrDefault(Lnet/minecraft/network/chat/numbers/NumberFormat;)Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormatOrDefault__1670969921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670969921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard__134998403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-134998403L))
            info.setReturnValue(new net.minecraft.world.scores.Scoreboard());
    }

    @Inject(at = @At("HEAD"), method = "setDisplayAutoUpdate(Z)V", cancellable = true)
    private void setDisplayAutoUpdate_250787977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(250787977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCriteria()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private void getCriteria__422586210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422586210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayAutoUpdate()Z", cancellable = true)
    private void displayAutoUpdate__1916803439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916803439L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRenderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void getRenderType__1727178247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727178247L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }

    @Inject(at = @At("HEAD"), method = "setDisplayName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setDisplayName__1925604208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1925604208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFormattedDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getFormattedDisplayName__805970258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-805970258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRenderType(Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;)V", cancellable = true)
    private void setRenderType__208937963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-208937963L))
            info.cancel();
    }


}
