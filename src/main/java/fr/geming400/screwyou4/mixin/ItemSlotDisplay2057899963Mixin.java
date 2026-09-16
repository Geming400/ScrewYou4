package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.ItemSlotDisplay.class)
public class ItemSlotDisplay2057899963Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__2031856326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031856326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1149273695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149273695L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1466643808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466643808L))
            info.setReturnValue("ZG\uB8F5PyF\u63712s8#e2'y2uU9%DB\uF91F<LWCq;:iiCpq9{4LF?49M1\u6F84f>|1or`W{**^d[\u5AD3[{f\u3E203;26dO1fl;l#qEM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1679715242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679715242L))
            info.setReturnValue(1727201270);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__438074049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-438074049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled_816000398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816000398L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item_1525606980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1525606980L))
            info.setReturnValue(null);
    }


}
