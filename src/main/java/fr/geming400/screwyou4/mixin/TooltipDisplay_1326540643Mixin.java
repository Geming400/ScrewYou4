package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.TooltipDisplay.class)
public class TooltipDisplay_1326540643Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1582914395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582914395L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_191080667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191080667L))
            info.setReturnValue("\uBEC9B}e4/Q];G<iop\u5716QC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1364803384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364803384L))
            info.setReturnValue(-1521042149);
    }

    @Inject(at = @At("HEAD"), method = "hiddenComponents()Ljava/util/SequencedSet;", cancellable = true)
    private void hiddenComponents__839275279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839275279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hideTooltip()Z", cancellable = true)
    private void hideTooltip_1364819225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1364819225L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "withHidden(Lnet/minecraft/core/component/DataComponentType;Z)Lnet/minecraft/world/item/component/TooltipDisplay;", cancellable = true)
    private void withHidden__1632875548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632875548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shows(Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private void shows_1967957097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1967957097L))
            info.setReturnValue(true);
    }


}
