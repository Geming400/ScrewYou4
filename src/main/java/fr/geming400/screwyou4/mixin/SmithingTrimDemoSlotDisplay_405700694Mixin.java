package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.SmithingTrimDemoSlotDisplay.class)
public class SmithingTrimDemoSlotDisplay_405700694Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void base__821377005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821377005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_610911700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610911700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__502925575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-502925575L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1176124218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1176124218L))
            info.setReturnValue("&;`oKjFOW!/{(\u4038jf}p\"/2jN\u4D14I*>;Sha`M!A3>^q-R7@p$W&$\uB316&1$\u3367\u7891F-tc8\uC079");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_963052784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963052784L))
            info.setReturnValue(-1467106956);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pattern_1852709569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852709569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__2090273319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090273319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "material()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void material__1673987075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673987075L))
            info.setReturnValue(null);
    }


}
