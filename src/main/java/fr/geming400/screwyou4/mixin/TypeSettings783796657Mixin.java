package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.RecipeBookSettings.TypeSettings.class)
public class TypeSettings783796657Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2125658380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2125658380L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__351663814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351663814L))
            info.setReturnValue("!( Y$Pl]}L67銬Ag겡BW%[^3躇0u4M6|a!]Z}*vㆭB)k휨|Ꭸ#aJ@RWroBU3<Qtf*");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_822059399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822059399L))
            info.setReturnValue(640824425);
    }

    @Inject(at = @At("HEAD"), method = "open()Z", cancellable = true)
    private void open_822075240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822075240L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "filtering()Z", cancellable = true)
    private void filtering_822075240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822075240L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFiltering(Z)Lnet/minecraft/stats/RecipeBookSettings$TypeSettings;", cancellable = true)
    private void setFiltering_130002620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130002620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOpen(Z)Lnet/minecraft/stats/RecipeBookSettings$TypeSettings;", cancellable = true)
    private void setOpen_130002620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130002620L))
            info.setReturnValue(null);
    }


}
