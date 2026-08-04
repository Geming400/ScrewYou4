package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.LootTableProvider.SubProviderEntry.class)
public class SubProviderEntry1366840384Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1542614653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1542614653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_231380409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(231380409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1405103126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405103126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "provider()Ljava/util/function/Function;", cancellable = true)
    private void provider__559332363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559332363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "paramSet()Lnet/minecraft/util/context/ContextKeySet;", cancellable = true)
    private void paramSet_1849596725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1849596725L))
            info.setReturnValue(null);
    }


}
