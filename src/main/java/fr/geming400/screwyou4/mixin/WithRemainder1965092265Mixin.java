package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.WithRemainder.class)
public class WithRemainder1965092265Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__2124664024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124664024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1056465997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1056465997L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1559451506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559451506L))
            info.setReturnValue("Zd\u3DB7ktE`O\u3C37g<wc7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1772522940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772522940L))
            info.setReturnValue(1500475212);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__530881747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530881747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_723192700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723192700L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void input__347163442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347163442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remainder()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void remainder_1293516179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293516179L))
            info.setReturnValue(null);
    }


}
