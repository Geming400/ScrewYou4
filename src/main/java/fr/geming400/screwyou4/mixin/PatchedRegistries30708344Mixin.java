package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySetBuilder.PatchedRegistries.class)
public class PatchedRegistries30708344Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1416220603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416220603L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1104751631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104751631L))
            info.setReturnValue("\u43B3:n\u2266h*d'\u88C4\u740BmC_Mg9S 5tPQU ][d\u6B6F8PW{S/J{M|Wj7=}0#(+xLZ!PSqD]3Quc+\u4A4Bh\uB0817|.9tFG5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_68971086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(68971086L))
            info.setReturnValue(1927044043);
    }

    @Inject(at = @At("HEAD"), method = "patches()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void patches__282498989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282498989L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "full()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void full__282498989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-282498989L))
            info.setReturnValue(null);
    }


}
