package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.EmptySlotSource.class)
public class EmptySlotSource2009886184Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__899568853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899568853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_874426209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874426209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2048148926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048148926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__549227388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549227388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provide(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void provide__256326635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256326635L))
            info.setReturnValue(null);
    }


}
