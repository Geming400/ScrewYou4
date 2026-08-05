package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.ItemStackSlotDisplay.class)
public class ItemStackSlotDisplay1990195343Mixin {
        @Inject(at = @At("HEAD"), method = "stack()Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void stack__550884647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550884647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__1589936428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589936428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__919259694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919259694L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_854735368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854735368L))
            info.setReturnValue("iHVs{W\uB2B8MUd-TzdLsiZ+fCVgUbNJk26i7h&fL\u309D80 BC\u5D80o,Oy");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2028458085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2028458085L))
            info.setReturnValue(488012149);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve_408079655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(408079655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_560425963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560425963L))
            info.setReturnValue(true);
    }


}
