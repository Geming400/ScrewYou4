package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.DyedSlotDemo.class)
public class DyedSlotDemo399720629Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_1114556154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114556154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1785232888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785232888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void target_1136674276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136674276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__735739346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735739346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_437983371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437983371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__1182395059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182395059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dye()Lnet/minecraft/world/item/crafting/display/SlotDisplay;", cancellable = true)
    private void dye_1136674276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136674276L))
            info.setReturnValue(null);
    }


}
