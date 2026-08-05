package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.slot.SlotCollection.Limited.class)
public class Limited2058138498Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1149512230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149512230L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1466405273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1466405273L))
            info.setReturnValue("-Wa}/5M3\u3509pa-agj'|o{\u3E3Coj6x\u4D3D'x&$ RBT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1679476707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1679476707L))
            info.setReturnValue(1985879300);
    }

    @Inject(at = @At("HEAD"), method = "limit()I", cancellable = true)
    private void limit_256006797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256006797L))
            info.setReturnValue(-726184369);
    }

    @Inject(at = @At("HEAD"), method = "limit(I)Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void limit__422158150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422158150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slots()Lnet/minecraft/world/item/slot/SlotCollection;", cancellable = true)
    private void slots__648104157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648104157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "itemCopies()Ljava/util/stream/Stream;", cancellable = true)
    private void itemCopies_472395249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472395249L))
            info.setReturnValue(null);
    }


}
