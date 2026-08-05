package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.SlotCollection.Limited.class)
public class Limited2058138498Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__851316539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851316539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_922678523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922678523L))
            info.setReturnValue("\u5B3A,j7iR");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2096401240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096401240L))
            info.setReturnValue(-564406660);
    }

    @Inject(at = @At("HEAD"), method = "limit()I", cancellable = true)
    private void limit_2096400744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096400744L))
            info.setReturnValue(-385883171);
    }

    @Inject(at = @At("HEAD"), method = "limit(I)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void limit__1620653995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620653995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void slots__355747794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-355747794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopies_1847432183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1847432183L))
            info.setReturnValue(null);
    }


}
