package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.SlotCollection.Filtered.class)
public class Filtered_1573775255Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_665148986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665148986L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1950768517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950768517L))
            info.setReturnValue("jRjY%1ky\u8329<-68\uAE99D\u8437,I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2131127345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131127345L))
            info.setReturnValue(-1969727377);
    }

    @Inject(at = @At("HEAD"), method = "filter(Ljava/util/function/Predicate;)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void filter__868877173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-868877173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter()Ljava/util/function/Predicate;", cancellable = true)
    private void filter__20881444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-20881444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void slots__1132467401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132467401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopies__11967995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-11967995L))
            info.setReturnValue(null);
    }


}
