package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.RangeSlotSource.class)
public class RangeSlotSource794802632Mixin {
        @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1574305860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1574305860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1861247886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861247886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provide(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void provide_1729320902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1729320902L))
            info.setReturnValue(null);
    }


}
