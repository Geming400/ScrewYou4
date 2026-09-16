package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.HashedStack.ActualItem.class)
public class ActualItem1783819096Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_875192828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(875192828L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1740724675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740724675L))
            info.setReturnValue(")If%]y\u62B8=LdwtM-_\u661B2\u9C65rcze >`H,Xg6}5Y\u50B5:l,`!J>dpsi`j\uC6BEdR}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1953796109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953796109L))
            info.setReturnValue(930757601);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/network/HashedPatchMap$HashGenerator;)Z", cancellable = true)
    private void matches_1754513497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754513497L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_695648655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695648655L))
            info.setReturnValue(862233680);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item_1251526113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1251526113L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/network/HashedPatchMap;", cancellable = true)
    private void components_2778918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2778918L))
            info.setReturnValue(null);
    }


}
