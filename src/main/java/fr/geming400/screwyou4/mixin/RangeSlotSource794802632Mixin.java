package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.RangeSlotSource.class)
public class RangeSlotSource794802632Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1764310940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764310940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provide(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void provide__1471409691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471409691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1034232854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034232854L))
            info.setReturnValue(null);
    }


}
