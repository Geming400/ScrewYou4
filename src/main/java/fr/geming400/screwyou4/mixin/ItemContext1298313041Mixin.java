package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.InteractionResult.ItemContext.class)
public class ItemContext1298313041Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_389686773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389686773L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2068736566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068736566L))
            info.setReturnValue("W\u13DBs\u7E53TKO96\u9222L;Tpv\uFF4EFhjt,lynvLZAfa0\u9536bCBW\u6423JUA\u2DE6M\u8AEAlMB09\u7EBB\u8E28GkE}A>/=uZTvU\u339Ci,VY}@C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1855665132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855665132L))
            info.setReturnValue(246731719);
    }

    @Inject(at = @At("HEAD"), method = "heldItemTransformedTo()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void heldItemTransformedTo__1879137453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879137453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wasItemInteraction()Z", cancellable = true)
    private void wasItemInteraction__1183278094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1183278094L))
            info.setReturnValue(true);
    }


}
