package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.SlotCollection.FlatMapped.class)
public class FlatMapped1819439838Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_910813570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(910813570L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1705103933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1705103933L))
            info.setReturnValue("(@I[Pm{M8g/}A^\uF9AB'.GJ;p\uD22Dfm\u1AC2-g3?|H|@ty!E\uA641%O=7WHc\uCB9A0ja\u54EC1\uBC36tu,tbU1j1X-KLfzxW`2M");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1918175367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918175367L))
            info.setReturnValue(-908318831);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void slots__886802817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-886802817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapper()Ljava/util/function/Function;", cancellable = true)
    private void mapper__1340592014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340592014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopies_233696589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(233696589L))
            info.setReturnValue(null);
    }


}
