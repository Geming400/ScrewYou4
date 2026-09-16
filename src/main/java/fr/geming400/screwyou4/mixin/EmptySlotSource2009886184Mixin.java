package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.EmptySlotSource.class)
public class EmptySlotSource2009886184Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1101259916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101259916L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1514657587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514657587L))
            info.setReturnValue("Ko^D52\u55D7w\u3D07(f\uBE60\u471EgmZ8se5.\u4BCA&peF{-g\uB695d\uBA1FE\u6650L.\u1E62_|VBZzO6ca/=i@\u3D6E W@2\uAE04,X\u72D6,a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1727729021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727729021L))
            info.setReturnValue(-789322422);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1218635858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218635858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provide(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void provide__1350563338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350563338L))
            info.setReturnValue(null);
    }


}
