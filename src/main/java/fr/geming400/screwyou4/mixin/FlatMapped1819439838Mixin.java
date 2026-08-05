package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.SlotCollection.FlatMapped.class)
public class FlatMapped1819439838Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1090015199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1090015199L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_683979863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(683979863L))
            info.setReturnValue("$v)9#,X^Eg5+3⭩#G`>U&Zg)X⼻KjK3솛uL⛙.Pc?瓻v鍭M嬷xtn# 龲㬫X2tMR/V{k!kvw.D}፷BdVꂬ\"贐v^>@E頏zo9hZCQ&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1857702580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1857702580L))
            info.setReturnValue(1010375726);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void slots__594446454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594446454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapper()Ljava/util/function/Function;", cancellable = true)
    private void mapper__106732909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106732909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopies_1608733523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608733523L))
            info.setReturnValue(null);
    }


}
