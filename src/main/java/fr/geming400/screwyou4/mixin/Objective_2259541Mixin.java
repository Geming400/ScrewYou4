package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Objective.class)
public class Objective_2259541Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1133200931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133200931L))
            info.setReturnValue("<}Lz&`6mpxAzqiIh.Si,\uCACBN\u97A1tA}]$R\uBE08;gPJ5=iy{j\u2B8C=Z\u2BADk\u27EF\u9C2ET]qJuKSw");
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName_2120317671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120317671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormat_966584529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(966584529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setNumberFormat(Lnet/minecraft/network/chat/numbers/NumberFormat;)V", cancellable = true)
    private void setNumberFormat_869366359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(869366359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/scores/Objective$Packed;", cancellable = true)
    private void pack__1191658344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191658344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void getRenderType__1617310573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617310573L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.HEARTS);
    }

    @Inject(at = @At("HEAD"), method = "getScoreboard()Lnet/minecraft/world/scores/Scoreboard;", cancellable = true)
    private void getScoreboard__978985913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-978985913L))
            info.setReturnValue(new net.minecraft.world.scores.Scoreboard());
    }

    @Inject(at = @At("HEAD"), method = "numberFormatOrDefault(Lnet/minecraft/network/chat/numbers/NumberFormat;)Lnet/minecraft/network/chat/numbers/NumberFormat;", cancellable = true)
    private void numberFormatOrDefault_2026766881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026766881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDisplayAutoUpdate(Z)V", cancellable = true)
    private void setDisplayAutoUpdate_1231876369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1231876369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFormattedDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getFormattedDisplayName_2120317671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120317671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDisplayName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setDisplayName__1898919397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1898919397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCriteria()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;", cancellable = true)
    private void getCriteria_471678611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(471678611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "displayAutoUpdate()Z", cancellable = true)
    private void displayAutoUpdate_40538123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40538123L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRenderType(Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;)V", cancellable = true)
    private void setRenderType_1586843719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1586843719L))
            info.cancel();
    }


}
