package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.LootContext.VisitedEntry.class)
public class VisitedEntry1864220933Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/storage/loot/LootDataType;", cancellable = true)
    private void type__623914612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623914612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/level/storage/loot/Validatable;", cancellable = true)
    private void value_947286642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(947286642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_955594665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955594665L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1660322838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1660322838L))
            info.setReturnValue("\uBC47;waYb84\uFA0By\uB04E#k,v[l}hdqyBCMu^;)6h-Vsjqb&u\u95E95d9\uCF6Crye(m7n)cU+\uFBF2\uBAED=\u4F9CkM9Vs,^Xdud\u6050v.\u1F44=cZGkVa/M/_5Z-UWmFEq{PXx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1873394272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1873394272L))
            info.setReturnValue(-2037746503);
    }


}
