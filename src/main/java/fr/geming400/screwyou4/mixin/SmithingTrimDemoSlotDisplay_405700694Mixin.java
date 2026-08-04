package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.SmithingTrimDemoSlotDisplay.class)
public class SmithingTrimDemoSlotDisplay_405700694Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void base_1142654340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142654340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1120536218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120536218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1791212952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791212952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__729759282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-729759282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_443963435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443963435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pattern_1954576465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954576465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__1176414995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176414995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "material()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void material_1142654340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142654340L))
            info.setReturnValue(null);
    }


}
