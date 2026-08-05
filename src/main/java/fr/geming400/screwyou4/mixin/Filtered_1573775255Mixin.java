package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.SlotCollection.Filtered.class)
public class Filtered_1573775255Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1335679783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1335679783L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_438315279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438315279L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1612037996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612037996L))
            info.setReturnValue(1207644317);
    }

    @Inject(at = @At("HEAD"), method = "filter(Ljava/util/function/Predicate;)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void filter__132456173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-132456173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filter()Ljava/util/function/Predicate;", cancellable = true)
    private void filter_923890276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923890276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void slots__840111038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840111038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopies_1363068939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1363068939L))
            info.setReturnValue(null);
    }


}
