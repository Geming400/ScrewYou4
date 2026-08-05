package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemStackTemplate.class)
public class ItemStackTemplate1962133009Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_1799040604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799040604L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__947322028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-947322028L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_826673034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826673034L))
            info.setReturnValue("C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2000395751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000395751L))
            info.setReturnValue(373444733);
    }

    @Inject(at = @At("HEAD"), method = "apply(ILnet/minecraft/core/component/DataComponentPatch;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void apply_1977381178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977381178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/core/component/DataComponentPatch;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void apply__1371943103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1371943103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_2000395255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2000395255L))
            info.setReturnValue(576592152);
    }

    @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void create__1809415627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1809415627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "item()Lnet/minecraft/core/Holder;", cancellable = true)
    private void item__783958515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783958515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "components()Lnet/minecraft/core/component/DataComponentPatch;", cancellable = true)
    private void components_236958386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236958386L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder__783958515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783958515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromStack(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void fromStack_650060302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650060302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNonEmptyStack(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private static void fromNonEmptyStack_650060302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650060302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withCount(I)Lnet/minecraft/world/item/ItemStackTemplate;", cancellable = true)
    private void withCount_1042081346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042081346L))
            info.setReturnValue(null);
    }


}
