package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.DyedSlotDemo.class)
public class DyedSlotDemo399720629Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_604931636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604931636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__508905639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-508905639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void target__965909069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-965909069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1170144154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170144154L))
            info.setReturnValue("V\u6329cCGL|%\u4B5B!9q\u8E1D_ 2xh$qM%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_957072720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957072720L))
            info.setReturnValue(1148465834);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__2096253383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096253383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dye()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void dye__1388578444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388578444L))
            info.setReturnValue(null);
    }


}
