package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.LootTableProvider.SubProviderEntry.class)
public class SubProviderEntry1366840384Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_458214116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458214116L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2137263909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137263909L))
            info.setReturnValue("M\u341Du\u4C7EZ\u6994eU|m#\u90D9$10\u54B55");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1924192475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1924192475L))
            info.setReturnValue(1688862466);
    }

    @Inject(at = @At("HEAD"), method = "provider()Ljava/util/function/Function;", cancellable = true)
    private void provider_2009169956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009169956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paramSet()Lnet/minecraft/util/context/ContextKeySet;", cancellable = true)
    private void paramSet_651305738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(651305738L))
            info.setReturnValue(null);
    }


}
